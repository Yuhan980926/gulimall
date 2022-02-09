package com.atguigu.common.to;

import lombok.Data;

/**
 * @program: gulimall
 * @description:
 * @author: XinLi
 * @create: 2022-01-24 10:47
 **/
@Data
public class SkuHasStockVo {
    private Long skuId;
    private Boolean hasStock;
}
