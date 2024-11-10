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


import com.dao.ShebeiDao;
import com.entity.ShebeiEntity;
import com.service.ShebeiService;
import com.entity.vo.ShebeiVO;
import com.entity.view.ShebeiView;

@Service("shebeiService")
public class ShebeiServiceImpl extends ServiceImpl<ShebeiDao, ShebeiEntity> implements ShebeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeiEntity> page = this.selectPage(
                new Query<ShebeiEntity>(params).getPage(),
                new EntityWrapper<ShebeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeiEntity> wrapper) {
		  Page<ShebeiView> page =new Query<ShebeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeiVO> selectListVO(Wrapper<ShebeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeiVO selectVO(Wrapper<ShebeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeiView> selectListView(Wrapper<ShebeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeiView selectView(Wrapper<ShebeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
