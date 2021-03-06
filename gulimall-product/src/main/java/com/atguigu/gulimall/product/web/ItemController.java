package com.atguigu.gulimall.product.web;

import com.atguigu.gulimall.product.service.SkuInfoService;
import com.atguigu.gulimall.product.vo.SkuItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @program: gulimall
 * @description: 商品详情页
 * @author: XinLi
 * @create: 2022-02-09 15:30
 **/
@Controller
public class ItemController {

    @Autowired
    SkuInfoService skuInfoService;


    /**
     * 展现当前sku的详情
     * @param skuId
     * @return
     */
    @GetMapping("/{skuId}.html")
    public String skuItem(@PathVariable("skuId") Long skuId){
        System.out.println("准备查询");
        SkuItemVo vo = skuInfoService.item(skuId);
        return "item";
    }
}
