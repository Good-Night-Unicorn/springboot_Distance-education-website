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


import com.dao.DiscussjiaoxueziliaoDao;
import com.entity.DiscussjiaoxueziliaoEntity;
import com.service.DiscussjiaoxueziliaoService;
import com.entity.vo.DiscussjiaoxueziliaoVO;
import com.entity.view.DiscussjiaoxueziliaoView;

@Service("discussjiaoxueziliaoService")
public class DiscussjiaoxueziliaoServiceImpl extends ServiceImpl<DiscussjiaoxueziliaoDao, DiscussjiaoxueziliaoEntity> implements DiscussjiaoxueziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaoxueziliaoEntity> page = this.selectPage(
                new Query<DiscussjiaoxueziliaoEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaoxueziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaoxueziliaoEntity> wrapper) {
		  Page<DiscussjiaoxueziliaoView> page =new Query<DiscussjiaoxueziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussjiaoxueziliaoVO> selectListVO(Wrapper<DiscussjiaoxueziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaoxueziliaoVO selectVO(Wrapper<DiscussjiaoxueziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaoxueziliaoView> selectListView(Wrapper<DiscussjiaoxueziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaoxueziliaoView selectView(Wrapper<DiscussjiaoxueziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
