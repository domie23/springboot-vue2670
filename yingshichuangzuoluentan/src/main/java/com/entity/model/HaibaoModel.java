package com.entity.model;

import com.entity.HaibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 海报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HaibaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 推荐电影
     */
    private Integer yugaopianId;


    /**
     * 海报封面
     */
    private String haibaoPhoto;


    /**
     * 推荐细节
     */
    private String yugaopianName;


    /**
     * 创建时间 show1 photoShow
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
	 * 获取：推荐电影
	 */
    public Integer getYugaopianId() {
        return yugaopianId;
    }


    /**
	 * 设置：推荐电影
	 */
    public void setYugaopianId(Integer yugaopianId) {
        this.yugaopianId = yugaopianId;
    }
    /**
	 * 获取：海报封面
	 */
    public String getHaibaoPhoto() {
        return haibaoPhoto;
    }


    /**
	 * 设置：海报封面
	 */
    public void setHaibaoPhoto(String haibaoPhoto) {
        this.haibaoPhoto = haibaoPhoto;
    }
    /**
	 * 获取：推荐细节
	 */
    public String getYugaopianName() {
        return yugaopianName;
    }


    /**
	 * 设置：推荐细节
	 */
    public void setYugaopianName(String yugaopianName) {
        this.yugaopianName = yugaopianName;
    }
    /**
	 * 获取：创建时间 show1 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
