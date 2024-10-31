package com.entity.vo;

import com.entity.YuangongqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 员工请假
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuangongqingjia")
public class YuangongqingjiaVO implements Serializable {
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
     * 请假缘由
     */

    @TableField(value = "yuangongqingjia_text")
    private String yuangongqingjiaText;


    /**
     * 请假类型
     */

    @TableField(value = "yuangongqingjia_types")
    private Integer yuangongqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yuangongqingjia_time")
    private Date yuangongqingjiaTime;


    /**
     * 请假天数
     */

    @TableField(value = "yuangongqingjia_number")
    private Integer yuangongqingjiaNumber;


    /**
     * 申请状态
     */

    @TableField(value = "yuangongqingjia_yesno_types")
    private Integer yuangongqingjiaYesnoTypes;


    /**
     * 处理意见
     */

    @TableField(value = "yuangongqingjia_yesno_text")
    private String yuangongqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "yuangongqingjia_shenhe_time")
    private Date yuangongqingjiaShenheTime;


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
	 * 设置：请假缘由
	 */
    public String getYuangongqingjiaText() {
        return yuangongqingjiaText;
    }


    /**
	 * 获取：请假缘由
	 */

    public void setYuangongqingjiaText(String yuangongqingjiaText) {
        this.yuangongqingjiaText = yuangongqingjiaText;
    }
    /**
	 * 设置：请假类型
	 */
    public Integer getYuangongqingjiaTypes() {
        return yuangongqingjiaTypes;
    }


    /**
	 * 获取：请假类型
	 */

    public void setYuangongqingjiaTypes(Integer yuangongqingjiaTypes) {
        this.yuangongqingjiaTypes = yuangongqingjiaTypes;
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
	 * 设置：请假时间
	 */
    public Date getYuangongqingjiaTime() {
        return yuangongqingjiaTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setYuangongqingjiaTime(Date yuangongqingjiaTime) {
        this.yuangongqingjiaTime = yuangongqingjiaTime;
    }
    /**
	 * 设置：请假天数
	 */
    public Integer getYuangongqingjiaNumber() {
        return yuangongqingjiaNumber;
    }


    /**
	 * 获取：请假天数
	 */

    public void setYuangongqingjiaNumber(Integer yuangongqingjiaNumber) {
        this.yuangongqingjiaNumber = yuangongqingjiaNumber;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getYuangongqingjiaYesnoTypes() {
        return yuangongqingjiaYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setYuangongqingjiaYesnoTypes(Integer yuangongqingjiaYesnoTypes) {
        this.yuangongqingjiaYesnoTypes = yuangongqingjiaYesnoTypes;
    }
    /**
	 * 设置：处理意见
	 */
    public String getYuangongqingjiaYesnoText() {
        return yuangongqingjiaYesnoText;
    }


    /**
	 * 获取：处理意见
	 */

    public void setYuangongqingjiaYesnoText(String yuangongqingjiaYesnoText) {
        this.yuangongqingjiaYesnoText = yuangongqingjiaYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getYuangongqingjiaShenheTime() {
        return yuangongqingjiaShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setYuangongqingjiaShenheTime(Date yuangongqingjiaShenheTime) {
        this.yuangongqingjiaShenheTime = yuangongqingjiaShenheTime;
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
