package com.demo.java.Primary27_10_2020;

import java.util.Scanner;

public class ControlProcess_While {
    public void task1() {
        //打印0到4
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public void task2() {
        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    public void test() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int N = s.nextInt();
        int a = 1;
        do {
            N *= a;
            a++;
        } while (a < N);
        System.out.println("阶乘是：" + N);
    }

    public static void main(String[] args) {
        ControlProcess_While While = new ControlProcess_While();
        While.task1();
        While.task2();
        While.test();
    }
}
