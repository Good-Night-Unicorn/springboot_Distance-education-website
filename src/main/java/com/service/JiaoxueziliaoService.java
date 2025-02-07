package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxueziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxueziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxueziliaoView;


/**
 * 教学资料
 *
 * @author 
 * @email 
 * @date 2024-03-05 11:41:23
 */
public interface JiaoxueziliaoService extends IService<JiaoxueziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxueziliaoVO> selectListVO(Wrapper<JiaoxueziliaoEntity> wrapper);
   	
   	JiaoxueziliaoVO selectVO(@Param("ew") Wrapper<JiaoxueziliaoEntity> wrapper);
   	
   	List<JiaoxueziliaoView> selectListView(Wrapper<JiaoxueziliaoEntity> wrapper);
   	
   	JiaoxueziliaoView selectView(@Param("ew") Wrapper<JiaoxueziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxueziliaoEntity> wrapper);

   	

}

