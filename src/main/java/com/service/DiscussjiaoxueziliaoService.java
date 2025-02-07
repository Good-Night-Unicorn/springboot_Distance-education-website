package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoxueziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoxueziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoxueziliaoView;


/**
 * 教学资料评论表
 *
 * @author 
 * @email 
 * @date 2024-03-05 11:41:24
 */
public interface DiscussjiaoxueziliaoService extends IService<DiscussjiaoxueziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoxueziliaoVO> selectListVO(Wrapper<DiscussjiaoxueziliaoEntity> wrapper);
   	
   	DiscussjiaoxueziliaoVO selectVO(@Param("ew") Wrapper<DiscussjiaoxueziliaoEntity> wrapper);
   	
   	List<DiscussjiaoxueziliaoView> selectListView(Wrapper<DiscussjiaoxueziliaoEntity> wrapper);
   	
   	DiscussjiaoxueziliaoView selectView(@Param("ew") Wrapper<DiscussjiaoxueziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoxueziliaoEntity> wrapper);

   	

}

