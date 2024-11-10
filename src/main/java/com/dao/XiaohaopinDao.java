package com.dao;

import com.entity.XiaohaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaohaopinVO;
import com.entity.view.XiaohaopinView;


/**
 * 消耗品
 * 
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface XiaohaopinDao extends BaseMapper<XiaohaopinEntity> {
	
	List<XiaohaopinVO> selectListVO(@Param("ew") Wrapper<XiaohaopinEntity> wrapper);
	
	XiaohaopinVO selectVO(@Param("ew") Wrapper<XiaohaopinEntity> wrapper);
	
	List<XiaohaopinView> selectListView(@Param("ew") Wrapper<XiaohaopinEntity> wrapper);

	List<XiaohaopinView> selectListView(Pagination page,@Param("ew") Wrapper<XiaohaopinEntity> wrapper);
	
	XiaohaopinView selectView(@Param("ew") Wrapper<XiaohaopinEntity> wrapper);
	
}
