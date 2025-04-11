package com.dao;

import com.entity.YugaopianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YugaopianView;

/**
 * 预告 Dao 接口
 *
 * @author 
 */
public interface YugaopianDao extends BaseMapper<YugaopianEntity> {

   List<YugaopianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
