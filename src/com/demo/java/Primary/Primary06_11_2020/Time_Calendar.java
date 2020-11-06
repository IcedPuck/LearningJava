package com.demo.java.Primary.Primary06_11_2020;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time_Calendar {
    public void Step1(){
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //通过日历对象得到日期对象
        Date date = c.getTime();
        System.out.println(date.toString());
        Date date1 = new Date(0);
        c.setTime(date1);//把这个日历，调成日期 : 1970.1.1 08:00:00
        System.out.println(date1.toString());
    }
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static String format(Date time){
        return simpleDateFormat.format(time);
    }
    public void Step2(){
        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        //当前日期
        System.out.println("当前日期：\t" + format(calendar.getTime()));
        // 下个月的今天
        calendar.setTime(now);
        calendar.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" + format(calendar.getTime()));
        // 去年的今天
        calendar.setTime(now);
        calendar.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" + format(calendar.getTime()));
        // 上个月的第三天
        calendar.setTime(now);
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" + format(calendar.getTime()));
    }
    public static void main(String[] args) {
        Time_Calendar time_calendar = new Time_Calendar();
        time_calendar.Step1();
        time_calendar.Step2();
    }
}
