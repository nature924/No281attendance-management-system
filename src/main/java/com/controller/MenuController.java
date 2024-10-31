
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 菜单
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/menu")
public class MenuController {
    private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

    private static final String TABLE_NAME = "menu";

    @Autowired
    private MenuService menuService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DanganService danganService;//档案
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private QiandaoService qiandaoService;//员工签到
    @Autowired
    private XinziService xinziService;//薪资
    @Autowired
    private YuangongService yuangongService;//员工
    @Autowired
    private YuangongchuchaiService yuangongchuchaiService;//员工出差
    @Autowired
    private YuangongqingjiaService yuangongqingjiaService;//员工请假
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    @IgnoreAuth
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = menuService.queryPage(params);

        //字典表数据转换
        List<MenuView> list =(List<MenuView>)page.getList();
        for(MenuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MenuEntity menu = menuService.selectById(id);
        if(menu !=null){
            //entity转view
            MenuView view = new MenuView();
            BeanUtils.copyProperties( menu , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody MenuEntity menu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,menu:{}",this.getClass().getName(),menu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<MenuEntity> queryWrapper = new EntityWrapper<MenuEntity>()
            .eq("role_zh_name", menu.getRoleZhName())
            .eq("role_en_name", menu.getRoleEnName())
            .eq("direction", menu.getDirection())
            .eq("yiji_menu_name", menu.getYijiMenuName())
            .eq("yiji_menu_icon", menu.getYijiMenuIcon())
            .eq("erji_menu", menu.getErjiMenu())
            .eq("beizhu", menu.getBeizhu())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MenuEntity menuEntity = menuService.selectOne(queryWrapper);
        if(menuEntity==null){
            menu.setInsertTime(new Date());
            menu.setCreateTime(new Date());
            menuService.insert(menu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody MenuEntity menu, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,menu:{}",this.getClass().getName(),menu.toString());
        MenuEntity oldMenuEntity = menuService.selectById(menu.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        menu.setUpdateTime(new Date());

            menuService.updateById(menu);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<MenuEntity> oldMenuList =menuService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        menuService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yuangongId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<MenuEntity> menuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            MenuEntity menuEntity = new MenuEntity();
//                            menuEntity.setRoleZhName(data.get(0));                    //角色汉字 要改的
//                            menuEntity.setRoleEnName(data.get(0));                    //角色表名 要改的
//                            menuEntity.setDirection(data.get(0));                    //使用方向 要改的
//                            menuEntity.setYijiMenuName(data.get(0));                    //一级菜单名称 要改的
//                            menuEntity.setYijiMenuIcon(data.get(0));                    //一级菜单图标 要改的
//                            menuEntity.setErjiMenu(data.get(0));                    //二级菜单 要改的
//                            menuEntity.setBeizhu(data.get(0));                    //备注 要改的
//                            menuEntity.setInsertTime(date);//时间
//                            menuEntity.setUpdateTime(sdf.parse(data.get(0)));          //更新时间 要改的
//                            menuEntity.setCreateTime(date);//时间
                            menuList.add(menuEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        menuService.insertBatch(menuList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




}

