package com.dao;

import com.entity.DiscusskechengzuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskechengzuoyeVO;
import com.entity.view.DiscusskechengzuoyeView;


/**
 * 课程作业评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-05 11:41:25
 */
public interface DiscusskechengzuoyeDao extends BaseMapper<DiscusskechengzuoyeEntity> {
	
	List<DiscusskechengzuoyeVO> selectListVO(@Param("ew") Wrapper<DiscusskechengzuoyeEntity> wrapper);
	
	DiscusskechengzuoyeVO selectVO(@Param("ew") Wrapper<DiscusskechengzuoyeEntity> wrapper);
	
	List<DiscusskechengzuoyeView> selectListView(@Param("ew") Wrapper<DiscusskechengzuoyeEntity> wrapper);

	List<DiscusskechengzuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskechengzuoyeEntity> wrapper);

	
	DiscusskechengzuoyeView selectView(@Param("ew") Wrapper<DiscusskechengzuoyeEntity> wrapper);
	

}
