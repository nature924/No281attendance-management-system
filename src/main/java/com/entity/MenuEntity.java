package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 菜单
 *
 * @author 
 * @email
 */
@TableName("menu")
public class MenuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MenuEntity() {

	}

	public MenuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 角色汉字
     */
    @ColumnInfo(comment="角色汉字",type="varchar(200)")
    @TableField(value = "role_zh_name")

    private String roleZhName;


    /**
     * 角色表名
     */
    @ColumnInfo(comment="角色表名",type="varchar(200)")
    @TableField(value = "role_en_name")

    private String roleEnName;


    /**
     * 使用方向
     */
    @ColumnInfo(comment="使用方向",type="varchar(200)")
    @TableField(value = "direction")

    private String direction;


    /**
     * 一级菜单名称
     */
    @ColumnInfo(comment="一级菜单名称",type="varchar(200)")
    @TableField(value = "yiji_menu_name")

    private String yijiMenuName;


    /**
     * 一级菜单图标
     */
    @ColumnInfo(comment="一级菜单图标",type="varchar(200)")
    @TableField(value = "yiji_menu_icon")

    private String yijiMenuIcon;


    /**
     * 二级菜单
     */
    @ColumnInfo(comment="二级菜单",type="varchar(2000)")
    @TableField(value = "erji_menu")

    private String erjiMenu;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="varchar(200)")
    @TableField(value = "beizhu")

    private String beizhu;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="更新时间",type="timestamp")
    @TableField(value = "update_time",fill = FieldFill.UPDATE)

    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：角色汉字
	 */
    public String getRoleZhName() {
        return roleZhName;
    }
    /**
	 * 设置：角色汉字
	 */

    public void setRoleZhName(String roleZhName) {
        this.roleZhName = roleZhName;
    }
    /**
	 * 获取：角色表名
	 */
    public String getRoleEnName() {
        return roleEnName;
    }
    /**
	 * 设置：角色表名
	 */

    public void setRoleEnName(String roleEnName) {
        this.roleEnName = roleEnName;
    }
    /**
	 * 获取：使用方向
	 */
    public String getDirection() {
        return direction;
    }
    /**
	 * 设置：使用方向
	 */

    public void setDirection(String direction) {
        this.direction = direction;
    }
    /**
	 * 获取：一级菜单名称
	 */
    public String getYijiMenuName() {
        return yijiMenuName;
    }
    /**
	 * 设置：一级菜单名称
	 */

    public void setYijiMenuName(String yijiMenuName) {
        this.yijiMenuName = yijiMenuName;
    }
    /**
	 * 获取：一级菜单图标
	 */
    public String getYijiMenuIcon() {
        return yijiMenuIcon;
    }
    /**
	 * 设置：一级菜单图标
	 */

    public void setYijiMenuIcon(String yijiMenuIcon) {
        this.yijiMenuIcon = yijiMenuIcon;
    }
    /**
	 * 获取：二级菜单
	 */
    public String getErjiMenu() {
        return erjiMenu;
    }
    /**
	 * 设置：二级菜单
	 */

    public void setErjiMenu(String erjiMenu) {
        this.erjiMenu = erjiMenu;
    }
    /**
	 * 获取：备注
	 */
    public String getBeizhu() {
        return beizhu;
    }
    /**
	 * 设置：备注
	 */

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
	 * 设置：更新时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Menu{" +
            ", id=" + id +
            ", roleZhName=" + roleZhName +
            ", roleEnName=" + roleEnName +
            ", direction=" + direction +
            ", yijiMenuName=" + yijiMenuName +
            ", yijiMenuIcon=" + yijiMenuIcon +
            ", erjiMenu=" + erjiMenu +
            ", beizhu=" + beizhu +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", updateTime=" + DateUtil.convertString(updateTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
