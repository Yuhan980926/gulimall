package com.atguigu.common.exception;

/**
 * @program: gulimall
 * @description: 异常枚举类
 * @author: XinLi
 * @create: 2021-10-12 10:56
 **/
public enum BizCodeEnum {
    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    VALID_EXCEPTION(10001,"参数格式校验失败"),
    PRODUCT_UP_EXCEPTION(11000,"商品上架异常");

    private Integer code;
    private String msg;
    BizCodeEnum(Integer code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }
}
