package com.demo.java.Primary.Primary27_10_2020;

import java.util.Scanner;

public class Operator_Scanner {
    /**
     *  使用Scanner读取整数
     * */
    public void task1(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);
    }
    /**
     *  使用Scanner读取浮点数
     * */
    public void task2(){
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        System.out.println("读取的浮点数的值是："+a);
    }
    /**
     *  使用Scanner读取字符串
     * */
    public void task3(){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println("读取的字符串是："+a);
    }
    /**
     *  读取了整数后，接着读取字符串
             * */
public void task4(){
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("读取的整数是"+ i);
        String rn = s.nextLine();
        String a = s.nextLine();
        System.out.println("读取的字符串是："+a);
        }

public static void main(String[] args) {
        Operator_Scanner scanner = new Operator_Scanner();
        scanner.task1();
        scanner.task2();
        scanner.task3();
        scanner.task4();
        }
        }
