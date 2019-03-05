/**
 * Copyright (C), 2018-2019
 * FileName: MyViewController
 * Author:   Tyson
 * Date:     2019/3/5/0005 15:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Tyson
 * @create 2019/3/5/0005 15:36
 * @since 1.0.0
 */
@Controller
public class MyViewController {
    @RequestMapping("/myView")
    public String myView() {
        return "myView";
    }
}