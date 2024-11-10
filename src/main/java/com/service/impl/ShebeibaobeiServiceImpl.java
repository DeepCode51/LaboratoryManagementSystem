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


import com.dao.ShebeibaobeiDao;
import com.entity.ShebeibaobeiEntity;
import com.service.ShebeibaobeiService;
import com.entity.vo.ShebeibaobeiVO;
import com.entity.view.ShebeibaobeiView;

@Service("shebeibaobeiService")
public class ShebeibaobeiServiceImpl extends ServiceImpl<ShebeibaobeiDao, ShebeibaobeiEntity> implements ShebeibaobeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShebeibaobeiEntity> page = this.selectPage(
                new Query<ShebeibaobeiEntity>(params).getPage(),
                new EntityWrapper<ShebeibaobeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShebeibaobeiEntity> wrapper) {
		  Page<ShebeibaobeiView> page =new Query<ShebeibaobeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShebeibaobeiVO> selectListVO(Wrapper<ShebeibaobeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShebeibaobeiVO selectVO(Wrapper<ShebeibaobeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShebeibaobeiView> selectListView(Wrapper<ShebeibaobeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShebeibaobeiView selectView(Wrapper<ShebeibaobeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
