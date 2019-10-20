package com.eddie.javabase.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: AprilSky
 * @description: ThreadLocal 实现日期工具类
 * @author: Eddie.tran
 * @create: 2019-05-30 16:18:51
 * @version: V1.0
 **/
public class DateUtil {
    private static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_THREAD_LOCAL = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public String formatDate(Date date) {
        return SIMPLE_DATE_FORMAT_THREAD_LOCAL.get().format(date);
    }

}
