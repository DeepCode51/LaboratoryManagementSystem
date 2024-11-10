package com.dao;

import com.entity.ShiyanshishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshishenqingVO;
import com.entity.view.ShiyanshishenqingView;


/**
 * 实验室申请
 * 
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShiyanshishenqingDao extends BaseMapper<ShiyanshishenqingEntity> {
	
	List<ShiyanshishenqingVO> selectListVO(@Param("ew") Wrapper<ShiyanshishenqingEntity> wrapper);
	
	ShiyanshishenqingVO selectVO(@Param("ew") Wrapper<ShiyanshishenqingEntity> wrapper);
	
	List<ShiyanshishenqingView> selectListView(@Param("ew") Wrapper<ShiyanshishenqingEntity> wrapper);

	List<ShiyanshishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshishenqingEntity> wrapper);
	
	ShiyanshishenqingView selectView(@Param("ew") Wrapper<ShiyanshishenqingEntity> wrapper);
	
}
