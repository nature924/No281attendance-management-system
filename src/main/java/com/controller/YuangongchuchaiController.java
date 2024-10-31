
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
 * 员工出差
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yuangongchuchai")
public class YuangongchuchaiController {
    private static final Logger logger = LoggerFactory.getLogger(YuangongchuchaiController.class);

    private static final String TABLE_NAME = "yuangongchuchai";

    @Autowired
    private YuangongchuchaiService yuangongchuchaiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DanganService danganService;//档案
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private MenuService menuService;//菜单
    @Autowired
    private QiandaoService qiandaoService;//员工签到
    @Autowired
    private XinziService xinziService;//薪资
    @Autowired
    private YuangongService yuangongService;//员工
    @Autowired
    private YuangongqingjiaService yuangongqingjiaService;//员工请假
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = yuangongchuchaiService.queryPage(params);

        //字典表数据转换
        List<YuangongchuchaiView> list =(List<YuangongchuchaiView>)page.getList();
        for(YuangongchuchaiView c:list){
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
        YuangongchuchaiEntity yuangongchuchai = yuangongchuchaiService.selectById(id);
        if(yuangongchuchai !=null){
            //entity转view
            YuangongchuchaiView view = new YuangongchuchaiView();
            BeanUtils.copyProperties( yuangongchuchai , view );//把实体数据重构到view中
            //级联表 员工
            //级联表
            YuangongEntity yuangong = yuangongService.selectById(yuangongchuchai.getYuangongId());
            if(yuangong != null){
            BeanUtils.copyProperties( yuangong , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yuangongId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYuangongId(yuangong.getId());
            }
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
    public R save(@RequestBody YuangongchuchaiEntity yuangongchuchai, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yuangongchuchai:{}",this.getClass().getName(),yuangongchuchai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("员工".equals(role))
            yuangongchuchai.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<YuangongchuchaiEntity> queryWrapper = new EntityWrapper<YuangongchuchaiEntity>()
            .eq("yuangong_id", yuangongchuchai.getYuangongId())
            .eq("yuangongchuchai_name", yuangongchuchai.getYuangongchuchaiName())
            .eq("yuangongchuchai_address", yuangongchuchai.getYuangongchuchaiAddress())
            .eq("yuangongchuchai_types", yuangongchuchai.getYuangongchuchaiTypes())
            .eq("yuangongchuchai_jiaotonggongju_types", yuangongchuchai.getYuangongchuchaiJiaotonggongjuTypes())
            .in("yuangongchuchai_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YuangongchuchaiEntity yuangongchuchaiEntity = yuangongchuchaiService.selectOne(queryWrapper);
        if(yuangongchuchaiEntity==null){
            yuangongchuchai.setInsertTime(new Date());
            yuangongchuchai.setYuangongchuchaiYesnoTypes(1);
            yuangongchuchai.setCreateTime(new Date());
            yuangongchuchaiService.insert(yuangongchuchai);
            return R.ok();
        }else {
            if(yuangongchuchaiEntity.getYuangongchuchaiYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(yuangongchuchaiEntity.getYuangongchuchaiYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YuangongchuchaiEntity yuangongchuchai, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,yuangongchuchai:{}",this.getClass().getName(),yuangongchuchai.toString());
        YuangongchuchaiEntity oldYuangongchuchaiEntity = yuangongchuchaiService.selectById(yuangongchuchai.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("员工".equals(role))
//            yuangongchuchai.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(yuangongchuchai.getYuangongchuchaiText()) || "null".equals(yuangongchuchai.getYuangongchuchaiText())){
                yuangongchuchai.setYuangongchuchaiText(null);
        }
        if("".equals(yuangongchuchai.getYuangongchuchaiYesnoText()) || "null".equals(yuangongchuchai.getYuangongchuchaiYesnoText())){
                yuangongchuchai.setYuangongchuchaiYesnoText(null);
        }

            yuangongchuchaiService.updateById(yuangongchuchai);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody YuangongchuchaiEntity yuangongchuchaiEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,yuangongchuchaiEntity:{}",this.getClass().getName(),yuangongchuchaiEntity.toString());

        YuangongchuchaiEntity oldYuangongchuchai = yuangongchuchaiService.selectById(yuangongchuchaiEntity.getId());//查询原先数据

//        if(yuangongchuchaiEntity.getYuangongchuchaiYesnoTypes() == 2){//通过
//            yuangongchuchaiEntity.setYuangongchuchaiTypes();
//        }else if(yuangongchuchaiEntity.getYuangongchuchaiYesnoTypes() == 3){//拒绝
//            yuangongchuchaiEntity.setYuangongchuchaiTypes();
//        }
        yuangongchuchaiEntity.setYuangongchuchaiShenheTime(new Date());//审核时间
        yuangongchuchaiService.updateById(yuangongchuchaiEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<YuangongchuchaiEntity> oldYuangongchuchaiList =yuangongchuchaiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        yuangongchuchaiService.deleteBatchIds(Arrays.asList(ids));

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
            List<YuangongchuchaiEntity> yuangongchuchaiList = new ArrayList<>();//上传的东西
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
                            YuangongchuchaiEntity yuangongchuchaiEntity = new YuangongchuchaiEntity();
//                            yuangongchuchaiEntity.setYuangongId(Integer.valueOf(data.get(0)));   //员工 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiName(data.get(0));                    //出差标题 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiText(data.get(0));                    //出差缘由 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiAddress(data.get(0));                    //出差地点 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiTypes(Integer.valueOf(data.get(0)));   //出差类型 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiKaishiTime(sdf.parse(data.get(0)));          //出差开始时间 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiJieshuTime(sdf.parse(data.get(0)));          //出差结束时间 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiJiaotonggongjuTypes(Integer.valueOf(data.get(0)));   //交通工具 要改的
//                            yuangongchuchaiEntity.setYuzhiFeiyong(data.get(0));                    //预支费用 要改的
//                            yuangongchuchaiEntity.setInsertTime(date);//时间
//                            yuangongchuchaiEntity.setYuangongchuchaiYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiYesnoText(data.get(0));                    //处理意见 要改的
//                            yuangongchuchaiEntity.setYuangongchuchaiShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            yuangongchuchaiEntity.setCreateTime(date);//时间
                            yuangongchuchaiList.add(yuangongchuchaiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        yuangongchuchaiService.insertBatch(yuangongchuchaiList);
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

