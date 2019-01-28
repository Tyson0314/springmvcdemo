/**
 * Copyright (C), 2018-2019
 * FileName: CustomerController
 * Author:   Tyson
 * Date:     2019/1/16/0016 22:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.controller;

import com.tyson.po.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tyson
 * @create 2019/1/16/0016 22:46
 * @since 1.0.0
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    @RequestMapping(value = "/findCustomer")
    @ResponseBody
    public Customer findCustomer(Customer customer, BindingResult bindingResult) {
        LOGGER.info("findCustomer..." + " convert form date " + customer.getBirthday());
        if(bindingResult.hasErrors()) {
            FieldError error = bindingResult.getFieldError();
            LOGGER.info("Code: " + error.getCode() + ", Field: " + error.getField());
        }
        return customer;
    }
}