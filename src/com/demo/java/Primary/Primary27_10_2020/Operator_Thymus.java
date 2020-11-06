package com.demo.java.Primary.Primary27_10_2020;

import java.util.Scanner;

public class Operator_Thymus {
    /**
     *三元操作符
     * 表达式?值1:值2
     * 如果表达式为真 返回值1
     * 如果表达式为假 返回值2
     * */
    public void task1(){
        int i = 5;
        int j = 6;

        int k = i < j ? 99 : 88;

        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }

        System.out.println("task1- k 的值是： " + k);
    }
    /**
     * 判断是否是工作日
     * 通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？
     * */
    public void test(){
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        String str = a < 6 ?"工作日":"休息日";
        System.out.println(str);
    }
    public static void main(String[] args) {
        Operator_Thymus thymus = new Operator_Thymus();
        thymus.task1();
        thymus.test();
    }
}
