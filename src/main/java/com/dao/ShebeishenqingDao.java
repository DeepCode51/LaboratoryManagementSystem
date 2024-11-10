package com.dao;

import com.entity.ShebeishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShebeishenqingVO;
import com.entity.view.ShebeishenqingView;


/**
 * 设备申请
 * 
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface ShebeishenqingDao extends BaseMapper<ShebeishenqingEntity> {
	
	List<ShebeishenqingVO> selectListVO(@Param("ew") Wrapper<ShebeishenqingEntity> wrapper);
	
	ShebeishenqingVO selectVO(@Param("ew") Wrapper<ShebeishenqingEntity> wrapper);
	
	List<ShebeishenqingView> selectListView(@Param("ew") Wrapper<ShebeishenqingEntity> wrapper);

	List<ShebeishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<ShebeishenqingEntity> wrapper);
	
	ShebeishenqingView selectView(@Param("ew") Wrapper<ShebeishenqingEntity> wrapper);
	
}
