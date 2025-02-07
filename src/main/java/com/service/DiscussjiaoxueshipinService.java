package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoxueshipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoxueshipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoxueshipinView;


/**
 * 教学视频评论表
 *
 * @author 
 * @email 
 * @date 2024-03-05 11:41:24
 */
public interface DiscussjiaoxueshipinService extends IService<DiscussjiaoxueshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoxueshipinVO> selectListVO(Wrapper<DiscussjiaoxueshipinEntity> wrapper);
   	
   	DiscussjiaoxueshipinVO selectVO(@Param("ew") Wrapper<DiscussjiaoxueshipinEntity> wrapper);
   	
   	List<DiscussjiaoxueshipinView> selectListView(Wrapper<DiscussjiaoxueshipinEntity> wrapper);
   	
   	DiscussjiaoxueshipinView selectView(@Param("ew") Wrapper<DiscussjiaoxueshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoxueshipinEntity> wrapper);

   	

}

