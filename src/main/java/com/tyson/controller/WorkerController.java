/**
 * Copyright (C), 2018-2019
 * FileName: WorkerController
 * Author:   Tyson
 * Date:     2019/1/27/0027 23:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.controller;

import com.tyson.po.Worker;
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
 * @create 2019/1/27/0027 23:22
 * @since 1.0.0
 */
@Slf4j
@Controller
public class WorkerController {
    @RequestMapping("/addWorker")
    public String addWorker(@Validated(value = {ValidationGroup1.class}) Worker worker, BindingResult bindingResult) {
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