/**
 * Copyright (C), 2018-2019
 * FileName: MoneyValidator
 * Author:   Tyson
 * Date:     2019/1/27/0027 22:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author Tyson
 * @create 2019/1/27/0027 22:56
 * @since 1.0.0
 */
public class MoneyValidator implements ConstraintValidator<Money, Double> {
    private String moneyReg = "^\\d+(\\.\\d{1,2})?$"; //表示金额的正则表达式
    private Pattern moneyPattern = Pattern.compile(moneyReg);

    /**
     * 通过initialize可以获取限制类型
     */
    public void initialize(Money money) {
    }

    public boolean isValid(Double value, ConstraintValidatorContext constraintValidatorContext) {
        if(value == null) {
            return false;
        }
        return moneyPattern.matcher(value.toString()).matches();
    }
}