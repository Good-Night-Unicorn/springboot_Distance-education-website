package com.entity.model;

import com.entity.AboutusEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 关于我们
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-05 11:41:24
 */
public class AboutusModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 副标题
	 */
	
	private String subtitle;
		
	/**
	 * 内容
	 */
	
	private String content;
		
	/**
	 * 图片1
	 */
	
	private String picture1;
		
	/**
	 * 图片2
	 */
	
	private String picture2;
		
	/**
	 * 图片3
	 */
	
	private String picture3;
				
	
	/**
	 * 设置：副标题
	 */
	 
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	
	/**
	 * 获取：副标题
	 */
	public String getSubtitle() {
		return subtitle;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 获取：内容
	 */
	public String getContent() {
		return content;
	}
				
	
	/**
	 * 设置：图片1
	 */
	 
	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}
	
	/**
	 * 获取：图片1
	 */
	public String getPicture1() {
		return picture1;
	}
				
	
	/**
	 * 设置：图片2
	 */
	 
	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}
	
	/**
	 * 获取：图片2
	 */
	public String getPicture2() {
		return picture2;
	}
				
	
	/**
	 * 设置：图片3
	 */
	 
	public void setPicture3(String picture3) {
		this.picture3 = picture3;
	}
	
	/**
	 * 获取：图片3
	 */
	public String getPicture3() {
		return picture3;
	}
			
}
