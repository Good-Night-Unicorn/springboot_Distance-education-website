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


import com.dao.JiaoxueziliaoDao;
import com.entity.JiaoxueziliaoEntity;
import com.service.JiaoxueziliaoService;
import com.entity.vo.JiaoxueziliaoVO;
import com.entity.view.JiaoxueziliaoView;

@Service("jiaoxueziliaoService")
public class JiaoxueziliaoServiceImpl extends ServiceImpl<JiaoxueziliaoDao, JiaoxueziliaoEntity> implements JiaoxueziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxueziliaoEntity> page = this.selectPage(
                new Query<JiaoxueziliaoEntity>(params).getPage(),
                new EntityWrapper<JiaoxueziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxueziliaoEntity> wrapper) {
		  Page<JiaoxueziliaoView> page =new Query<JiaoxueziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiaoxueziliaoVO> selectListVO(Wrapper<JiaoxueziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxueziliaoVO selectVO(Wrapper<JiaoxueziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxueziliaoView> selectListView(Wrapper<JiaoxueziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxueziliaoView selectView(Wrapper<JiaoxueziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
