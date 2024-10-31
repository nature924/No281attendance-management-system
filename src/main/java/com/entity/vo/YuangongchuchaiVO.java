package com.entity.vo;

import com.entity.YuangongchuchaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 员工出差
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuangongchuchai")
public class YuangongchuchaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 出差标题
     */

    @TableField(value = "yuangongchuchai_name")
    private String yuangongchuchaiName;


    /**
     * 出差缘由
     */

    @TableField(value = "yuangongchuchai_text")
    private String yuangongchuchaiText;


    /**
     * 出差地点
     */

    @TableField(value = "yuangongchuchai_address")
    private String yuangongchuchaiAddress;


    /**
     * 出差类型
     */

    @TableField(value = "yuangongchuchai_types")
    private Integer yuangongchuchaiTypes;


    /**
     * 出差开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yuangongchuchai_kaishi_time")
    private Date yuangongchuchaiKaishiTime;


    /**
     * 出差结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yuangongchuchai_jieshu_time")
    private Date yuangongchuchaiJieshuTime;


    /**
     * 交通工具
     */

    @TableField(value = "yuangongchuchai_jiaotonggongju_types")
    private Integer yuangongchuchaiJiaotonggongjuTypes;


    /**
     * 预支费用
     */

    @TableField(value = "yuzhi_feiyong")
    private Double yuzhiFeiyong;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请状态
     */

    @TableField(value = "yuangongchuchai_yesno_types")
    private Integer yuangongchuchaiYesnoTypes;


    /**
     * 处理意见
     */

    @TableField(value = "yuangongchuchai_yesno_text")
    private String yuangongchuchaiYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yuangongchuchai_shenhe_time")
    private Date yuangongchuchaiShenheTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：出差标题
	 */
    public String getYuangongchuchaiName() {
        return yuangongchuchaiName;
    }


    /**
	 * 获取：出差标题
	 */

    public void setYuangongchuchaiName(String yuangongchuchaiName) {
        this.yuangongchuchaiName = yuangongchuchaiName;
    }
    /**
	 * 设置：出差缘由
	 */
    public String getYuangongchuchaiText() {
        return yuangongchuchaiText;
    }


    /**
	 * 获取：出差缘由
	 */

    public void setYuangongchuchaiText(String yuangongchuchaiText) {
        this.yuangongchuchaiText = yuangongchuchaiText;
    }
    /**
	 * 设置：出差地点
	 */
    public String getYuangongchuchaiAddress() {
        return yuangongchuchaiAddress;
    }


    /**
	 * 获取：出差地点
	 */

    public void setYuangongchuchaiAddress(String yuangongchuchaiAddress) {
        this.yuangongchuchaiAddress = yuangongchuchaiAddress;
    }
    /**
	 * 设置：出差类型
	 */
    public Integer getYuangongchuchaiTypes() {
        return yuangongchuchaiTypes;
    }


    /**
	 * 获取：出差类型
	 */

    public void setYuangongchuchaiTypes(Integer yuangongchuchaiTypes) {
        this.yuangongchuchaiTypes = yuangongchuchaiTypes;
    }
    /**
	 * 设置：出差开始时间
	 */
    public Date getYuangongchuchaiKaishiTime() {
        return yuangongchuchaiKaishiTime;
    }


    /**
	 * 获取：出差开始时间
	 */

    public void setYuangongchuchaiKaishiTime(Date yuangongchuchaiKaishiTime) {
        this.yuangongchuchaiKaishiTime = yuangongchuchaiKaishiTime;
    }
    /**
	 * 设置：出差结束时间
	 */
    public Date getYuangongchuchaiJieshuTime() {
        return yuangongchuchaiJieshuTime;
    }


    /**
	 * 获取：出差结束时间
	 */

    public void setYuangongchuchaiJieshuTime(Date yuangongchuchaiJieshuTime) {
        this.yuangongchuchaiJieshuTime = yuangongchuchaiJieshuTime;
    }
    /**
	 * 设置：交通工具
	 */
    public Integer getYuangongchuchaiJiaotonggongjuTypes() {
        return yuangongchuchaiJiaotonggongjuTypes;
    }


    /**
	 * 获取：交通工具
	 */

    public void setYuangongchuchaiJiaotonggongjuTypes(Integer yuangongchuchaiJiaotonggongjuTypes) {
        this.yuangongchuchaiJiaotonggongjuTypes = yuangongchuchaiJiaotonggongjuTypes;
    }
    /**
	 * 设置：预支费用
	 */
    public Double getYuzhiFeiyong() {
        return yuzhiFeiyong;
    }


    /**
	 * 获取：预支费用
	 */

    public void setYuzhiFeiyong(Double yuzhiFeiyong) {
        this.yuzhiFeiyong = yuzhiFeiyong;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getYuangongchuchaiYesnoTypes() {
        return yuangongchuchaiYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setYuangongchuchaiYesnoTypes(Integer yuangongchuchaiYesnoTypes) {
        this.yuangongchuchaiYesnoTypes = yuangongchuchaiYesnoTypes;
    }
    /**
	 * 设置：处理意见
	 */
    public String getYuangongchuchaiYesnoText() {
        return yuangongchuchaiYesnoText;
    }


    /**
	 * 获取：处理意见
	 */

    public void setYuangongchuchaiYesnoText(String yuangongchuchaiYesnoText) {
        this.yuangongchuchaiYesnoText = yuangongchuchaiYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getYuangongchuchaiShenheTime() {
        return yuangongchuchaiShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setYuangongchuchaiShenheTime(Date yuangongchuchaiShenheTime) {
        this.yuangongchuchaiShenheTime = yuangongchuchaiShenheTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
