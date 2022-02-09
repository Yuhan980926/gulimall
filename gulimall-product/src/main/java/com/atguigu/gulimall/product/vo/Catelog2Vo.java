package com.atguigu.gulimall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: gulimall
 * @description:
 * @author: XinLi
 * @create: 2022-01-24 17:10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catelog2Vo {

    private String catelog1Id; //一级父分类id
    private List<Catelog3Vo> catalog3List; //三级子分类
    private String id;
    private String name;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Catelog3Vo{
        private String catelog2Id;
        private String id;
        private String name;
    }
}
