package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShebeibaobeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShebeibaobeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShebeibaobeiView;


/**
 * 设备报备
 *
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShebeibaobeiService extends IService<ShebeibaobeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShebeibaobeiVO> selectListVO(Wrapper<ShebeibaobeiEntity> wrapper);
   	
   	ShebeibaobeiVO selectVO(@Param("ew") Wrapper<ShebeibaobeiEntity> wrapper);
   	
   	List<ShebeibaobeiView> selectListView(Wrapper<ShebeibaobeiEntity> wrapper);
   	
   	ShebeibaobeiView selectView(@Param("ew") Wrapper<ShebeibaobeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShebeibaobeiEntity> wrapper);
   	
}

