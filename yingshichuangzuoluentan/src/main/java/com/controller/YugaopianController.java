
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 预告
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yugaopian")
public class YugaopianController {
    private static final Logger logger = LoggerFactory.getLogger(YugaopianController.class);

    @Autowired
    private YugaopianService yugaopianService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = yugaopianService.queryPage(params);

        //字典表数据转换
        List<YugaopianView> list =(List<YugaopianView>)page.getList();
        for(YugaopianView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YugaopianEntity yugaopian = yugaopianService.selectById(id);
        if(yugaopian !=null){
            //entity转view
            YugaopianView view = new YugaopianView();
            BeanUtils.copyProperties( yugaopian , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YugaopianEntity yugaopian, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yugaopian:{}",this.getClass().getName(),yugaopian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<YugaopianEntity> queryWrapper = new EntityWrapper<YugaopianEntity>()
            .eq("yugaopian_uuid_number", yugaopian.getYugaopianUuidNumber())
            .eq("yugaopian_name", yugaopian.getYugaopianName())
            .eq("yugaopian_types", yugaopian.getYugaopianTypes())
            .eq("yugaopian_video", yugaopian.getYugaopianVideo())
            .eq("yugaopian_danyan", yugaopian.getYugaopianDanyan())
            .eq("yugaopian_bianju", yugaopian.getYugaopianBianju())
            .eq("yugaopian_address", yugaopian.getYugaopianAddress())
            .eq("yugaopian_yuyan", yugaopian.getYugaopianYuyan())
            .eq("yugaopian_shijian", yugaopian.getYugaopianShijian())
            .eq("yugaopian_pianchang", yugaopian.getYugaopianPianchang())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YugaopianEntity yugaopianEntity = yugaopianService.selectOne(queryWrapper);
        if(yugaopianEntity==null){
            yugaopian.setCreateTime(new Date());
            yugaopianService.insert(yugaopian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YugaopianEntity yugaopian, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yugaopian:{}",this.getClass().getName(),yugaopian.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<YugaopianEntity> queryWrapper = new EntityWrapper<YugaopianEntity>()
            .notIn("id",yugaopian.getId())
            .andNew()
            .eq("yugaopian_uuid_number", yugaopian.getYugaopianUuidNumber())
            .eq("yugaopian_name", yugaopian.getYugaopianName())
            .eq("yugaopian_types", yugaopian.getYugaopianTypes())
            .eq("yugaopian_video", yugaopian.getYugaopianVideo())
            .eq("yugaopian_danyan", yugaopian.getYugaopianDanyan())
            .eq("yugaopian_bianju", yugaopian.getYugaopianBianju())
            .eq("yugaopian_address", yugaopian.getYugaopianAddress())
            .eq("yugaopian_yuyan", yugaopian.getYugaopianYuyan())
            .eq("yugaopian_shijian", yugaopian.getYugaopianShijian())
            .eq("yugaopian_pianchang", yugaopian.getYugaopianPianchang())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YugaopianEntity yugaopianEntity = yugaopianService.selectOne(queryWrapper);
        if("".equals(yugaopian.getYugaopianPhoto()) || "null".equals(yugaopian.getYugaopianPhoto())){
                yugaopian.setYugaopianPhoto(null);
        }
        if("".equals(yugaopian.getYugaopianVideo()) || "null".equals(yugaopian.getYugaopianVideo())){
                yugaopian.setYugaopianVideo(null);
        }
        if(yugaopianEntity==null){
            yugaopianService.updateById(yugaopian);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yugaopianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<YugaopianEntity> yugaopianList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YugaopianEntity yugaopianEntity = new YugaopianEntity();
//                            yugaopianEntity.setYugaopianUuidNumber(data.get(0));                    //预告片编号 要改的
//                            yugaopianEntity.setYugaopianName(data.get(0));                    //电影名称 要改的
//                            yugaopianEntity.setYugaopianTypes(Integer.valueOf(data.get(0)));   //电影类型 要改的
//                            yugaopianEntity.setYugaopianPhoto("");//照片
//                            yugaopianEntity.setYugaopianVideo(data.get(0));                    //视频 要改的
//                            yugaopianEntity.setYugaopianDanyan(data.get(0));                    //导演 要改的
//                            yugaopianEntity.setYugaopianBianju(data.get(0));                    //编剧 要改的
//                            yugaopianEntity.setYugaopianAddress(data.get(0));                    //制片国家/地区 要改的
//                            yugaopianEntity.setYugaopianYuyan(data.get(0));                    //语言 要改的
//                            yugaopianEntity.setYugaopianShijian(data.get(0));                    //上映日期 要改的
//                            yugaopianEntity.setYugaopianPianchang(data.get(0));                    //片长 要改的
//                            yugaopianEntity.setYugaopianContent("");//照片
//                            yugaopianEntity.setCreateTime(date);//时间
                            yugaopianList.add(yugaopianEntity);


                            //把要查询是否重复的字段放入map中
                                //预告片编号
                                if(seachFields.containsKey("yugaopianUuidNumber")){
                                    List<String> yugaopianUuidNumber = seachFields.get("yugaopianUuidNumber");
                                    yugaopianUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yugaopianUuidNumber = new ArrayList<>();
                                    yugaopianUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("yugaopianUuidNumber",yugaopianUuidNumber);
                                }
                        }

                        //查询是否重复
                         //预告片编号
                        List<YugaopianEntity> yugaopianEntities_yugaopianUuidNumber = yugaopianService.selectList(new EntityWrapper<YugaopianEntity>().in("yugaopian_uuid_number", seachFields.get("yugaopianUuidNumber")));
                        if(yugaopianEntities_yugaopianUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YugaopianEntity s:yugaopianEntities_yugaopianUuidNumber){
                                repeatFields.add(s.getYugaopianUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [预告片编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yugaopianService.insertBatch(yugaopianList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = yugaopianService.queryPage(params);

        //字典表数据转换
        List<YugaopianView> list =(List<YugaopianView>)page.getList();
        for(YugaopianView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YugaopianEntity yugaopian = yugaopianService.selectById(id);
            if(yugaopian !=null){


                //entity转view
                YugaopianView view = new YugaopianView();
                BeanUtils.copyProperties( yugaopian , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody YugaopianEntity yugaopian, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,yugaopian:{}",this.getClass().getName(),yugaopian.toString());
        Wrapper<YugaopianEntity> queryWrapper = new EntityWrapper<YugaopianEntity>()
            .eq("yugaopian_uuid_number", yugaopian.getYugaopianUuidNumber())
            .eq("yugaopian_name", yugaopian.getYugaopianName())
            .eq("yugaopian_types", yugaopian.getYugaopianTypes())
            .eq("yugaopian_video", yugaopian.getYugaopianVideo())
            .eq("yugaopian_danyan", yugaopian.getYugaopianDanyan())
            .eq("yugaopian_bianju", yugaopian.getYugaopianBianju())
            .eq("yugaopian_address", yugaopian.getYugaopianAddress())
            .eq("yugaopian_yuyan", yugaopian.getYugaopianYuyan())
            .eq("yugaopian_shijian", yugaopian.getYugaopianShijian())
            .eq("yugaopian_pianchang", yugaopian.getYugaopianPianchang())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YugaopianEntity yugaopianEntity = yugaopianService.selectOne(queryWrapper);
        if(yugaopianEntity==null){
            yugaopian.setCreateTime(new Date());
        yugaopianService.insert(yugaopian);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
