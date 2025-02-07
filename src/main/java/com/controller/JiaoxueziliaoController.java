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

import com.entity.JiaoxueziliaoEntity;
import com.entity.view.JiaoxueziliaoView;

import com.service.JiaoxueziliaoService;
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
 * 教学资料
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 11:41:23
 */
@RestController
@RequestMapping("/jiaoxueziliao")
public class JiaoxueziliaoController {
    @Autowired
    private JiaoxueziliaoService jiaoxueziliaoService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoxueziliaoEntity jiaoxueziliao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoxueziliao.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoxueziliaoEntity> ew = new EntityWrapper<JiaoxueziliaoEntity>();

		PageUtils page = jiaoxueziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueziliao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoxueziliaoEntity jiaoxueziliao, 
		HttpServletRequest request){
        EntityWrapper<JiaoxueziliaoEntity> ew = new EntityWrapper<JiaoxueziliaoEntity>();

		PageUtils page = jiaoxueziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueziliao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoxueziliaoEntity jiaoxueziliao){
       	EntityWrapper<JiaoxueziliaoEntity> ew = new EntityWrapper<JiaoxueziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoxueziliao, "jiaoxueziliao")); 
        return R.ok().put("data", jiaoxueziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoxueziliaoEntity jiaoxueziliao){
        EntityWrapper< JiaoxueziliaoEntity> ew = new EntityWrapper< JiaoxueziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoxueziliao, "jiaoxueziliao")); 
		JiaoxueziliaoView jiaoxueziliaoView =  jiaoxueziliaoService.selectView(ew);
		return R.ok("查询教学资料成功").put("data", jiaoxueziliaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoxueziliaoEntity jiaoxueziliao = jiaoxueziliaoService.selectById(id);
		jiaoxueziliao.setClicknum(jiaoxueziliao.getClicknum()+1);
		jiaoxueziliao.setClicktime(new Date());
		jiaoxueziliaoService.updateById(jiaoxueziliao);
        jiaoxueziliao = jiaoxueziliaoService.selectView(new EntityWrapper<JiaoxueziliaoEntity>().eq("id", id));
        return R.ok().put("data", jiaoxueziliao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoxueziliaoEntity jiaoxueziliao = jiaoxueziliaoService.selectById(id);
		jiaoxueziliao.setClicknum(jiaoxueziliao.getClicknum()+1);
		jiaoxueziliao.setClicktime(new Date());
		jiaoxueziliaoService.updateById(jiaoxueziliao);
        jiaoxueziliao = jiaoxueziliaoService.selectView(new EntityWrapper<JiaoxueziliaoEntity>().eq("id", id));
        return R.ok().put("data", jiaoxueziliao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoxueziliaoEntity jiaoxueziliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoxueziliao);
        jiaoxueziliaoService.insert(jiaoxueziliao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoxueziliaoEntity jiaoxueziliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoxueziliao);
        jiaoxueziliaoService.insert(jiaoxueziliao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoxueziliaoEntity jiaoxueziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoxueziliao);
        jiaoxueziliaoService.updateById(jiaoxueziliao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoxueziliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,JiaoxueziliaoEntity jiaoxueziliao, HttpServletRequest request,String pre){
        EntityWrapper<JiaoxueziliaoEntity> ew = new EntityWrapper<JiaoxueziliaoEntity>();
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
		PageUtils page = jiaoxueziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueziliao), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,JiaoxueziliaoEntity jiaoxueziliao, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "kechengleibie";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "jiaoxueziliao").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<JiaoxueziliaoEntity> jiaoxueziliaoList = new ArrayList<JiaoxueziliaoEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                jiaoxueziliaoList.addAll(jiaoxueziliaoService.selectList(new EntityWrapper<JiaoxueziliaoEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<JiaoxueziliaoEntity> ew = new EntityWrapper<JiaoxueziliaoEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = jiaoxueziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxueziliao), params), params));
        List<JiaoxueziliaoEntity> pageList = (List<JiaoxueziliaoEntity>)page.getList();
        if(jiaoxueziliaoList.size()<limit) {
            int toAddNum = (limit-jiaoxueziliaoList.size())<=pageList.size()?(limit-jiaoxueziliaoList.size()):pageList.size();
            for(JiaoxueziliaoEntity o1 : pageList) {
                boolean addFlag = true;
                for(JiaoxueziliaoEntity o2 : jiaoxueziliaoList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    jiaoxueziliaoList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(jiaoxueziliaoList.size()>limit) {
            jiaoxueziliaoList = jiaoxueziliaoList.subList(0, limit);
        }
        page.setList(jiaoxueziliaoList);
        return R.ok().put("data", page);
    }








}
