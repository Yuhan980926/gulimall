package com.atguigu.gulimall.product.dao;

import com.atguigu.common.constant.ProductConstant;
import com.atguigu.gulimall.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 * 
 * @author lixin
 * @email 708874882@qq.com
 * @date 2021-09-13 09:10:56
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {

    void updateSpuStatus(@Param("spuId") Long spuId, @Param("spuUp") int spuUp);
}
