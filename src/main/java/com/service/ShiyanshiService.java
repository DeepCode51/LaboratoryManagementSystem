package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshiView;


/**
 * 实验室
 *
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShiyanshiService extends IService<ShiyanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshiVO> selectListVO(Wrapper<ShiyanshiEntity> wrapper);
   	
   	ShiyanshiVO selectVO(@Param("ew") Wrapper<ShiyanshiEntity> wrapper);
   	
   	List<ShiyanshiView> selectListView(Wrapper<ShiyanshiEntity> wrapper);
   	
   	ShiyanshiView selectView(@Param("ew") Wrapper<ShiyanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshiEntity> wrapper);
   	
}

