package com.entity.vo;

import com.entity.DanganEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 档案
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dangan")
public class DanganVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 档案编号
     */

    @TableField(value = "dangan_uuid_number")
    private String danganUuidNumber;


    /**
     * 员工姓名
     */

    @TableField(value = "dangan_name")
    private String danganName;


    /**
     * 员工手机号
     */

    @TableField(value = "dangan_phone")
    private String danganPhone;


    /**
     * 员工身份证号
     */

    @TableField(value = "dangan_id_number")
    private String danganIdNumber;


    /**
     * 员工照片
     */

    @TableField(value = "dangan_photo")
    private String danganPhoto;


    /**
     * 出生年月
     */

    @TableField(value = "dangan_chusheng")
    private String danganChusheng;


    /**
     * 附件
     */

    @TableField(value = "dangan_file")
    private String danganFile;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 邮箱
     */

    @TableField(value = "dangan_email")
    private String danganEmail;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "ruzhi_time")
    private Date ruzhiTime;


    /**
     * 学历情况
     */

    @TableField(value = "dangan_xueli_content")
    private String danganXueliContent;


    /**
     * 实习情况
     */

    @TableField(value = "dangan_shixi_content")
    private String danganShixiContent;


    /**
     * 工作情况
     */

    @TableField(value = "dangan_gongzuo_content")
    private String danganGongzuoContent;


    /**
     * 备注
     */

    @TableField(value = "dangan_beizhu_content")
    private String danganBeizhuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 最后更新时间
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
	 * 设置：档案编号
	 */
    public String getDanganUuidNumber() {
        return danganUuidNumber;
    }


    /**
	 * 获取：档案编号
	 */

    public void setDanganUuidNumber(String danganUuidNumber) {
        this.danganUuidNumber = danganUuidNumber;
    }
    /**
	 * 设置：员工姓名
	 */
    public String getDanganName() {
        return danganName;
    }


    /**
	 * 获取：员工姓名
	 */

    public void setDanganName(String danganName) {
        this.danganName = danganName;
    }
    /**
	 * 设置：员工手机号
	 */
    public String getDanganPhone() {
        return danganPhone;
    }


    /**
	 * 获取：员工手机号
	 */

    public void setDanganPhone(String danganPhone) {
        this.danganPhone = danganPhone;
    }
    /**
	 * 设置：员工身份证号
	 */
    public String getDanganIdNumber() {
        return danganIdNumber;
    }


    /**
	 * 获取：员工身份证号
	 */

    public void setDanganIdNumber(String danganIdNumber) {
        this.danganIdNumber = danganIdNumber;
    }
    /**
	 * 设置：员工照片
	 */
    public String getDanganPhoto() {
        return danganPhoto;
    }


    /**
	 * 获取：员工照片
	 */

    public void setDanganPhoto(String danganPhoto) {
        this.danganPhoto = danganPhoto;
    }
    /**
	 * 设置：出生年月
	 */
    public String getDanganChusheng() {
        return danganChusheng;
    }


    /**
	 * 获取：出生年月
	 */

    public void setDanganChusheng(String danganChusheng) {
        this.danganChusheng = danganChusheng;
    }
    /**
	 * 设置：附件
	 */
    public String getDanganFile() {
        return danganFile;
    }


    /**
	 * 获取：附件
	 */

    public void setDanganFile(String danganFile) {
        this.danganFile = danganFile;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：邮箱
	 */
    public String getDanganEmail() {
        return danganEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setDanganEmail(String danganEmail) {
        this.danganEmail = danganEmail;
    }
    /**
	 * 设置：入职时间
	 */
    public Date getRuzhiTime() {
        return ruzhiTime;
    }


    /**
	 * 获取：入职时间
	 */

    public void setRuzhiTime(Date ruzhiTime) {
        this.ruzhiTime = ruzhiTime;
    }
    /**
	 * 设置：学历情况
	 */
    public String getDanganXueliContent() {
        return danganXueliContent;
    }


    /**
	 * 获取：学历情况
	 */

    public void setDanganXueliContent(String danganXueliContent) {
        this.danganXueliContent = danganXueliContent;
    }
    /**
	 * 设置：实习情况
	 */
    public String getDanganShixiContent() {
        return danganShixiContent;
    }


    /**
	 * 获取：实习情况
	 */

    public void setDanganShixiContent(String danganShixiContent) {
        this.danganShixiContent = danganShixiContent;
    }
    /**
	 * 设置：工作情况
	 */
    public String getDanganGongzuoContent() {
        return danganGongzuoContent;
    }


    /**
	 * 获取：工作情况
	 */

    public void setDanganGongzuoContent(String danganGongzuoContent) {
        this.danganGongzuoContent = danganGongzuoContent;
    }
    /**
	 * 设置：备注
	 */
    public String getDanganBeizhuContent() {
        return danganBeizhuContent;
    }


    /**
	 * 获取：备注
	 */

    public void setDanganBeizhuContent(String danganBeizhuContent) {
        this.danganBeizhuContent = danganBeizhuContent;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：最后更新时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }


    /**
	 * 获取：最后更新时间
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
