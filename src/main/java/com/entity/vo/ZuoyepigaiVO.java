package com.entity.vo;

import com.entity.ZuoyepigaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作业批改
 * @author 
 * @email 
 * @date 2024-03-05 11:41:24
 */
public class ZuoyepigaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作业名称
	 */
	
	private String zuoyemingcheng;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 学生账号
	 */
	
	private String xueshengzhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 作业评分
	 */
	
	private String zuoyepingfen;
		
	/**
	 * 批改时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pigaishijian;
		
	/**
	 * 教师评语
	 */
	
	private String jiaoshipingyu;
				
	
	/**
	 * 设置：作业名称
	 */
	 
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：学生账号
	 */
	 
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：作业评分
	 */
	 
	public void setZuoyepingfen(String zuoyepingfen) {
		this.zuoyepingfen = zuoyepingfen;
	}
	
	/**
	 * 获取：作业评分
	 */
	public String getZuoyepingfen() {
		return zuoyepingfen;
	}
				
	
	/**
	 * 设置：批改时间
	 */
	 
	public void setPigaishijian(Date pigaishijian) {
		this.pigaishijian = pigaishijian;
	}
	
	/**
	 * 获取：批改时间
	 */
	public Date getPigaishijian() {
		return pigaishijian;
	}
				
	
	/**
	 * 设置：教师评语
	 */
	 
	public void setJiaoshipingyu(String jiaoshipingyu) {
		this.jiaoshipingyu = jiaoshipingyu;
	}
	
	/**
	 * 获取：教师评语
	 */
	public String getJiaoshipingyu() {
		return jiaoshipingyu;
	}
			
}
