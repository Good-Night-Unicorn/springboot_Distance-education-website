package com.dao;

import com.entity.DiscussjiaoxueziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaoxueziliaoVO;
import com.entity.view.DiscussjiaoxueziliaoView;


/**
 * 教学资料评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-05 11:41:24
 */
public interface DiscussjiaoxueziliaoDao extends BaseMapper<DiscussjiaoxueziliaoEntity> {
	
	List<DiscussjiaoxueziliaoVO> selectListVO(@Param("ew") Wrapper<DiscussjiaoxueziliaoEntity> wrapper);
	
	DiscussjiaoxueziliaoVO selectVO(@Param("ew") Wrapper<DiscussjiaoxueziliaoEntity> wrapper);
	
	List<DiscussjiaoxueziliaoView> selectListView(@Param("ew") Wrapper<DiscussjiaoxueziliaoEntity> wrapper);

	List<DiscussjiaoxueziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaoxueziliaoEntity> wrapper);

	
	DiscussjiaoxueziliaoView selectView(@Param("ew") Wrapper<DiscussjiaoxueziliaoEntity> wrapper);
	

}
