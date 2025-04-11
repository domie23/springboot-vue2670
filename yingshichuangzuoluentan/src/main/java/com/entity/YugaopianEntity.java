package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 预告
 *
 * @author 
 * @email
 */
@TableName("yugaopian")
public class YugaopianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YugaopianEntity() {

	}

	public YugaopianEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 预告片编号
     */
    @TableField(value = "yugaopian_uuid_number")

    private String yugaopianUuidNumber;


    /**
     * 电影名称
     */
    @TableField(value = "yugaopian_name")

    private String yugaopianName;


    /**
     * 电影类型
     */
    @TableField(value = "yugaopian_types")

    private Integer yugaopianTypes;


    /**
     * 封面
     */
    @TableField(value = "yugaopian_photo")

    private String yugaopianPhoto;


    /**
     * 视频
     */
    @TableField(value = "yugaopian_video")

    private String yugaopianVideo;


    /**
     * 导演
     */
    @TableField(value = "yugaopian_danyan")

    private String yugaopianDanyan;


    /**
     * 编剧
     */
    @TableField(value = "yugaopian_bianju")

    private String yugaopianBianju;


    /**
     * 制片国家/地区
     */
    @TableField(value = "yugaopian_address")

    private String yugaopianAddress;


    /**
     * 语言
     */
    @TableField(value = "yugaopian_yuyan")

    private String yugaopianYuyan;


    /**
     * 上映日期
     */
    @TableField(value = "yugaopian_shijian")

    private String yugaopianShijian;


    /**
     * 片长
     */
    @TableField(value = "yugaopian_pianchang")

    private String yugaopianPianchang;


    /**
     * 简介
     */
    @TableField(value = "yugaopian_content")

    private String yugaopianContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：预告片编号
	 */
    public String getYugaopianUuidNumber() {
        return yugaopianUuidNumber;
    }


    /**
	 * 获取：预告片编号
	 */

    public void setYugaopianUuidNumber(String yugaopianUuidNumber) {
        this.yugaopianUuidNumber = yugaopianUuidNumber;
    }
    /**
	 * 设置：电影名称
	 */
    public String getYugaopianName() {
        return yugaopianName;
    }


    /**
	 * 获取：电影名称
	 */

    public void setYugaopianName(String yugaopianName) {
        this.yugaopianName = yugaopianName;
    }
    /**
	 * 设置：电影类型
	 */
    public Integer getYugaopianTypes() {
        return yugaopianTypes;
    }


    /**
	 * 获取：电影类型
	 */

    public void setYugaopianTypes(Integer yugaopianTypes) {
        this.yugaopianTypes = yugaopianTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getYugaopianPhoto() {
        return yugaopianPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setYugaopianPhoto(String yugaopianPhoto) {
        this.yugaopianPhoto = yugaopianPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getYugaopianVideo() {
        return yugaopianVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setYugaopianVideo(String yugaopianVideo) {
        this.yugaopianVideo = yugaopianVideo;
    }
    /**
	 * 设置：导演
	 */
    public String getYugaopianDanyan() {
        return yugaopianDanyan;
    }


    /**
	 * 获取：导演
	 */

    public void setYugaopianDanyan(String yugaopianDanyan) {
        this.yugaopianDanyan = yugaopianDanyan;
    }
    /**
	 * 设置：编剧
	 */
    public String getYugaopianBianju() {
        return yugaopianBianju;
    }


    /**
	 * 获取：编剧
	 */

    public void setYugaopianBianju(String yugaopianBianju) {
        this.yugaopianBianju = yugaopianBianju;
    }
    /**
	 * 设置：制片国家/地区
	 */
    public String getYugaopianAddress() {
        return yugaopianAddress;
    }


    /**
	 * 获取：制片国家/地区
	 */

    public void setYugaopianAddress(String yugaopianAddress) {
        this.yugaopianAddress = yugaopianAddress;
    }
    /**
	 * 设置：语言
	 */
    public String getYugaopianYuyan() {
        return yugaopianYuyan;
    }


    /**
	 * 获取：语言
	 */

    public void setYugaopianYuyan(String yugaopianYuyan) {
        this.yugaopianYuyan = yugaopianYuyan;
    }
    /**
	 * 设置：上映日期
	 */
    public String getYugaopianShijian() {
        return yugaopianShijian;
    }


    /**
	 * 获取：上映日期
	 */

    public void setYugaopianShijian(String yugaopianShijian) {
        this.yugaopianShijian = yugaopianShijian;
    }
    /**
	 * 设置：片长
	 */
    public String getYugaopianPianchang() {
        return yugaopianPianchang;
    }


    /**
	 * 获取：片长
	 */

    public void setYugaopianPianchang(String yugaopianPianchang) {
        this.yugaopianPianchang = yugaopianPianchang;
    }
    /**
	 * 设置：简介
	 */
    public String getYugaopianContent() {
        return yugaopianContent;
    }


    /**
	 * 获取：简介
	 */

    public void setYugaopianContent(String yugaopianContent) {
        this.yugaopianContent = yugaopianContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yugaopian{" +
            "id=" + id +
            ", yugaopianUuidNumber=" + yugaopianUuidNumber +
            ", yugaopianName=" + yugaopianName +
            ", yugaopianTypes=" + yugaopianTypes +
            ", yugaopianPhoto=" + yugaopianPhoto +
            ", yugaopianVideo=" + yugaopianVideo +
            ", yugaopianDanyan=" + yugaopianDanyan +
            ", yugaopianBianju=" + yugaopianBianju +
            ", yugaopianAddress=" + yugaopianAddress +
            ", yugaopianYuyan=" + yugaopianYuyan +
            ", yugaopianShijian=" + yugaopianShijian +
            ", yugaopianPianchang=" + yugaopianPianchang +
            ", yugaopianContent=" + yugaopianContent +
            ", createTime=" + createTime +
        "}";
    }
}
