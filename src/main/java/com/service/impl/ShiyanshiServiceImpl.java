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


import com.dao.ShiyanshiDao;
import com.entity.ShiyanshiEntity;
import com.service.ShiyanshiService;
import com.entity.vo.ShiyanshiVO;
import com.entity.view.ShiyanshiView;

@Service("shiyanshiService")
public class ShiyanshiServiceImpl extends ServiceImpl<ShiyanshiDao, ShiyanshiEntity> implements ShiyanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshiEntity> page = this.selectPage(
                new Query<ShiyanshiEntity>(params).getPage(),
                new EntityWrapper<ShiyanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanshiEntity> wrapper) {
		  Page<ShiyanshiView> page =new Query<ShiyanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyanshiVO> selectListVO(Wrapper<ShiyanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshiVO selectVO(Wrapper<ShiyanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshiView> selectListView(Wrapper<ShiyanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshiView selectView(Wrapper<ShiyanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
