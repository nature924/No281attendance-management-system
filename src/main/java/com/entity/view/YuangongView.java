package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YuangongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 员工
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yuangong")
public class YuangongView extends YuangongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 性别的值
	*/
	@ColumnInfo(comment="性别的字典表值",type="varchar(200)")
	private String sexValue;
	/**
	* 部门的值
	*/
	@ColumnInfo(comment="部门的字典表值",type="varchar(200)")
	private String bumenValue;
	/**
	* 职位的值
	*/
	@ColumnInfo(comment="职位的字典表值",type="varchar(200)")
	private String zhiweiValue;
	/**
	* 账户状态的值
	*/
	@ColumnInfo(comment="账户状态的字典表值",type="varchar(200)")
	private String jinyongValue;




	public YuangongView() {

	}

	public YuangongView(YuangongEntity yuangongEntity) {
		try {
			BeanUtils.copyProperties(this, yuangongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 性别的值
	*/
	public String getSexValue() {
		return sexValue;
	}
	/**
	* 设置： 性别的值
	*/
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	//当前表的
	/**
	* 获取： 部门的值
	*/
	public String getBumenValue() {
		return bumenValue;
	}
	/**
	* 设置： 部门的值
	*/
	public void setBumenValue(String bumenValue) {
		this.bumenValue = bumenValue;
	}
	//当前表的
	/**
	* 获取： 职位的值
	*/
	public String getZhiweiValue() {
		return zhiweiValue;
	}
	/**
	* 设置： 职位的值
	*/
	public void setZhiweiValue(String zhiweiValue) {
		this.zhiweiValue = zhiweiValue;
	}
	//当前表的
	/**
	* 获取： 账户状态的值
	*/
	public String getJinyongValue() {
		return jinyongValue;
	}
	/**
	* 设置： 账户状态的值
	*/
	public void setJinyongValue(String jinyongValue) {
		this.jinyongValue = jinyongValue;
	}




	@Override
	public String toString() {
		return "YuangongView{" +
			", sexValue=" + sexValue +
			", bumenValue=" + bumenValue +
			", zhiweiValue=" + zhiweiValue +
			", jinyongValue=" + jinyongValue +
			"} " + super.toString();
	}
}
