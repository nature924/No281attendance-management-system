package com.entity.vo;

import com.entity.QiandaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 员工签到
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("qiandao")
public class QiandaoVO implements Serializable {
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
     * 上班签到时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "qiandao_shangban_time")
    private Date qiandaoShangbanTime;


    /**
     * 上班签到状态
     */

    @TableField(value = "qiandao_shangban_types")
    private Integer qiandaoShangbanTypes;


    /**
     * 下班签退时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "qiandao_xiaban_time")
    private Date qiandaoXiabanTime;


    /**
     * 下班签退状态
     */

    @TableField(value = "qiandao_xiaban_types")
    private Integer qiandaoXiabanTypes;


    /**
     * 所属日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：上班签到时间
	 */
    public Date getQiandaoShangbanTime() {
        return qiandaoShangbanTime;
    }


    /**
	 * 获取：上班签到时间
	 */

    public void setQiandaoShangbanTime(Date qiandaoShangbanTime) {
        this.qiandaoShangbanTime = qiandaoShangbanTime;
    }
    /**
	 * 设置：上班签到状态
	 */
    public Integer getQiandaoShangbanTypes() {
        return qiandaoShangbanTypes;
    }


    /**
	 * 获取：上班签到状态
	 */

    public void setQiandaoShangbanTypes(Integer qiandaoShangbanTypes) {
        this.qiandaoShangbanTypes = qiandaoShangbanTypes;
    }
    /**
	 * 设置：下班签退时间
	 */
    public Date getQiandaoXiabanTime() {
        return qiandaoXiabanTime;
    }


    /**
	 * 获取：下班签退时间
	 */

    public void setQiandaoXiabanTime(Date qiandaoXiabanTime) {
        this.qiandaoXiabanTime = qiandaoXiabanTime;
    }
    /**
	 * 设置：下班签退状态
	 */
    public Integer getQiandaoXiabanTypes() {
        return qiandaoXiabanTypes;
    }


    /**
	 * 获取：下班签退状态
	 */

    public void setQiandaoXiabanTypes(Integer qiandaoXiabanTypes) {
        this.qiandaoXiabanTypes = qiandaoXiabanTypes;
    }
    /**
	 * 设置：所属日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：所属日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
