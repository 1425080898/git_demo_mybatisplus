package com.lzb.utils;

import java.util.Calendar;

/**
 * @Author: lifei
 * @Description:
 * @Date: 2020/9/8
 */
public class TimeUtil {
    // 获取当月0点时间戳
    public static Long monthTimeInMillis() {
        Calendar calendar = Calendar.getInstance();// 获取当前日期
        calendar.add(Calendar.YEAR, 0);
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);// 设置为1号,当前日期既为本月第一天
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Long time = calendar.getTimeInMillis();
        return time;
    }
}
