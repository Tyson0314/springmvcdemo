/**
 * Copyright (C), 2018-2019
 * FileName: HelloView
 * Author:   Tyson
 * Date:     2019/3/5/0005 15:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Tyson
 * @create 2019/3/5/0005 15:32
 * @since 1.0.0
 */
public class MyView implements View {

    public String getContentType() {
        return "text/html";
    }

    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().print("my view");
    }
}