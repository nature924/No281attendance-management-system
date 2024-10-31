package com.entity.model;

import com.entity.QiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 员工签到
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QiandaoModel implements Serializable {
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
     * 上班签到时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qiandaoShangbanTime;


    /**
     * 上班签到状态
     */
    private Integer qiandaoShangbanTypes;


    /**
     * 下班签退时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qiandaoXiabanTime;


    /**
     * 下班签退状态
     */
    private Integer qiandaoXiabanTypes;


    /**
     * 所属日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
