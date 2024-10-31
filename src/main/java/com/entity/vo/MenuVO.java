package com.entity.vo;

import com.entity.MenuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 菜单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("menu")
public class MenuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 角色汉字
     */

    @TableField(value = "role_zh_name")
    private String roleZhName;


    /**
     * 角色表名
     */

    @TableField(value = "role_en_name")
    private String roleEnName;


    /**
     * 使用方向
     */

    @TableField(value = "direction")
    private String direction;


    /**
     * 一级菜单名称
     */

    @TableField(value = "yiji_menu_name")
    private String yijiMenuName;


    /**
     * 一级菜单图标
     */

    @TableField(value = "yiji_menu_icon")
    private String yijiMenuIcon;


    /**
     * 二级菜单
     */

    @TableField(value = "erji_menu")
    private String erjiMenu;


    /**
     * 备注
     */

    @TableField(value = "beizhu")
    private String beizhu;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "update_time")
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：角色汉字
	 */
    public String getRoleZhName() {
        return roleZhName;
    }


    /**
	 * 获取：角色汉字
	 */

    public void setRoleZhName(String roleZhName) {
        this.roleZhName = roleZhName;
    }
    /**
	 * 设置：角色表名
	 */
    public String getRoleEnName() {
        return roleEnName;
    }


    /**
	 * 获取：角色表名
	 */

    public void setRoleEnName(String roleEnName) {
        this.roleEnName = roleEnName;
    }
    /**
	 * 设置：使用方向
	 */
    public String getDirection() {
        return direction;
    }


    /**
	 * 获取：使用方向
	 */

    public void setDirection(String direction) {
        this.direction = direction;
    }
    /**
	 * 设置：一级菜单名称
	 */
    public String getYijiMenuName() {
        return yijiMenuName;
    }


    /**
	 * 获取：一级菜单名称
	 */

    public void setYijiMenuName(String yijiMenuName) {
        this.yijiMenuName = yijiMenuName;
    }
    /**
	 * 设置：一级菜单图标
	 */
    public String getYijiMenuIcon() {
        return yijiMenuIcon;
    }


    /**
	 * 获取：一级菜单图标
	 */

    public void setYijiMenuIcon(String yijiMenuIcon) {
        this.yijiMenuIcon = yijiMenuIcon;
    }
    /**
	 * 设置：二级菜单
	 */
    public String getErjiMenu() {
        return erjiMenu;
    }


    /**
	 * 获取：二级菜单
	 */

    public void setErjiMenu(String erjiMenu) {
        this.erjiMenu = erjiMenu;
    }
    /**
	 * 设置：备注
	 */
    public String getBeizhu() {
        return beizhu;
    }


    /**
	 * 获取：备注
	 */

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：更新时间
	 */

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
