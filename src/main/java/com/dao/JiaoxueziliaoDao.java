package com.dao;

import com.entity.JiaoxueziliaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoxueziliaoVO;
import com.entity.view.JiaoxueziliaoView;


/**
 * 教学资料
 * 
 * @author 
 * @email 
 * @date 2024-03-05 11:41:23
 */
public interface JiaoxueziliaoDao extends BaseMapper<JiaoxueziliaoEntity> {
	
	List<JiaoxueziliaoVO> selectListVO(@Param("ew") Wrapper<JiaoxueziliaoEntity> wrapper);
	
	JiaoxueziliaoVO selectVO(@Param("ew") Wrapper<JiaoxueziliaoEntity> wrapper);
	
	List<JiaoxueziliaoView> selectListView(@Param("ew") Wrapper<JiaoxueziliaoEntity> wrapper);

	List<JiaoxueziliaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoxueziliaoEntity> wrapper);

	
	JiaoxueziliaoView selectView(@Param("ew") Wrapper<JiaoxueziliaoEntity> wrapper);
	

}
