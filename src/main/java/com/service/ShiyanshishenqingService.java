package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshishenqingView;


/**
 * 实验室申请
 *
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShiyanshishenqingService extends IService<ShiyanshishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshishenqingVO> selectListVO(Wrapper<ShiyanshishenqingEntity> wrapper);
   	
   	ShiyanshishenqingVO selectVO(@Param("ew") Wrapper<ShiyanshishenqingEntity> wrapper);
   	
   	List<ShiyanshishenqingView> selectListView(Wrapper<ShiyanshishenqingEntity> wrapper);
   	
   	ShiyanshishenqingView selectView(@Param("ew") Wrapper<ShiyanshishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshishenqingEntity> wrapper);
   	
}

