/**
 * Copyright (C), 2018-2019
 * FileName: Worker
 * Author:   Tyson
 * Date:     2019/1/27/0027 23:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.po;

import com.tyson.validator.Min;
import com.tyson.validator.Money;
import com.tyson.validator.ValidationGroup1;
import com.tyson.validator.ValidationGroup2;

/**
 * @author Tyson
 * @create 2019/1/27/0027 23:13
 * @since 1.0.0
 */
public class Worker {
    private int age;
    private Double salary;

    @Min(value = 10, message = "最小年龄是10", groups = {ValidationGroup1.class})
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Money(message = "标准的金额格式是xxx.xx", groups = {ValidationGroup2.class})
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}