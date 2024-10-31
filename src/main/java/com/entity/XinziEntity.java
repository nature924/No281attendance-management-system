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
 * 薪资
 *
 * @author 
 * @email
 */
@TableName("xinzi")
public class XinziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinziEntity() {

	}

	public XinziEntity(T t) {
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
    @ColumnInfo(comment="员工",type="int(11)")
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 薪资编号
     */
    @ColumnInfo(comment="薪资编号",type="varchar(200)")
    @TableField(value = "xinzi_uuid_number")

    private String xinziUuidNumber;


    /**
     * 月份
     */
    @ColumnInfo(comment="月份",type="varchar(200)")
    @TableField(value = "xinzi_month")

    private String xinziMonth;


    /**
     * 基本工资
     */
    @ColumnInfo(comment="基本工资",type="decimal(10,2)")
    @TableField(value = "jiben_jine")

    private Double jibenJine;


    /**
     * 奖金
     */
    @ColumnInfo(comment="奖金",type="decimal(10,2)")
    @TableField(value = "jiangjin_jine")

    private Double jiangjinJine;


    /**
     * 绩效
     */
    @ColumnInfo(comment="绩效",type="decimal(10,2)")
    @TableField(value = "jixiao_jine")

    private Double jixiaoJine;


    /**
     * 补贴
     */
    @ColumnInfo(comment="补贴",type="decimal(10,2)")
    @TableField(value = "butie_jine")

    private Double butieJine;


    /**
     * 实发
     */
    @ColumnInfo(comment="实发",type="decimal(10,2)")
    @TableField(value = "shifa_jine")

    private Double shifaJine;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "xinzi_content")

    private String xinziContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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

    @Override
    public String toString() {
        return "Xinzi{" +
            ", id=" + id +
            ", yuangongId=" + yuangongId +
            ", xinziUuidNumber=" + xinziUuidNumber +
            ", xinziMonth=" + xinziMonth +
            ", jibenJine=" + jibenJine +
            ", jiangjinJine=" + jiangjinJine +
            ", jixiaoJine=" + jixiaoJine +
            ", butieJine=" + butieJine +
            ", shifaJine=" + shifaJine +
            ", xinziContent=" + xinziContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
