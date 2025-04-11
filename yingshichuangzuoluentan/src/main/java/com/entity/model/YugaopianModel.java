package com.entity.model;

import com.entity.YugaopianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 预告
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YugaopianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预告片编号
     */
    private String yugaopianUuidNumber;


    /**
     * 电影名称
     */
    private String yugaopianName;


    /**
     * 电影类型
     */
    private Integer yugaopianTypes;


    /**
     * 封面
     */
    private String yugaopianPhoto;


    /**
     * 视频
     */
    private String yugaopianVideo;


    /**
     * 导演
     */
    private String yugaopianDanyan;


    /**
     * 编剧
     */
    private String yugaopianBianju;


    /**
     * 制片国家/地区
     */
    private String yugaopianAddress;


    /**
     * 语言
     */
    private String yugaopianYuyan;


    /**
     * 上映日期
     */
    private String yugaopianShijian;


    /**
     * 片长
     */
    private String yugaopianPianchang;


    /**
     * 简介
     */
    private String yugaopianContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：预告片编号
	 */
    public String getYugaopianUuidNumber() {
        return yugaopianUuidNumber;
    }


    /**
	 * 设置：预告片编号
	 */
    public void setYugaopianUuidNumber(String yugaopianUuidNumber) {
        this.yugaopianUuidNumber = yugaopianUuidNumber;
    }
    /**
	 * 获取：电影名称
	 */
    public String getYugaopianName() {
        return yugaopianName;
    }


    /**
	 * 设置：电影名称
	 */
    public void setYugaopianName(String yugaopianName) {
        this.yugaopianName = yugaopianName;
    }
    /**
	 * 获取：电影类型
	 */
    public Integer getYugaopianTypes() {
        return yugaopianTypes;
    }


    /**
	 * 设置：电影类型
	 */
    public void setYugaopianTypes(Integer yugaopianTypes) {
        this.yugaopianTypes = yugaopianTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getYugaopianPhoto() {
        return yugaopianPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setYugaopianPhoto(String yugaopianPhoto) {
        this.yugaopianPhoto = yugaopianPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getYugaopianVideo() {
        return yugaopianVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setYugaopianVideo(String yugaopianVideo) {
        this.yugaopianVideo = yugaopianVideo;
    }
    /**
	 * 获取：导演
	 */
    public String getYugaopianDanyan() {
        return yugaopianDanyan;
    }


    /**
	 * 设置：导演
	 */
    public void setYugaopianDanyan(String yugaopianDanyan) {
        this.yugaopianDanyan = yugaopianDanyan;
    }
    /**
	 * 获取：编剧
	 */
    public String getYugaopianBianju() {
        return yugaopianBianju;
    }


    /**
	 * 设置：编剧
	 */
    public void setYugaopianBianju(String yugaopianBianju) {
        this.yugaopianBianju = yugaopianBianju;
    }
    /**
	 * 获取：制片国家/地区
	 */
    public String getYugaopianAddress() {
        return yugaopianAddress;
    }


    /**
	 * 设置：制片国家/地区
	 */
    public void setYugaopianAddress(String yugaopianAddress) {
        this.yugaopianAddress = yugaopianAddress;
    }
    /**
	 * 获取：语言
	 */
    public String getYugaopianYuyan() {
        return yugaopianYuyan;
    }


    /**
	 * 设置：语言
	 */
    public void setYugaopianYuyan(String yugaopianYuyan) {
        this.yugaopianYuyan = yugaopianYuyan;
    }
    /**
	 * 获取：上映日期
	 */
    public String getYugaopianShijian() {
        return yugaopianShijian;
    }


    /**
	 * 设置：上映日期
	 */
    public void setYugaopianShijian(String yugaopianShijian) {
        this.yugaopianShijian = yugaopianShijian;
    }
    /**
	 * 获取：片长
	 */
    public String getYugaopianPianchang() {
        return yugaopianPianchang;
    }


    /**
	 * 设置：片长
	 */
    public void setYugaopianPianchang(String yugaopianPianchang) {
        this.yugaopianPianchang = yugaopianPianchang;
    }
    /**
	 * 获取：简介
	 */
    public String getYugaopianContent() {
        return yugaopianContent;
    }


    /**
	 * 设置：简介
	 */
    public void setYugaopianContent(String yugaopianContent) {
        this.yugaopianContent = yugaopianContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
