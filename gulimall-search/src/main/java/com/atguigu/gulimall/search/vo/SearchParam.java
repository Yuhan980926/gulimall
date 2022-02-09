package com.atguigu.gulimall.search.vo;

import lombok.Data;

import java.util.List;

/**
 * @program: gulimall
 * @description: 封装页面所有可能传递的查询条件
 * @author: XinLi
 * @create: 2022-01-26 15:23
 **/
@Data
public class SearchParam {

    private String keyword;//页面传递过来的全文匹配关键字
    private Long catalog3Id;//三级分类id
    private String sort;//排序条件
    private Integer hasStock;//是否只显示有货
    private String skuPrice;//价格区间查询
    private List<Long> brandId;//按照品牌进行查询，可以多选
    private List<String> attrs;//按照属性进行筛选
    private Integer pageNum = 1;//页码

    private String _queryString;
}
