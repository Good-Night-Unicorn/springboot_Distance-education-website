package com.entity.view;

import com.entity.JiaoxueziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 教学资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 11:41:23
 */
@TableName("jiaoxueziliao")
public class JiaoxueziliaoView  extends JiaoxueziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxueziliaoView(){
	}
 
 	public JiaoxueziliaoView(JiaoxueziliaoEntity jiaoxueziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxueziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
