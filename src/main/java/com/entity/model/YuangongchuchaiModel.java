package com.entity.model;

import com.entity.YuangongchuchaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 员工出差
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuangongchuchaiModel implements Serializable {
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
     * 出差标题
     */
    private String yuangongchuchaiName;


    /**
     * 出差缘由
     */
    private String yuangongchuchaiText;


    /**
     * 出差地点
     */
    private String yuangongchuchaiAddress;


    /**
     * 出差类型
     */
    private Integer yuangongchuchaiTypes;


    /**
     * 出差开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuangongchuchaiKaishiTime;


    /**
     * 出差结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuangongchuchaiJieshuTime;


    /**
     * 交通工具
     */
    private Integer yuangongchuchaiJiaotonggongjuTypes;


    /**
     * 预支费用
     */
    private Double yuzhiFeiyong;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer yuangongchuchaiYesnoTypes;


    /**
     * 处理意见
     */
    private String yuangongchuchaiYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuangongchuchaiShenheTime;


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
	 * 获取：出差标题
	 */
    public String getYuangongchuchaiName() {
        return yuangongchuchaiName;
    }


    /**
	 * 设置：出差标题
	 */
    public void setYuangongchuchaiName(String yuangongchuchaiName) {
        this.yuangongchuchaiName = yuangongchuchaiName;
    }
    /**
	 * 获取：出差缘由
	 */
    public String getYuangongchuchaiText() {
        return yuangongchuchaiText;
    }


    /**
	 * 设置：出差缘由
	 */
    public void setYuangongchuchaiText(String yuangongchuchaiText) {
        this.yuangongchuchaiText = yuangongchuchaiText;
    }
    /**
	 * 获取：出差地点
	 */
    public String getYuangongchuchaiAddress() {
        return yuangongchuchaiAddress;
    }


    /**
	 * 设置：出差地点
	 */
    public void setYuangongchuchaiAddress(String yuangongchuchaiAddress) {
        this.yuangongchuchaiAddress = yuangongchuchaiAddress;
    }
    /**
	 * 获取：出差类型
	 */
    public Integer getYuangongchuchaiTypes() {
        return yuangongchuchaiTypes;
    }


    /**
	 * 设置：出差类型
	 */
    public void setYuangongchuchaiTypes(Integer yuangongchuchaiTypes) {
        this.yuangongchuchaiTypes = yuangongchuchaiTypes;
    }
    /**
	 * 获取：出差开始时间
	 */
    public Date getYuangongchuchaiKaishiTime() {
        return yuangongchuchaiKaishiTime;
    }


    /**
	 * 设置：出差开始时间
	 */
    public void setYuangongchuchaiKaishiTime(Date yuangongchuchaiKaishiTime) {
        this.yuangongchuchaiKaishiTime = yuangongchuchaiKaishiTime;
    }
    /**
	 * 获取：出差结束时间
	 */
    public Date getYuangongchuchaiJieshuTime() {
        return yuangongchuchaiJieshuTime;
    }


    /**
	 * 设置：出差结束时间
	 */
    public void setYuangongchuchaiJieshuTime(Date yuangongchuchaiJieshuTime) {
        this.yuangongchuchaiJieshuTime = yuangongchuchaiJieshuTime;
    }
    /**
	 * 获取：交通工具
	 */
    public Integer getYuangongchuchaiJiaotonggongjuTypes() {
        return yuangongchuchaiJiaotonggongjuTypes;
    }


    /**
	 * 设置：交通工具
	 */
    public void setYuangongchuchaiJiaotonggongjuTypes(Integer yuangongchuchaiJiaotonggongjuTypes) {
        this.yuangongchuchaiJiaotonggongjuTypes = yuangongchuchaiJiaotonggongjuTypes;
    }
    /**
	 * 获取：预支费用
	 */
    public Double getYuzhiFeiyong() {
        return yuzhiFeiyong;
    }


    /**
	 * 设置：预支费用
	 */
    public void setYuzhiFeiyong(Double yuzhiFeiyong) {
        this.yuzhiFeiyong = yuzhiFeiyong;
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
	 * 获取：申请状态
	 */
    public Integer getYuangongchuchaiYesnoTypes() {
        return yuangongchuchaiYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setYuangongchuchaiYesnoTypes(Integer yuangongchuchaiYesnoTypes) {
        this.yuangongchuchaiYesnoTypes = yuangongchuchaiYesnoTypes;
    }
    /**
	 * 获取：处理意见
	 */
    public String getYuangongchuchaiYesnoText() {
        return yuangongchuchaiYesnoText;
    }


    /**
	 * 设置：处理意见
	 */
    public void setYuangongchuchaiYesnoText(String yuangongchuchaiYesnoText) {
        this.yuangongchuchaiYesnoText = yuangongchuchaiYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getYuangongchuchaiShenheTime() {
        return yuangongchuchaiShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setYuangongchuchaiShenheTime(Date yuangongchuchaiShenheTime) {
        this.yuangongchuchaiShenheTime = yuangongchuchaiShenheTime;
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
