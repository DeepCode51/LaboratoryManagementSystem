package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiyanshishenqingDao;
import com.entity.ShiyanshishenqingEntity;
import com.service.ShiyanshishenqingService;
import com.entity.vo.ShiyanshishenqingVO;
import com.entity.view.ShiyanshishenqingView;

@Service("shiyanshishenqingService")
public class ShiyanshishenqingServiceImpl extends ServiceImpl<ShiyanshishenqingDao, ShiyanshishenqingEntity> implements ShiyanshishenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshishenqingEntity> page = this.selectPage(
                new Query<ShiyanshishenqingEntity>(params).getPage(),
                new EntityWrapper<ShiyanshishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanshishenqingEntity> wrapper) {
		  Page<ShiyanshishenqingView> page =new Query<ShiyanshishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanshishenqingVO> selectListVO(Wrapper<ShiyanshishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshishenqingVO selectVO(Wrapper<ShiyanshishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshishenqingView> selectListView(Wrapper<ShiyanshishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshishenqingView selectView(Wrapper<ShiyanshishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
