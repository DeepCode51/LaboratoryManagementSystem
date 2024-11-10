package com.dao;

import com.entity.ShebeibaobeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeibaobeiVO;
import com.entity.view.ShebeibaobeiView;


/**
 * 设备报备
 * 
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShebeibaobeiDao extends BaseMapper<ShebeibaobeiEntity> {
	
	List<ShebeibaobeiVO> selectListVO(@Param("ew") Wrapper<ShebeibaobeiEntity> wrapper);
	
	ShebeibaobeiVO selectVO(@Param("ew") Wrapper<ShebeibaobeiEntity> wrapper);
	
	List<ShebeibaobeiView> selectListView(@Param("ew") Wrapper<ShebeibaobeiEntity> wrapper);

	List<ShebeibaobeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeibaobeiEntity> wrapper);
	
	ShebeibaobeiView selectView(@Param("ew") Wrapper<ShebeibaobeiEntity> wrapper);
	
}
