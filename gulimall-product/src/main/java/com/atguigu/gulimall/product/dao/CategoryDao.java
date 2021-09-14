package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lixin
 * @email 708874882@qq.com
 * @date 2021-09-13 09:10:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
