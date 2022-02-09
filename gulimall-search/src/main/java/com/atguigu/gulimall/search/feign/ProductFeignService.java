package com.atguigu.gulimall.search.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @program: gulimall
 * @description: 商品服务接口
 * @author: XinLi
 * @create: 2022-02-08 10:01
 **/
@FeignClient("gulimall-product")
public interface ProductFeignService {

    /**
     * 信息
     */
    @GetMapping("/product/attr/info/{attrId}")
    public R attrInfo(@PathVariable("attrId") Long attrId);

    @GetMapping("product/brand/infos")
    public R brandsInfo(@RequestParam("brandIds") List<Long> brandIds);
}
