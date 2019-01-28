/**
 * Copyright (C), 2018-2018
 * FileName: User
 * Author:   Tyson
 * Date:     2018/12/30/0030 18:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.po;

import com.tyson.validator.ValidationGroup1;
import com.tyson.validator.ValidationGroup2;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Tyson
 * @create 2018/12/30/0030 18:48
 * @since 1.0.0
 */
public class User {
/*    @NotNull(message = "{user.id.null}")
    private Long id;

    @NotEmpty(message = "{user.name.null}")
    @Length(min = 5, max = 20, message = "{user.name.length.illegal}")
    @Pattern(regexp = "[a-zA-Z]{5,20}", message = "{user.name.illegal}")
    private String name;*/

    private String name;
    private String password;
    private int age;

    @NotBlank(message = "用户名不能为空", groups = {ValidationGroup1.class})
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull(message = "密码不能为null", groups = {ValidationGroup1.class})
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Min(value = 10, message = "年龄最小为10", groups = {ValidationGroup2.class})
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}