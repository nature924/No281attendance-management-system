package com.dao;

import com.entity.YuangongchuchaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongchuchaiView;

/**
 * 员工出差 Dao 接口
 *
 * @author 
 */
public interface YuangongchuchaiDao extends BaseMapper<YuangongchuchaiEntity> {

   List<YuangongchuchaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
