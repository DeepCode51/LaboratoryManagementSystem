package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeiView;


/**
 * 设备
 *
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShebeiService extends IService<ShebeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeiVO> selectListVO(Wrapper<ShebeiEntity> wrapper);
   	
   	ShebeiVO selectVO(@Param("ew") Wrapper<ShebeiEntity> wrapper);
   	
   	List<ShebeiView> selectListView(Wrapper<ShebeiEntity> wrapper);
   	
   	ShebeiView selectView(@Param("ew") Wrapper<ShebeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeiEntity> wrapper);
   	
}

