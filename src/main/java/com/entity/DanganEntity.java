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
 * 档案
 *
 * @author 
 * @email
 */
@TableName("dangan")
public class DanganEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DanganEntity() {

	}

	public DanganEntity(T t) {
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
     * 档案编号
     */
    @ColumnInfo(comment="档案编号",type="varchar(200)")
    @TableField(value = "dangan_uuid_number")

    private String danganUuidNumber;


    /**
     * 员工姓名
     */
    @ColumnInfo(comment="员工姓名",type="varchar(200)")
    @TableField(value = "dangan_name")

    private String danganName;


    /**
     * 员工手机号
     */
    @ColumnInfo(comment="员工手机号",type="varchar(200)")
    @TableField(value = "dangan_phone")

    private String danganPhone;


    /**
     * 员工身份证号
     */
    @ColumnInfo(comment="员工身份证号",type="varchar(200)")
    @TableField(value = "dangan_id_number")

    private String danganIdNumber;


    /**
     * 员工照片
     */
    @ColumnInfo(comment="员工照片",type="varchar(200)")
    @TableField(value = "dangan_photo")

    private String danganPhoto;


    /**
     * 出生年月
     */
    @ColumnInfo(comment="出生年月",type="varchar(200)")
    @TableField(value = "dangan_chusheng")

    private String danganChusheng;


    /**
     * 附件
     */
    @ColumnInfo(comment="附件",type="varchar(200)")
    @TableField(value = "dangan_file")

    private String danganFile;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 邮箱
     */
    @ColumnInfo(comment="邮箱",type="varchar(200)")
    @TableField(value = "dangan_email")

    private String danganEmail;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="入职时间",type="timestamp")
    @TableField(value = "ruzhi_time")

    private Date ruzhiTime;


    /**
     * 学历情况
     */
    @ColumnInfo(comment="学历情况",type="longtext")
    @TableField(value = "dangan_xueli_content")

    private String danganXueliContent;


    /**
     * 实习情况
     */
    @ColumnInfo(comment="实习情况",type="longtext")
    @TableField(value = "dangan_shixi_content")

    private String danganShixiContent;


    /**
     * 工作情况
     */
    @ColumnInfo(comment="工作情况",type="longtext")
    @TableField(value = "dangan_gongzuo_content")

    private String danganGongzuoContent;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "dangan_beizhu_content")

    private String danganBeizhuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上传时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="最后更新时间",type="timestamp")
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
	 * 获取：档案编号
	 */
    public String getDanganUuidNumber() {
        return danganUuidNumber;
    }
    /**
	 * 设置：档案编号
	 */

    public void setDanganUuidNumber(String danganUuidNumber) {
        this.danganUuidNumber = danganUuidNumber;
    }
    /**
	 * 获取：员工姓名
	 */
    public String getDanganName() {
        return danganName;
    }
    /**
	 * 设置：员工姓名
	 */

    public void setDanganName(String danganName) {
        this.danganName = danganName;
    }
    /**
	 * 获取：员工手机号
	 */
    public String getDanganPhone() {
        return danganPhone;
    }
    /**
	 * 设置：员工手机号
	 */

    public void setDanganPhone(String danganPhone) {
        this.danganPhone = danganPhone;
    }
    /**
	 * 获取：员工身份证号
	 */
    public String getDanganIdNumber() {
        return danganIdNumber;
    }
    /**
	 * 设置：员工身份证号
	 */

    public void setDanganIdNumber(String danganIdNumber) {
        this.danganIdNumber = danganIdNumber;
    }
    /**
	 * 获取：员工照片
	 */
    public String getDanganPhoto() {
        return danganPhoto;
    }
    /**
	 * 设置：员工照片
	 */

    public void setDanganPhoto(String danganPhoto) {
        this.danganPhoto = danganPhoto;
    }
    /**
	 * 获取：出生年月
	 */
    public String getDanganChusheng() {
        return danganChusheng;
    }
    /**
	 * 设置：出生年月
	 */

    public void setDanganChusheng(String danganChusheng) {
        this.danganChusheng = danganChusheng;
    }
    /**
	 * 获取：附件
	 */
    public String getDanganFile() {
        return danganFile;
    }
    /**
	 * 设置：附件
	 */

    public void setDanganFile(String danganFile) {
        this.danganFile = danganFile;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：邮箱
	 */
    public String getDanganEmail() {
        return danganEmail;
    }
    /**
	 * 设置：邮箱
	 */

    public void setDanganEmail(String danganEmail) {
        this.danganEmail = danganEmail;
    }
    /**
	 * 获取：入职时间
	 */
    public Date getRuzhiTime() {
        return ruzhiTime;
    }
    /**
	 * 设置：入职时间
	 */

    public void setRuzhiTime(Date ruzhiTime) {
        this.ruzhiTime = ruzhiTime;
    }
    /**
	 * 获取：学历情况
	 */
    public String getDanganXueliContent() {
        return danganXueliContent;
    }
    /**
	 * 设置：学历情况
	 */

    public void setDanganXueliContent(String danganXueliContent) {
        this.danganXueliContent = danganXueliContent;
    }
    /**
	 * 获取：实习情况
	 */
    public String getDanganShixiContent() {
        return danganShixiContent;
    }
    /**
	 * 设置：实习情况
	 */

    public void setDanganShixiContent(String danganShixiContent) {
        this.danganShixiContent = danganShixiContent;
    }
    /**
	 * 获取：工作情况
	 */
    public String getDanganGongzuoContent() {
        return danganGongzuoContent;
    }
    /**
	 * 设置：工作情况
	 */

    public void setDanganGongzuoContent(String danganGongzuoContent) {
        this.danganGongzuoContent = danganGongzuoContent;
    }
    /**
	 * 获取：备注
	 */
    public String getDanganBeizhuContent() {
        return danganBeizhuContent;
    }
    /**
	 * 设置：备注
	 */

    public void setDanganBeizhuContent(String danganBeizhuContent) {
        this.danganBeizhuContent = danganBeizhuContent;
    }
    /**
	 * 获取：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
	 * 设置：最后更新时间
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
        return "Dangan{" +
            ", id=" + id +
            ", danganUuidNumber=" + danganUuidNumber +
            ", danganName=" + danganName +
            ", danganPhone=" + danganPhone +
            ", danganIdNumber=" + danganIdNumber +
            ", danganPhoto=" + danganPhoto +
            ", danganChusheng=" + danganChusheng +
            ", danganFile=" + danganFile +
            ", sexTypes=" + sexTypes +
            ", danganEmail=" + danganEmail +
            ", ruzhiTime=" + DateUtil.convertString(ruzhiTime,"yyyy-MM-dd") +
            ", danganXueliContent=" + danganXueliContent +
            ", danganShixiContent=" + danganShixiContent +
            ", danganGongzuoContent=" + danganGongzuoContent +
            ", danganBeizhuContent=" + danganBeizhuContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", updateTime=" + DateUtil.convertString(updateTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
