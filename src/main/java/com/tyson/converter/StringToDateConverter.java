/**
 * Copyright (C), 2018-2019
 * FileName: StringToDateConverter
 * Author:   Tyson
 * Date:     2019/1/16/0016 21:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.converter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Tyson
 * @create 2019/1/16/0016 21:23
 * @since 1.0.0
 */
public class StringToDateConverter implements Converter<String, Date> {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringToDateConverter.class);
    private String dataPattern;

    //利用传给构造器的日期样式，将String转化成Date
    public StringToDateConverter(String dataPattern) {
        this.dataPattern = dataPattern;
        LOGGER.info("instantialing...converter with pattern:" + dataPattern);
    }

    public Date convert(String s) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(dataPattern);
            dateFormat.setLenient(false);
            return dateFormat.parse(s);
        } catch(Exception e) {
            throw new IllegalArgumentException("invalid date format");
        }
    }
}