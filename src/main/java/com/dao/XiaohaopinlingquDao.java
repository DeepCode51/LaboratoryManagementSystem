package com.dao;

import com.entity.XiaohaopinlingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaohaopinlingquVO;
import com.entity.view.XiaohaopinlingquView;


/**
 * 消耗品领取
 * 
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface XiaohaopinlingquDao extends BaseMapper<XiaohaopinlingquEntity> {
	
	List<XiaohaopinlingquVO> selectListVO(@Param("ew") Wrapper<XiaohaopinlingquEntity> wrapper);
	
	XiaohaopinlingquVO selectVO(@Param("ew") Wrapper<XiaohaopinlingquEntity> wrapper);
	
	List<XiaohaopinlingquView> selectListView(@Param("ew") Wrapper<XiaohaopinlingquEntity> wrapper);

	List<XiaohaopinlingquView> selectListView(Pagination page,@Param("ew") Wrapper<XiaohaopinlingquEntity> wrapper);
	
	XiaohaopinlingquView selectView(@Param("ew") Wrapper<XiaohaopinlingquEntity> wrapper);
	
}
