package com.entity.model;

import com.entity.YuangongqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 员工请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuangongqingjiaModel implements Serializable {
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
     * 请假缘由
     */
    private String yuangongqingjiaText;


    /**
     * 请假类型
     */
    private Integer yuangongqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuangongqingjiaTime;


    /**
     * 请假天数
     */
    private Integer yuangongqingjiaNumber;


    /**
     * 申请状态
     */
    private Integer yuangongqingjiaYesnoTypes;


    /**
     * 处理意见
     */
    private String yuangongqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuangongqingjiaShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：请假缘由
	 */
    public String getYuangongqingjiaText() {
        return yuangongqingjiaText;
    }


    /**
	 * 设置：请假缘由
	 */
    public void setYuangongqingjiaText(String yuangongqingjiaText) {
        this.yuangongqingjiaText = yuangongqingjiaText;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getYuangongqingjiaTypes() {
        return yuangongqingjiaTypes;
    }


    /**
	 * 设置：请假类型
	 */
    public void setYuangongqingjiaTypes(Integer yuangongqingjiaTypes) {
        this.yuangongqingjiaTypes = yuangongqingjiaTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getYuangongqingjiaTime() {
        return yuangongqingjiaTime;
    }


    /**
	 * 设置：请假时间
	 */
    public void setYuangongqingjiaTime(Date yuangongqingjiaTime) {
        this.yuangongqingjiaTime = yuangongqingjiaTime;
    }
    /**
	 * 获取：请假天数
	 */
    public Integer getYuangongqingjiaNumber() {
        return yuangongqingjiaNumber;
    }


    /**
	 * 设置：请假天数
	 */
    public void setYuangongqingjiaNumber(Integer yuangongqingjiaNumber) {
        this.yuangongqingjiaNumber = yuangongqingjiaNumber;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getYuangongqingjiaYesnoTypes() {
        return yuangongqingjiaYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setYuangongqingjiaYesnoTypes(Integer yuangongqingjiaYesnoTypes) {
        this.yuangongqingjiaYesnoTypes = yuangongqingjiaYesnoTypes;
    }
    /**
	 * 获取：处理意见
	 */
    public String getYuangongqingjiaYesnoText() {
        return yuangongqingjiaYesnoText;
    }


    /**
	 * 设置：处理意见
	 */
    public void setYuangongqingjiaYesnoText(String yuangongqingjiaYesnoText) {
        this.yuangongqingjiaYesnoText = yuangongqingjiaYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getYuangongqingjiaShenheTime() {
        return yuangongqingjiaShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setYuangongqingjiaShenheTime(Date yuangongqingjiaShenheTime) {
        this.yuangongqingjiaShenheTime = yuangongqingjiaShenheTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
