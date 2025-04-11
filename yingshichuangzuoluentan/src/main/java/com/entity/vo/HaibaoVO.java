package com.entity.vo;

import com.entity.HaibaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 海报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("haibao")
public class HaibaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 推荐电影
     */

    @TableField(value = "yugaopian_id")
    private Integer yugaopianId;


    /**
     * 海报封面
     */

    @TableField(value = "haibao_photo")
    private String haibaoPhoto;


    /**
     * 推荐细节
     */

    @TableField(value = "yugaopian_name")
    private String yugaopianName;


    /**
     * 创建时间 show1 photoShow
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
	 * 设置：推荐电影
	 */
    public Integer getYugaopianId() {
        return yugaopianId;
    }


    /**
	 * 获取：推荐电影
	 */

    public void setYugaopianId(Integer yugaopianId) {
        this.yugaopianId = yugaopianId;
    }
    /**
	 * 设置：海报封面
	 */
    public String getHaibaoPhoto() {
        return haibaoPhoto;
    }


    /**
	 * 获取：海报封面
	 */

    public void setHaibaoPhoto(String haibaoPhoto) {
        this.haibaoPhoto = haibaoPhoto;
    }
    /**
	 * 设置：推荐细节
	 */
    public String getYugaopianName() {
        return yugaopianName;
    }


    /**
	 * 获取：推荐细节
	 */

    public void setYugaopianName(String yugaopianName) {
        this.yugaopianName = yugaopianName;
    }
    /**
	 * 设置：创建时间 show1 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
