/**
 * Copyright (C), 2018-2019
 * FileName: DateFormatter
 * Author:   Tyson
 * Date:     2019/1/17/0017 11:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tyson.formatter;

import com.tyson.converter.StringToDateConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Tyson
 * @create 2019/1/17/0017 11:41
 * @since 1.0.0
 */
public class DateFormatter implements Formatter<Date> {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringToDateConverter.class);
    private String datePattern;
    private SimpleDateFormat dateFormat;

    public DateFormatter(String datePattern) {
        this.datePattern = datePattern;
        this.dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setLenient(false);
        LOGGER.info("dateFormatter with datePattern \"" + datePattern + "\"");
    }

    public Date parse(String s, Locale locale) throws ParseException {
        try {
            System.out.println(s);
            return dateFormat.parse(s);
        } catch(IllegalArgumentException ex) {
            throw new IllegalArgumentException("Illegal date format. Please use \"" + datePattern + "\"");
        }
    }

    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}