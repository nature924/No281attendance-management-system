package com.dao;

import com.entity.YuangongqingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongqingjiaView;

/**
 * 员工请假 Dao 接口
 *
 * @author 
 */
public interface YuangongqingjiaDao extends BaseMapper<YuangongqingjiaEntity> {

   List<YuangongqingjiaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
