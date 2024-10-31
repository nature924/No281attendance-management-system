
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
 * 档案
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/dangan")
public class DanganController {
    private static final Logger logger = LoggerFactory.getLogger(DanganController.class);

    private static final String TABLE_NAME = "dangan";

    @Autowired
    private DanganService danganService;


    @Autowired
    private TokenService tokenService;

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
    private YuangongchuchaiService yuangongchuchaiService;//员工出差
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
        PageUtils page = danganService.queryPage(params);

        //字典表数据转换
        List<DanganView> list =(List<DanganView>)page.getList();
        for(DanganView c:list){
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
        DanganEntity dangan = danganService.selectById(id);
        if(dangan !=null){
            //entity转view
            DanganView view = new DanganView();
            BeanUtils.copyProperties( dangan , view );//把实体数据重构到view中
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
    public R save(@RequestBody DanganEntity dangan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,dangan:{}",this.getClass().getName(),dangan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<DanganEntity> queryWrapper = new EntityWrapper<DanganEntity>()
            .eq("dangan_name", dangan.getDanganName())
            .eq("dangan_phone", dangan.getDanganPhone())
            .eq("dangan_id_number", dangan.getDanganIdNumber())
            .eq("dangan_chusheng", dangan.getDanganChusheng())
            .eq("sex_types", dangan.getSexTypes())
            .eq("dangan_email", dangan.getDanganEmail())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DanganEntity danganEntity = danganService.selectOne(queryWrapper);
        if(danganEntity==null){
            dangan.setInsertTime(new Date());
            dangan.setCreateTime(new Date());
            danganService.insert(dangan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DanganEntity dangan, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,dangan:{}",this.getClass().getName(),dangan.toString());
        DanganEntity oldDanganEntity = danganService.selectById(dangan.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(dangan.getDanganPhoto()) || "null".equals(dangan.getDanganPhoto())){
                dangan.setDanganPhoto(null);
        }
        if("".equals(dangan.getDanganFile()) || "null".equals(dangan.getDanganFile())){
                dangan.setDanganFile(null);
        }
        if("".equals(dangan.getDanganXueliContent()) || "null".equals(dangan.getDanganXueliContent())){
                dangan.setDanganXueliContent(null);
        }
        if("".equals(dangan.getDanganShixiContent()) || "null".equals(dangan.getDanganShixiContent())){
                dangan.setDanganShixiContent(null);
        }
        if("".equals(dangan.getDanganGongzuoContent()) || "null".equals(dangan.getDanganGongzuoContent())){
                dangan.setDanganGongzuoContent(null);
        }
        if("".equals(dangan.getDanganBeizhuContent()) || "null".equals(dangan.getDanganBeizhuContent())){
                dangan.setDanganBeizhuContent(null);
        }
        dangan.setUpdateTime(new Date());

            danganService.updateById(dangan);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<DanganEntity> oldDanganList =danganService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        danganService.deleteBatchIds(Arrays.asList(ids));

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
            List<DanganEntity> danganList = new ArrayList<>();//上传的东西
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
                            DanganEntity danganEntity = new DanganEntity();
//                            danganEntity.setDanganUuidNumber(data.get(0));                    //档案编号 要改的
//                            danganEntity.setDanganName(data.get(0));                    //员工姓名 要改的
//                            danganEntity.setDanganPhone(data.get(0));                    //员工手机号 要改的
//                            danganEntity.setDanganIdNumber(data.get(0));                    //员工身份证号 要改的
//                            danganEntity.setDanganPhoto("");//详情和图片
//                            danganEntity.setDanganChusheng(data.get(0));                    //出生年月 要改的
//                            danganEntity.setDanganFile(data.get(0));                    //附件 要改的
//                            danganEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            danganEntity.setDanganEmail(data.get(0));                    //邮箱 要改的
//                            danganEntity.setRuzhiTime(sdf.parse(data.get(0)));          //入职时间 要改的
//                            danganEntity.setDanganXueliContent("");//详情和图片
//                            danganEntity.setDanganShixiContent("");//详情和图片
//                            danganEntity.setDanganGongzuoContent("");//详情和图片
//                            danganEntity.setDanganBeizhuContent("");//详情和图片
//                            danganEntity.setInsertTime(date);//时间
//                            danganEntity.setUpdateTime(sdf.parse(data.get(0)));          //最后更新时间 要改的
//                            danganEntity.setCreateTime(date);//时间
                            danganList.add(danganEntity);


                            //把要查询是否重复的字段放入map中
                                //档案编号
                                if(seachFields.containsKey("danganUuidNumber")){
                                    List<String> danganUuidNumber = seachFields.get("danganUuidNumber");
                                    danganUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> danganUuidNumber = new ArrayList<>();
                                    danganUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("danganUuidNumber",danganUuidNumber);
                                }
                                //员工手机号
                                if(seachFields.containsKey("danganPhone")){
                                    List<String> danganPhone = seachFields.get("danganPhone");
                                    danganPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> danganPhone = new ArrayList<>();
                                    danganPhone.add(data.get(0));//要改的
                                    seachFields.put("danganPhone",danganPhone);
                                }
                                //员工身份证号
                                if(seachFields.containsKey("danganIdNumber")){
                                    List<String> danganIdNumber = seachFields.get("danganIdNumber");
                                    danganIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> danganIdNumber = new ArrayList<>();
                                    danganIdNumber.add(data.get(0));//要改的
                                    seachFields.put("danganIdNumber",danganIdNumber);
                                }
                        }

                        //查询是否重复
                         //档案编号
                        List<DanganEntity> danganEntities_danganUuidNumber = danganService.selectList(new EntityWrapper<DanganEntity>().in("dangan_uuid_number", seachFields.get("danganUuidNumber")));
                        if(danganEntities_danganUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DanganEntity s:danganEntities_danganUuidNumber){
                                repeatFields.add(s.getDanganUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [档案编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //员工手机号
                        List<DanganEntity> danganEntities_danganPhone = danganService.selectList(new EntityWrapper<DanganEntity>().in("dangan_phone", seachFields.get("danganPhone")));
                        if(danganEntities_danganPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DanganEntity s:danganEntities_danganPhone){
                                repeatFields.add(s.getDanganPhone());
                            }
                            return R.error(511,"数据库的该表中的 [员工手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //员工身份证号
                        List<DanganEntity> danganEntities_danganIdNumber = danganService.selectList(new EntityWrapper<DanganEntity>().in("dangan_id_number", seachFields.get("danganIdNumber")));
                        if(danganEntities_danganIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DanganEntity s:danganEntities_danganIdNumber){
                                repeatFields.add(s.getDanganIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [员工身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        danganService.insertBatch(danganList);
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

