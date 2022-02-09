package com.atguigu.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: gulimall
 * @description:
 * @author: XinLi
 * @create: 2021-10-12 11:42
 **/
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {

    private Set<Integer> set = new HashSet<>();

    //初始化方法
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] values = constraintAnnotation.values();
        for (int value : values) {
            set.add(value);
        }
    }

    //判断是否校验成功
    /**
     * @Author XinLi
     * @Description //需要校验的值
     * @Date 11:47 2021/10/12
     * @param value
     * @param constraintValidatorContext
     * @return boolean
     **/

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(value);
    }
}
