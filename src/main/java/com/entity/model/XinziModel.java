package com.entity.model;

import com.entity.XinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 薪资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yuangongId;


    /**
     * 薪资编号
     */
    private String xinziUuidNumber;


    /**
     * 月份
     */
    private String xinziMonth;


    /**
     * 基本工资
     */
    private Double jibenJine;


    /**
     * 奖金
     */
    private Double jiangjinJine;


    /**
     * 绩效
     */
    private Double jixiaoJine;


    /**
     * 补贴
     */
    private Double butieJine;


    /**
     * 实发
     */
    private Double shifaJine;


    /**
     * 备注
     */
    private String xinziContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 设置：员工
	 */
    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：薪资编号
	 */
    public String getXinziUuidNumber() {
        return xinziUuidNumber;
    }


    /**
	 * 设置：薪资编号
	 */
    public void setXinziUuidNumber(String xinziUuidNumber) {
        this.xinziUuidNumber = xinziUuidNumber;
    }
    /**
	 * 获取：月份
	 */
    public String getXinziMonth() {
        return xinziMonth;
    }


    /**
	 * 设置：月份
	 */
    public void setXinziMonth(String xinziMonth) {
        this.xinziMonth = xinziMonth;
    }
    /**
	 * 获取：基本工资
	 */
    public Double getJibenJine() {
        return jibenJine;
    }


    /**
	 * 设置：基本工资
	 */
    public void setJibenJine(Double jibenJine) {
        this.jibenJine = jibenJine;
    }
    /**
	 * 获取：奖金
	 */
    public Double getJiangjinJine() {
        return jiangjinJine;
    }


    /**
	 * 设置：奖金
	 */
    public void setJiangjinJine(Double jiangjinJine) {
        this.jiangjinJine = jiangjinJine;
    }
    /**
	 * 获取：绩效
	 */
    public Double getJixiaoJine() {
        return jixiaoJine;
    }


    /**
	 * 设置：绩效
	 */
    public void setJixiaoJine(Double jixiaoJine) {
        this.jixiaoJine = jixiaoJine;
    }
    /**
	 * 获取：补贴
	 */
    public Double getButieJine() {
        return butieJine;
    }


    /**
	 * 设置：补贴
	 */
    public void setButieJine(Double butieJine) {
        this.butieJine = butieJine;
    }
    /**
	 * 获取：实发
	 */
    public Double getShifaJine() {
        return shifaJine;
    }


    /**
	 * 设置：实发
	 */
    public void setShifaJine(Double shifaJine) {
        this.shifaJine = shifaJine;
    }
    /**
	 * 获取：备注
	 */
    public String getXinziContent() {
        return xinziContent;
    }


    /**
	 * 设置：备注
	 */
    public void setXinziContent(String xinziContent) {
        this.xinziContent = xinziContent;
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
