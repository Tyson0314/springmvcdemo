/**
 * Copyright (C), 2018-2019
 * FileName: MinValidator
 * Author:   Tyson
 * Date:     2019/1/27/0027 23:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Tyson
 * @create 2019/1/27/0027 23:09
 * @since 1.0.0
 */
public class MinValidator implements ConstraintValidator<Min, Integer> {
    private int minValue;

    public void initialize(Min min) {
        minValue = min.value();
    }

    public boolean isValid(Integer val, ConstraintValidatorContext constraintValidatorContext) {
        return val >= minValue;
    }
}