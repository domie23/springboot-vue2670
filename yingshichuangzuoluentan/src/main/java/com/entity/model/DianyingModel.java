package com.entity.model;

import com.entity.DianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 电影
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DianyingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 电影编号
     */
    private String dianyingUuidNumber;


    /**
     * 电影名称
     */
    private String dianyingName;


    /**
     * 电影类型
     */
    private Integer dianyingTypes;


    /**
     * 封面
     */
    private String dianyingPhoto;


    /**
     * 视频
     */
    private String dianyingVideo;


    /**
     * 导演
     */
    private String dianyingDanyan;


    /**
     * 编剧
     */
    private String dianyingBianju;


    /**
     * 制片国家/地区
     */
    private String dianyingAddress;


    /**
     * 语言
     */
    private String dianyingYuyan;


    /**
     * 上映日期
     */
    private String dianyingShijian;


    /**
     * 片长
     */
    private String dianyingPianchang;


    /**
     * 简介
     */
    private String dianyingContent;


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
	 * 获取：电影编号
	 */
    public String getDianyingUuidNumber() {
        return dianyingUuidNumber;
    }


    /**
	 * 设置：电影编号
	 */
    public void setDianyingUuidNumber(String dianyingUuidNumber) {
        this.dianyingUuidNumber = dianyingUuidNumber;
    }
    /**
	 * 获取：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }


    /**
	 * 设置：电影名称
	 */
    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 获取：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }


    /**
	 * 设置：电影类型
	 */
    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getDianyingVideo() {
        return dianyingVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setDianyingVideo(String dianyingVideo) {
        this.dianyingVideo = dianyingVideo;
    }
    /**
	 * 获取：导演
	 */
    public String getDianyingDanyan() {
        return dianyingDanyan;
    }


    /**
	 * 设置：导演
	 */
    public void setDianyingDanyan(String dianyingDanyan) {
        this.dianyingDanyan = dianyingDanyan;
    }
    /**
	 * 获取：编剧
	 */
    public String getDianyingBianju() {
        return dianyingBianju;
    }


    /**
	 * 设置：编剧
	 */
    public void setDianyingBianju(String dianyingBianju) {
        this.dianyingBianju = dianyingBianju;
    }
    /**
	 * 获取：制片国家/地区
	 */
    public String getDianyingAddress() {
        return dianyingAddress;
    }


    /**
	 * 设置：制片国家/地区
	 */
    public void setDianyingAddress(String dianyingAddress) {
        this.dianyingAddress = dianyingAddress;
    }
    /**
	 * 获取：语言
	 */
    public String getDianyingYuyan() {
        return dianyingYuyan;
    }


    /**
	 * 设置：语言
	 */
    public void setDianyingYuyan(String dianyingYuyan) {
        this.dianyingYuyan = dianyingYuyan;
    }
    /**
	 * 获取：上映日期
	 */
    public String getDianyingShijian() {
        return dianyingShijian;
    }


    /**
	 * 设置：上映日期
	 */
    public void setDianyingShijian(String dianyingShijian) {
        this.dianyingShijian = dianyingShijian;
    }
    /**
	 * 获取：片长
	 */
    public String getDianyingPianchang() {
        return dianyingPianchang;
    }


    /**
	 * 设置：片长
	 */
    public void setDianyingPianchang(String dianyingPianchang) {
        this.dianyingPianchang = dianyingPianchang;
    }
    /**
	 * 获取：简介
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }


    /**
	 * 设置：简介
	 */
    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
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
