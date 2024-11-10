package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShiyanshishenqingEntity;
import com.entity.view.ShiyanshishenqingView;

import com.service.ShiyanshishenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 实验室申请
 * 后端接口
 * @author 
 * @email 
 * @date 2020-11-25 08:55:47
 */
@RestController
@RequestMapping("/shiyanshishenqing")
public class ShiyanshishenqingController {
    @Autowired
    private ShiyanshishenqingService shiyanshishenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshishenqingEntity shiyanshishenqing, HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shiyanshishenqing.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiyanshishenqingEntity> ew = new EntityWrapper<ShiyanshishenqingEntity>();
		PageUtils page = shiyanshishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshishenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshishenqingEntity shiyanshishenqing, HttpServletRequest request){
        EntityWrapper<ShiyanshishenqingEntity> ew = new EntityWrapper<ShiyanshishenqingEntity>();
		PageUtils page = shiyanshishenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshishenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshishenqingEntity shiyanshishenqing){
       	EntityWrapper<ShiyanshishenqingEntity> ew = new EntityWrapper<ShiyanshishenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshishenqing, "shiyanshishenqing")); 
        return R.ok().put("data", shiyanshishenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshishenqingEntity shiyanshishenqing){
        EntityWrapper< ShiyanshishenqingEntity> ew = new EntityWrapper< ShiyanshishenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshishenqing, "shiyanshishenqing")); 
		ShiyanshishenqingView shiyanshishenqingView =  shiyanshishenqingService.selectView(ew);
		return R.ok("查询实验室申请成功").put("data", shiyanshishenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        ShiyanshishenqingEntity shiyanshishenqing = shiyanshishenqingService.selectById(id);
        return R.ok().put("data", shiyanshishenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        ShiyanshishenqingEntity shiyanshishenqing = shiyanshishenqingService.selectById(id);
        return R.ok().put("data", shiyanshishenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanshishenqingEntity shiyanshishenqing, HttpServletRequest request){
    	shiyanshishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanshishenqing);
        shiyanshishenqingService.insert(shiyanshishenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshishenqingEntity shiyanshishenqing, HttpServletRequest request){
    	shiyanshishenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanshishenqing);
        shiyanshishenqingService.insert(shiyanshishenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShiyanshishenqingEntity shiyanshishenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshishenqing);
        shiyanshishenqingService.updateById(shiyanshishenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanshishenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShiyanshishenqingEntity> wrapper = new EntityWrapper<ShiyanshishenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = shiyanshishenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
