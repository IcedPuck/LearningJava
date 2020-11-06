package com.demo.java.Primary.Primary04_11_2020;

public class StringChange {
    /**
     * 数字转字符串
     * 方法1： 使用String类的静态方法valueOf
     * 方法2： 先把基本类型装箱为对象，然后调用对象的toString
     * */
    public void Step1(){
        int i = 5;

        //方法1
        String str = String.valueOf(i);

        //方法2
        Integer it = i;
        String str2 = it.toString();
    }
    /**
     *  字符串转数字
     *  调用Integer的静态方法parseInt
     * */
    public void Step2(){
        String str = "999";

        int i= Integer.parseInt(str);

        System.out.println(i);
    }
    /***/
    public void Task(){
        float i= 15f;

        String i1 = Float.toString(i);//方法一
        String i2 = String.valueOf(i);//方法二
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("=============");
        String j  ="3.14";
        float j1 = Float.parseFloat(j);
        System.out.println(j1);
        System.out.println("=============");
        String k ="3.1a4";
        float k1 = Float.parseFloat(k);//java.lang.NumberFormatException 编译时不会报错，运行时会报错，会报数字格式化异常
        System.out.println(k1);
    }

    public static void main(String[] args) {
        StringChange  stringChange = new StringChange();
        stringChange.Step1();
        stringChange.Step2();
        stringChange.Task();
    }
}
