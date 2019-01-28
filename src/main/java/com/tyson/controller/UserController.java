/**
 * Copyright (C), 2018-2018
 * FileName: UserController
 * Author:   Tyson
 * Date:     2018/12/30/0030 16:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.controller;

import com.tyson.po.User;
import com.tyson.po.UserList;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Tyson
 * @create 2018/12/30/0030 16:31
 * @since 1.0.0
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/insertUser/{id}")
    public String insertUser(@PathVariable long id) {
        return "success";
    }

    @RequestMapping(value = "/findUser", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public User findUser(@RequestParam(value = "name", required = true) String name) {
        LOGGER.info("name: " + name);
        User user = new User();
        user.setName("tyson");
        user.setPassword("tyson");
        return user;
    }

    @RequestMapping("/findUserByCondition")
    public String findUserByCondition(@Valid User user, BindingResult bindingResult) {
        LOGGER.info("user_name: " + user.getName());
        if(bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            for(ObjectError error : errors) {
                LOGGER.info(error.toString());
                return "error";
            }
        }
        return "success";
    }

    @RequestMapping("/findUsers")
    @ResponseBody
    public List<User> findUsers(@Validated UserList userList) {
        List<User> users = userList.getUsers();
        for(User user : users) {
            LOGGER.info("name: " + user.getName());
        }
        return users;
    }
}