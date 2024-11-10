package com.dao;

import com.entity.ShebeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeiVO;
import com.entity.view.ShebeiView;


/**
 * 设备
 * 
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShebeiDao extends BaseMapper<ShebeiEntity> {
	
	List<ShebeiVO> selectListVO(@Param("ew") Wrapper<ShebeiEntity> wrapper);
	
	ShebeiVO selectVO(@Param("ew") Wrapper<ShebeiEntity> wrapper);
	
	List<ShebeiView> selectListView(@Param("ew") Wrapper<ShebeiEntity> wrapper);

	List<ShebeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeiEntity> wrapper);
	
	ShebeiView selectView(@Param("ew") Wrapper<ShebeiEntity> wrapper);
	
}
