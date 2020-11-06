package com.demo.java.Primary06_11_2020;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_Format {
    /**
     *  日期转字符串
     *          //y 代表年
     *         //M 代表月
     *         //d 代表日
     *         //H 代表24进制的小时
     *         //h 代表12进制的小时
     *         //m 代表分钟
     *         //s 代表秒
     *         //S 代表毫秒
     */
    public void Step1(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: " + str);
        System.out.println("当前时间未通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: " + date);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = new Date();
        String str1 = simpleDateFormat1.format(date1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1 + "\n");
    }

    /**
     * 字符串转日期
     *
     * 模式（yyyy-MM-dd HH:mm:ss）需要和字符串格式保持一致，如果不一样就会抛出解析异常ParseException
     */
    public void Step2(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2016-01-05 12:12:12";
        try {
            Date d = simpleDateFormat.parse(str);
            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s", str, d.toString());
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Time_Format time_format = new Time_Format();
        time_format.Step1();
        time_format.Step2();
    }
}
