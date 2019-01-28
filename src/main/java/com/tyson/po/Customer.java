/**
 * Copyright (C), 2018-2019
 * FileName: Customer
 * Author:   Tyson
 * Date:     2019/1/16/0016 22:47
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.po;

import java.util.Date;

/**
 * @author Tyson
 * @create 2019/1/16/0016 22:47
 * @since 1.0.0
 */
public class Customer {
    private long id;
    private Date birthday;
    private int age;

    public Customer(int id,Date date) {
        this.id = id;
        this.birthday = date;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}