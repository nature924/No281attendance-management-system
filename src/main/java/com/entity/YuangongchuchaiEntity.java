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
 * 员工出差
 *
 * @author 
 * @email
 */
@TableName("yuangongchuchai")
public class YuangongchuchaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuangongchuchaiEntity() {

	}

	public YuangongchuchaiEntity(T t) {
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
     * 员工
     */
    @ColumnInfo(comment="员工",type="int(200)")
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 出差标题
     */
    @ColumnInfo(comment="出差标题",type="varchar(200)")
    @TableField(value = "yuangongchuchai_name")

    private String yuangongchuchaiName;


    /**
     * 出差缘由
     */
    @ColumnInfo(comment="出差缘由",type="longtext")
    @TableField(value = "yuangongchuchai_text")

    private String yuangongchuchaiText;


    /**
     * 出差地点
     */
    @ColumnInfo(comment="出差地点",type="varchar(200)")
    @TableField(value = "yuangongchuchai_address")

    private String yuangongchuchaiAddress;


    /**
     * 出差类型
     */
    @ColumnInfo(comment="出差类型",type="int(11)")
    @TableField(value = "yuangongchuchai_types")

    private Integer yuangongchuchaiTypes;


    /**
     * 出差开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="出差开始时间",type="timestamp")
    @TableField(value = "yuangongchuchai_kaishi_time")

    private Date yuangongchuchaiKaishiTime;


    /**
     * 出差结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="出差结束时间",type="timestamp")
    @TableField(value = "yuangongchuchai_jieshu_time")

    private Date yuangongchuchaiJieshuTime;


    /**
     * 交通工具
     */
    @ColumnInfo(comment="交通工具",type="int(11)")
    @TableField(value = "yuangongchuchai_jiaotonggongju_types")

    private Integer yuangongchuchaiJiaotonggongjuTypes;


    /**
     * 预支费用
     */
    @ColumnInfo(comment="预支费用",type="decimal(10,2)")
    @TableField(value = "yuzhi_feiyong")

    private Double yuzhiFeiyong;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "yuangongchuchai_yesno_types")

    private Integer yuangongchuchaiYesnoTypes;


    /**
     * 处理意见
     */
    @ColumnInfo(comment="处理意见",type="longtext")
    @TableField(value = "yuangongchuchai_yesno_text")

    private String yuangongchuchaiYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "yuangongchuchai_shenhe_time")

    private Date yuangongchuchaiShenheTime;


    /**
     * 创建时间  listShow
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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yuangongchuchai{" +
            ", id=" + id +
            ", yuangongId=" + yuangongId +
            ", yuangongchuchaiName=" + yuangongchuchaiName +
            ", yuangongchuchaiText=" + yuangongchuchaiText +
            ", yuangongchuchaiAddress=" + yuangongchuchaiAddress +
            ", yuangongchuchaiTypes=" + yuangongchuchaiTypes +
            ", yuangongchuchaiKaishiTime=" + DateUtil.convertString(yuangongchuchaiKaishiTime,"yyyy-MM-dd") +
            ", yuangongchuchaiJieshuTime=" + DateUtil.convertString(yuangongchuchaiJieshuTime,"yyyy-MM-dd") +
            ", yuangongchuchaiJiaotonggongjuTypes=" + yuangongchuchaiJiaotonggongjuTypes +
            ", yuzhiFeiyong=" + yuzhiFeiyong +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", yuangongchuchaiYesnoTypes=" + yuangongchuchaiYesnoTypes +
            ", yuangongchuchaiYesnoText=" + yuangongchuchaiYesnoText +
            ", yuangongchuchaiShenheTime=" + DateUtil.convertString(yuangongchuchaiShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
