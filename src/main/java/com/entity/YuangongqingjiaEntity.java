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
 * 员工请假
 *
 * @author 
 * @email
 */
@TableName("yuangongqingjia")
public class YuangongqingjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuangongqingjiaEntity() {

	}

	public YuangongqingjiaEntity(T t) {
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
     * 请假缘由
     */
    @ColumnInfo(comment="请假缘由",type="longtext")
    @TableField(value = "yuangongqingjia_text")

    private String yuangongqingjiaText;


    /**
     * 请假类型
     */
    @ColumnInfo(comment="请假类型",type="int(11)")
    @TableField(value = "yuangongqingjia_types")

    private Integer yuangongqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="请假时间",type="timestamp")
    @TableField(value = "yuangongqingjia_time")

    private Date yuangongqingjiaTime;


    /**
     * 请假天数
     */
    @ColumnInfo(comment="请假天数",type="int(200)")
    @TableField(value = "yuangongqingjia_number")

    private Integer yuangongqingjiaNumber;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "yuangongqingjia_yesno_types")

    private Integer yuangongqingjiaYesnoTypes;


    /**
     * 处理意见
     */
    @ColumnInfo(comment="处理意见",type="longtext")
    @TableField(value = "yuangongqingjia_yesno_text")

    private String yuangongqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "yuangongqingjia_shenhe_time")

    private Date yuangongqingjiaShenheTime;


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
        return "Yuangongqingjia{" +
            ", id=" + id +
            ", yuangongId=" + yuangongId +
            ", yuangongqingjiaText=" + yuangongqingjiaText +
            ", yuangongqingjiaTypes=" + yuangongqingjiaTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", yuangongqingjiaTime=" + DateUtil.convertString(yuangongqingjiaTime,"yyyy-MM-dd") +
            ", yuangongqingjiaNumber=" + yuangongqingjiaNumber +
            ", yuangongqingjiaYesnoTypes=" + yuangongqingjiaYesnoTypes +
            ", yuangongqingjiaYesnoText=" + yuangongqingjiaYesnoText +
            ", yuangongqingjiaShenheTime=" + DateUtil.convertString(yuangongqingjiaShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
