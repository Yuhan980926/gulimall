package com.atguigu.gulimall.search.service;

import com.atguigu.gulimall.search.vo.SearchParam;
import com.atguigu.gulimall.search.vo.SearchResult;

/**
 * @program: gulimall
 * @description:
 * @author: XinLi
 * @create: 2022-01-26 15:25
 **/
public interface MallSearchService {

    /**
     *
     * @param param 检索的所有参数
     * @return 检索结果
     */
    SearchResult search(SearchParam param);
}
