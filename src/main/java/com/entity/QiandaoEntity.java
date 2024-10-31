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
 * 员工签到
 *
 * @author 
 * @email
 */
@TableName("qiandao")
public class QiandaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QiandaoEntity() {

	}

	public QiandaoEntity(T t) {
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
     * 上班签到时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上班签到时间",type="timestamp")
    @TableField(value = "qiandao_shangban_time")

    private Date qiandaoShangbanTime;


    /**
     * 上班签到状态
     */
    @ColumnInfo(comment="上班签到状态",type="int(11)")
    @TableField(value = "qiandao_shangban_types")

    private Integer qiandaoShangbanTypes;


    /**
     * 下班签退时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="下班签退时间",type="timestamp")
    @TableField(value = "qiandao_xiaban_time")

    private Date qiandaoXiabanTime;


    /**
     * 下班签退状态
     */
    @ColumnInfo(comment="下班签退状态",type="int(11)")
    @TableField(value = "qiandao_xiaban_types")

    private Integer qiandaoXiabanTypes;


    /**
     * 所属日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="所属日期",type="date")
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
	 * 获取：上班签到时间
	 */
    public Date getQiandaoShangbanTime() {
        return qiandaoShangbanTime;
    }
    /**
	 * 设置：上班签到时间
	 */

    public void setQiandaoShangbanTime(Date qiandaoShangbanTime) {
        this.qiandaoShangbanTime = qiandaoShangbanTime;
    }
    /**
	 * 获取：上班签到状态
	 */
    public Integer getQiandaoShangbanTypes() {
        return qiandaoShangbanTypes;
    }
    /**
	 * 设置：上班签到状态
	 */

    public void setQiandaoShangbanTypes(Integer qiandaoShangbanTypes) {
        this.qiandaoShangbanTypes = qiandaoShangbanTypes;
    }
    /**
	 * 获取：下班签退时间
	 */
    public Date getQiandaoXiabanTime() {
        return qiandaoXiabanTime;
    }
    /**
	 * 设置：下班签退时间
	 */

    public void setQiandaoXiabanTime(Date qiandaoXiabanTime) {
        this.qiandaoXiabanTime = qiandaoXiabanTime;
    }
    /**
	 * 获取：下班签退状态
	 */
    public Integer getQiandaoXiabanTypes() {
        return qiandaoXiabanTypes;
    }
    /**
	 * 设置：下班签退状态
	 */

    public void setQiandaoXiabanTypes(Integer qiandaoXiabanTypes) {
        this.qiandaoXiabanTypes = qiandaoXiabanTypes;
    }
    /**
	 * 获取：所属日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：所属日期
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
        return "Qiandao{" +
            ", id=" + id +
            ", yuangongId=" + yuangongId +
            ", qiandaoShangbanTime=" + DateUtil.convertString(qiandaoShangbanTime,"yyyy-MM-dd") +
            ", qiandaoShangbanTypes=" + qiandaoShangbanTypes +
            ", qiandaoXiabanTime=" + DateUtil.convertString(qiandaoXiabanTime,"yyyy-MM-dd") +
            ", qiandaoXiabanTypes=" + qiandaoXiabanTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
