package com.entity.model;

import com.entity.DanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 档案
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DanganModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 档案编号
     */
    private String danganUuidNumber;


    /**
     * 员工姓名
     */
    private String danganName;


    /**
     * 员工手机号
     */
    private String danganPhone;


    /**
     * 员工身份证号
     */
    private String danganIdNumber;


    /**
     * 员工照片
     */
    private String danganPhoto;


    /**
     * 出生年月
     */
    private String danganChusheng;


    /**
     * 附件
     */
    private String danganFile;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 邮箱
     */
    private String danganEmail;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date ruzhiTime;


    /**
     * 学历情况
     */
    private String danganXueliContent;


    /**
     * 实习情况
     */
    private String danganShixiContent;


    /**
     * 工作情况
     */
    private String danganGongzuoContent;


    /**
     * 备注
     */
    private String danganBeizhuContent;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 最后更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date updateTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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

    }
