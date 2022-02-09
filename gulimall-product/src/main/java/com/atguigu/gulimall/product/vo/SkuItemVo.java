package com.atguigu.gulimall.product.vo;

import com.atguigu.gulimall.product.entity.SkuImagesEntity;
import com.atguigu.gulimall.product.entity.SkuInfoEntity;
import com.atguigu.gulimall.product.entity.SpuInfoDescEntity;
import lombok.Data;

import java.util.List;

/**
 * @program: gulimall
 * @description: 详情页vo
 * @author: XinLi
 * @create: 2022-02-09 15:52
 **/
@Data
public class SkuItemVo {
    //1.获取sku基本信息 sku_info
    SkuInfoEntity info;
    //2.获取sku的图片信息
    List<SkuImagesEntity> images;
    //3.获取spu的销售属性组合
    List<SkuItemSaleAttrVo> saleAttr;
    //4.获取spu的介绍
    SpuInfoDescEntity desp;
    //5.规格spu参数信息
    List<SpuItemAttrGroupVo> groupAttrs;

    @Data
    public static class SkuItemSaleAttrVo{
        private Long attrId;
        private String attrName;
        private List<String> attrValues;
    }

    @Data
    public static class SpuItemAttrGroupVo{
        private String groupName;
        private List<SpuBaseAttrVo> attrs;
    }

    @Data
    public static class SpuBaseAttrVo{
        private String attrName;
        private String attrValue;
    }
}
