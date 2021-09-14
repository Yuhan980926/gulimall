package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lixin
 * @email 708874882@qq.com
 * @date 2021-09-13 11:42:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
