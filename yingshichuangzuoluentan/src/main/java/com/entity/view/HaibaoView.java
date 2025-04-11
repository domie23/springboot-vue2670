package com.entity.view;

import com.entity.HaibaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 海报
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("haibao")
public class HaibaoView extends HaibaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yugaopian
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
				* 电影类型的值
				*/
				private String yugaopianValue;
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

	public HaibaoView() {

	}

	public HaibaoView(HaibaoEntity haibaoEntity) {
		try {
			BeanUtils.copyProperties(this, haibaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set yugaopian
					/**
					* 获取： 预告片编号
					*/
					public String getYugaopianUuidNumber() {
						return yugaopianUuidNumber;
					}
					/**
					* 设置： 预告片编号
					*/
					public void setYugaopianUuidNumber(String yugaopianUuidNumber) {
						this.yugaopianUuidNumber = yugaopianUuidNumber;
					}
					/**
					* 获取： 电影名称
					*/
					public String getYugaopianName() {
						return yugaopianName;
					}
					/**
					* 设置： 电影名称
					*/
					public void setYugaopianName(String yugaopianName) {
						this.yugaopianName = yugaopianName;
					}
					/**
					* 获取： 电影类型
					*/
					public Integer getYugaopianTypes() {
						return yugaopianTypes;
					}
					/**
					* 设置： 电影类型
					*/
					public void setYugaopianTypes(Integer yugaopianTypes) {
						this.yugaopianTypes = yugaopianTypes;
					}


						/**
						* 获取： 电影类型的值
						*/
						public String getYugaopianValue() {
							return yugaopianValue;
						}
						/**
						* 设置： 电影类型的值
						*/
						public void setYugaopianValue(String yugaopianValue) {
							this.yugaopianValue = yugaopianValue;
						}
					/**
					* 获取： 封面
					*/
					public String getYugaopianPhoto() {
						return yugaopianPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setYugaopianPhoto(String yugaopianPhoto) {
						this.yugaopianPhoto = yugaopianPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getYugaopianVideo() {
						return yugaopianVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setYugaopianVideo(String yugaopianVideo) {
						this.yugaopianVideo = yugaopianVideo;
					}
					/**
					* 获取： 导演
					*/
					public String getYugaopianDanyan() {
						return yugaopianDanyan;
					}
					/**
					* 设置： 导演
					*/
					public void setYugaopianDanyan(String yugaopianDanyan) {
						this.yugaopianDanyan = yugaopianDanyan;
					}
					/**
					* 获取： 编剧
					*/
					public String getYugaopianBianju() {
						return yugaopianBianju;
					}
					/**
					* 设置： 编剧
					*/
					public void setYugaopianBianju(String yugaopianBianju) {
						this.yugaopianBianju = yugaopianBianju;
					}
					/**
					* 获取： 制片国家/地区
					*/
					public String getYugaopianAddress() {
						return yugaopianAddress;
					}
					/**
					* 设置： 制片国家/地区
					*/
					public void setYugaopianAddress(String yugaopianAddress) {
						this.yugaopianAddress = yugaopianAddress;
					}
					/**
					* 获取： 语言
					*/
					public String getYugaopianYuyan() {
						return yugaopianYuyan;
					}
					/**
					* 设置： 语言
					*/
					public void setYugaopianYuyan(String yugaopianYuyan) {
						this.yugaopianYuyan = yugaopianYuyan;
					}
					/**
					* 获取： 上映日期
					*/
					public String getYugaopianShijian() {
						return yugaopianShijian;
					}
					/**
					* 设置： 上映日期
					*/
					public void setYugaopianShijian(String yugaopianShijian) {
						this.yugaopianShijian = yugaopianShijian;
					}
					/**
					* 获取： 片长
					*/
					public String getYugaopianPianchang() {
						return yugaopianPianchang;
					}
					/**
					* 设置： 片长
					*/
					public void setYugaopianPianchang(String yugaopianPianchang) {
						this.yugaopianPianchang = yugaopianPianchang;
					}
					/**
					* 获取： 简介
					*/
					public String getYugaopianContent() {
						return yugaopianContent;
					}
					/**
					* 设置： 简介
					*/
					public void setYugaopianContent(String yugaopianContent) {
						this.yugaopianContent = yugaopianContent;
					}


}
