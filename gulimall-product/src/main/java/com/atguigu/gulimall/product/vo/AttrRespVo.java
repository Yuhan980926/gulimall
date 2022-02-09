package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @program: gulimall
 * @description: attr响应vo
 * @author: XinLi
 * @create: 2022-01-14 19:23
 **/
@Data
public class AttrRespVo extends AttrVo{

    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
