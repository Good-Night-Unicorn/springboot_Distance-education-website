package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiaoxueshipinEntity;
import com.entity.view.JiaoxueshipinView;

import com.service.JiaoxueshipinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 教学视频
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 11:41:23
 */
@RestController
@RequestMapping("/jiaoxueshipin")
public class JiaoxueshipinController {
    @Autowired
    private JiaoxueshipinService jiaoxueshipinService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoxueshipinEntity jiaoxueshipin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoxueshipin.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();

		PageUtils page = jiaoxueshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueshipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoxueshipinEntity jiaoxueshipin, 
		HttpServletRequest request){
        EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();

		PageUtils page = jiaoxueshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueshipin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoxueshipinEntity jiaoxueshipin){
       	EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoxueshipin, "jiaoxueshipin")); 
        return R.ok().put("data", jiaoxueshipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoxueshipinEntity jiaoxueshipin){
        EntityWrapper< JiaoxueshipinEntity> ew = new EntityWrapper< JiaoxueshipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoxueshipin, "jiaoxueshipin")); 
		JiaoxueshipinView jiaoxueshipinView =  jiaoxueshipinService.selectView(ew);
		return R.ok("查询教学视频成功").put("data", jiaoxueshipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoxueshipinEntity jiaoxueshipin = jiaoxueshipinService.selectById(id);
		jiaoxueshipin.setClicknum(jiaoxueshipin.getClicknum()+1);
		jiaoxueshipin.setClicktime(new Date());
		jiaoxueshipinService.updateById(jiaoxueshipin);
        jiaoxueshipin = jiaoxueshipinService.selectView(new EntityWrapper<JiaoxueshipinEntity>().eq("id", id));
        return R.ok().put("data", jiaoxueshipin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoxueshipinEntity jiaoxueshipin = jiaoxueshipinService.selectById(id);
		jiaoxueshipin.setClicknum(jiaoxueshipin.getClicknum()+1);
		jiaoxueshipin.setClicktime(new Date());
		jiaoxueshipinService.updateById(jiaoxueshipin);
        jiaoxueshipin = jiaoxueshipinService.selectView(new EntityWrapper<JiaoxueshipinEntity>().eq("id", id));
        return R.ok().put("data", jiaoxueshipin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoxueshipin);
        jiaoxueshipinService.insert(jiaoxueshipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoxueshipin);
        jiaoxueshipinService.insert(jiaoxueshipin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoxueshipin);
        jiaoxueshipinService.updateById(jiaoxueshipin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoxueshipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request,String pre){
        EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = jiaoxueshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueshipin), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,JiaoxueshipinEntity jiaoxueshipin, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "kechengleibie";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "jiaoxueshipin").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<JiaoxueshipinEntity> jiaoxueshipinList = new ArrayList<JiaoxueshipinEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                jiaoxueshipinList.addAll(jiaoxueshipinService.selectList(new EntityWrapper<JiaoxueshipinEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<JiaoxueshipinEntity> ew = new EntityWrapper<JiaoxueshipinEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = jiaoxueshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueshipin), params), params));
        List<JiaoxueshipinEntity> pageList = (List<JiaoxueshipinEntity>)page.getList();
        if(jiaoxueshipinList.size()<limit) {
            int toAddNum = (limit-jiaoxueshipinList.size())<=pageList.size()?(limit-jiaoxueshipinList.size()):pageList.size();
            for(JiaoxueshipinEntity o1 : pageList) {
                boolean addFlag = true;
                for(JiaoxueshipinEntity o2 : jiaoxueshipinList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    jiaoxueshipinList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(jiaoxueshipinList.size()>limit) {
            jiaoxueshipinList = jiaoxueshipinList.subList(0, limit);
        }
        page.setList(jiaoxueshipinList);
        return R.ok().put("data", page);
    }








}
