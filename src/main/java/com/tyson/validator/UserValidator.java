/**
 * Copyright (C), 2018-2019
 * FileName: UserValidator
 * Author:   Tyson
 * Date:     2019/1/26/0026 22:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.validator;

import com.tyson.po.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author tyson
 * @create 2019/1/26/0026 22:47
 * @since 1.0.0
 */
public class UserValidator implements Validator {

    /**
     * 判断当前Validator实现类是否支持校验当前需要校验的实体类
     * UserValidator只支持对User对象的校验
     */
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    /**
     * @param errors 存放错误信息
     */
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", null, "name is empty");
        User user = (User)o;
        if(user.getName().length() <= 4) {
            errors.rejectValue("name", null, "name's length must be longer than 4");
        }
    }
}