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


import com.dao.XiaohaopinDao;
import com.entity.XiaohaopinEntity;
import com.service.XiaohaopinService;
import com.entity.vo.XiaohaopinVO;
import com.entity.view.XiaohaopinView;

@Service("xiaohaopinService")
public class XiaohaopinServiceImpl extends ServiceImpl<XiaohaopinDao, XiaohaopinEntity> implements XiaohaopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaohaopinEntity> page = this.selectPage(
                new Query<XiaohaopinEntity>(params).getPage(),
                new EntityWrapper<XiaohaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaohaopinEntity> wrapper) {
		  Page<XiaohaopinView> page =new Query<XiaohaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaohaopinVO> selectListVO(Wrapper<XiaohaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaohaopinVO selectVO(Wrapper<XiaohaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaohaopinView> selectListView(Wrapper<XiaohaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaohaopinView selectView(Wrapper<XiaohaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
