package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaohaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaohaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaohaopinView;


/**
 * 消耗品
 *
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface XiaohaopinService extends IService<XiaohaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaohaopinVO> selectListVO(Wrapper<XiaohaopinEntity> wrapper);
   	
   	XiaohaopinVO selectVO(@Param("ew") Wrapper<XiaohaopinEntity> wrapper);
   	
   	List<XiaohaopinView> selectListView(Wrapper<XiaohaopinEntity> wrapper);
   	
   	XiaohaopinView selectView(@Param("ew") Wrapper<XiaohaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaohaopinEntity> wrapper);
   	
}

