package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskechengzuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskechengzuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskechengzuoyeView;


/**
 * 课程作业评论表
 *
 * @author 
 * @email 
 * @date 2024-03-05 11:41:25
 */
public interface DiscusskechengzuoyeService extends IService<DiscusskechengzuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskechengzuoyeVO> selectListVO(Wrapper<DiscusskechengzuoyeEntity> wrapper);
   	
   	DiscusskechengzuoyeVO selectVO(@Param("ew") Wrapper<DiscusskechengzuoyeEntity> wrapper);
   	
   	List<DiscusskechengzuoyeView> selectListView(Wrapper<DiscusskechengzuoyeEntity> wrapper);
   	
   	DiscusskechengzuoyeView selectView(@Param("ew") Wrapper<DiscusskechengzuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskechengzuoyeEntity> wrapper);

   	

}

