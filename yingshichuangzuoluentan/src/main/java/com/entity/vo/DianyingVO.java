package com.entity.vo;

import com.entity.DianyingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 电影
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dianying")
public class DianyingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 电影编号
     */

    @TableField(value = "dianying_uuid_number")
    private String dianyingUuidNumber;


    /**
     * 电影名称
     */

    @TableField(value = "dianying_name")
    private String dianyingName;


    /**
     * 电影类型
     */

    @TableField(value = "dianying_types")
    private Integer dianyingTypes;


    /**
     * 封面
     */

    @TableField(value = "dianying_photo")
    private String dianyingPhoto;


    /**
     * 视频
     */

    @TableField(value = "dianying_video")
    private String dianyingVideo;


    /**
     * 导演
     */

    @TableField(value = "dianying_danyan")
    private String dianyingDanyan;


    /**
     * 编剧
     */

    @TableField(value = "dianying_bianju")
    private String dianyingBianju;


    /**
     * 制片国家/地区
     */

    @TableField(value = "dianying_address")
    private String dianyingAddress;


    /**
     * 语言
     */

    @TableField(value = "dianying_yuyan")
    private String dianyingYuyan;


    /**
     * 上映日期
     */

    @TableField(value = "dianying_shijian")
    private String dianyingShijian;


    /**
     * 片长
     */

    @TableField(value = "dianying_pianchang")
    private String dianyingPianchang;


    /**
     * 简介
     */

    @TableField(value = "dianying_content")
    private String dianyingContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：电影编号
	 */
    public String getDianyingUuidNumber() {
        return dianyingUuidNumber;
    }


    /**
	 * 获取：电影编号
	 */

    public void setDianyingUuidNumber(String dianyingUuidNumber) {
        this.dianyingUuidNumber = dianyingUuidNumber;
    }
    /**
	 * 设置：电影名称
	 */
    public String getDianyingName() {
        return dianyingName;
    }


    /**
	 * 获取：电影名称
	 */

    public void setDianyingName(String dianyingName) {
        this.dianyingName = dianyingName;
    }
    /**
	 * 设置：电影类型
	 */
    public Integer getDianyingTypes() {
        return dianyingTypes;
    }


    /**
	 * 获取：电影类型
	 */

    public void setDianyingTypes(Integer dianyingTypes) {
        this.dianyingTypes = dianyingTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getDianyingPhoto() {
        return dianyingPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setDianyingPhoto(String dianyingPhoto) {
        this.dianyingPhoto = dianyingPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getDianyingVideo() {
        return dianyingVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setDianyingVideo(String dianyingVideo) {
        this.dianyingVideo = dianyingVideo;
    }
    /**
	 * 设置：导演
	 */
    public String getDianyingDanyan() {
        return dianyingDanyan;
    }


    /**
	 * 获取：导演
	 */

    public void setDianyingDanyan(String dianyingDanyan) {
        this.dianyingDanyan = dianyingDanyan;
    }
    /**
	 * 设置：编剧
	 */
    public String getDianyingBianju() {
        return dianyingBianju;
    }


    /**
	 * 获取：编剧
	 */

    public void setDianyingBianju(String dianyingBianju) {
        this.dianyingBianju = dianyingBianju;
    }
    /**
	 * 设置：制片国家/地区
	 */
    public String getDianyingAddress() {
        return dianyingAddress;
    }


    /**
	 * 获取：制片国家/地区
	 */

    public void setDianyingAddress(String dianyingAddress) {
        this.dianyingAddress = dianyingAddress;
    }
    /**
	 * 设置：语言
	 */
    public String getDianyingYuyan() {
        return dianyingYuyan;
    }


    /**
	 * 获取：语言
	 */

    public void setDianyingYuyan(String dianyingYuyan) {
        this.dianyingYuyan = dianyingYuyan;
    }
    /**
	 * 设置：上映日期
	 */
    public String getDianyingShijian() {
        return dianyingShijian;
    }


    /**
	 * 获取：上映日期
	 */

    public void setDianyingShijian(String dianyingShijian) {
        this.dianyingShijian = dianyingShijian;
    }
    /**
	 * 设置：片长
	 */
    public String getDianyingPianchang() {
        return dianyingPianchang;
    }


    /**
	 * 获取：片长
	 */

    public void setDianyingPianchang(String dianyingPianchang) {
        this.dianyingPianchang = dianyingPianchang;
    }
    /**
	 * 设置：简介
	 */
    public String getDianyingContent() {
        return dianyingContent;
    }


    /**
	 * 获取：简介
	 */

    public void setDianyingContent(String dianyingContent) {
        this.dianyingContent = dianyingContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
