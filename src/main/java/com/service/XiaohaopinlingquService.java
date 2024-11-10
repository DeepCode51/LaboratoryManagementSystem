package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaohaopinlingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaohaopinlingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaohaopinlingquView;


/**
 * 消耗品领取
 *
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
public interface XiaohaopinlingquService extends IService<XiaohaopinlingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaohaopinlingquVO> selectListVO(Wrapper<XiaohaopinlingquEntity> wrapper);
   	
   	XiaohaopinlingquVO selectVO(@Param("ew") Wrapper<XiaohaopinlingquEntity> wrapper);
   	
   	List<XiaohaopinlingquView> selectListView(Wrapper<XiaohaopinlingquEntity> wrapper);
   	
   	XiaohaopinlingquView selectView(@Param("ew") Wrapper<XiaohaopinlingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaohaopinlingquEntity> wrapper);
   	
}

