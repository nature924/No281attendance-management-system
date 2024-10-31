package com.dao;

import com.entity.MenuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MenuView;

/**
 * 菜单 Dao 接口
 *
 * @author 
 */
public interface MenuDao extends BaseMapper<MenuEntity> {

   List<MenuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
