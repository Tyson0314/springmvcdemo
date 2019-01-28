/**
 * Copyright (C), 2018-2019
 * FileName: UserController1
 * Author:   Tyson
 * Date:     2019/1/26/0026 22:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.controller;

import com.tyson.po.User;
import com.tyson.validator.ValidationGroup1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Tyson
 * @create 2019/1/26/0026 22:59
 * @since 1.0.0
 */
@Slf4j
@Controller
public class UserController1 {
/*    @InitBinder
    public void initBinder(DataBinder binder) {
        binder.setValidator(new UserValidator());
    }*/
    /**
     *用@Valid标识需要校验的参数user，否则Spring不会对它进行校验
     * BindingResult参数告诉Spring数据校验单的错误由我们自己处理，否则Spring会直接抛出异常
     * BindingResult参数必须紧挨着@Valid参数，有多少个@Valid参数就有多少个BindingResult参数
     */
    @RequestMapping(value = "/login")
    public String login(@Validated(value = {ValidationGroup1.class}) User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
                List<ObjectError> errors = bindingResult.getAllErrors();
            for(ObjectError error : errors) {
                log.info(error.toString());
            }
            return "error";
        }
        return "success";
    }
}