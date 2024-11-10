package com.entity.view;

import com.entity.ShebeibaobeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 设备报备
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
@TableName("shebeibaobei")
public class ShebeibaobeiView  extends ShebeibaobeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShebeibaobeiView(){
	}
 
 	public ShebeibaobeiView(ShebeibaobeiEntity shebeibaobeiEntity){
 	try {
			BeanUtils.copyProperties(this, shebeibaobeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
