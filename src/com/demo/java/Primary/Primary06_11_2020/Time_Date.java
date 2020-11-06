package com.demo.java.Primary.Primary06_11_2020;

import java.util.Date;

public class Time_Date {
    /**
     * 创建日期对象
     */
    public void Step1(){
        Date date = new Date();
        System.out.println("当前时间: " + date +"\n");

        // 从1970年1月1日 早上8点0分0秒 开始经历的毫秒数
        Date date1 = new Date(5000);
        System.out.println(date1);
    }

    /**
     *  getTime()
     *  注意：是java.util.Date;
     *  而非 java.sql.Date，此类是给数据库访问的时候使用的
     */
    public void Step2(){
        Date now = new Date();
        //打印当前时间
        System.out.println("当前时间:"+ now.toString());
        //getTime() 得到一个long型的整数
        //这个整数代表 1970.1.1 08:00:00:000，每经历一毫秒，增加1
        System.out.println("当前时间getTime()返回的值是： " + now.getTime());

        Date Zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:" + Zero);
    }

    public static void main(String[] args) {
        Time_Date time_date = new Time_Date();
        time_date.Step1();
        time_date.Step2();
    }
}
