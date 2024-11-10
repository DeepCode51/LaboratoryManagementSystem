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


import com.dao.XiaohaopinlingquDao;
import com.entity.XiaohaopinlingquEntity;
import com.service.XiaohaopinlingquService;
import com.entity.vo.XiaohaopinlingquVO;
import com.entity.view.XiaohaopinlingquView;

@Service("xiaohaopinlingquService")
public class XiaohaopinlingquServiceImpl extends ServiceImpl<XiaohaopinlingquDao, XiaohaopinlingquEntity> implements XiaohaopinlingquService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaohaopinlingquEntity> page = this.selectPage(
                new Query<XiaohaopinlingquEntity>(params).getPage(),
                new EntityWrapper<XiaohaopinlingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaohaopinlingquEntity> wrapper) {
		  Page<XiaohaopinlingquView> page =new Query<XiaohaopinlingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaohaopinlingquVO> selectListVO(Wrapper<XiaohaopinlingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaohaopinlingquVO selectVO(Wrapper<XiaohaopinlingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaohaopinlingquView> selectListView(Wrapper<XiaohaopinlingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaohaopinlingquView selectView(Wrapper<XiaohaopinlingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
