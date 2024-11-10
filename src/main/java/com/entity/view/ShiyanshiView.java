package com.entity.view;

import com.entity.ShiyanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验室
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
@TableName("shiyanshi")
public class ShiyanshiView  extends ShiyanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanshiView(){
	}
 
 	public ShiyanshiView(ShiyanshiEntity shiyanshiEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
