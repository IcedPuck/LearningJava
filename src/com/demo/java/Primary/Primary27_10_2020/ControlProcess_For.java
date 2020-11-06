package com.demo.java.Primary.Primary27_10_2020;

import java.util.Scanner;

public class ControlProcess_For {
    public void task1(){
        //使用while打印0到4
        int i = 0;
        while(i<5){
            System.out.println("while循环输出的"+i);
            i++;
        }

        //使用for打印0到4
        for (int j = 0; j < 5; j++) {
            System.out.println("for  循环输出的"+j);
        }
    }
    public void test(){
        System.out.println("请输入乞丐要钱天数:");
        Scanner s = new Scanner(System.in);

        int day = s.nextInt();
        int sum_money = 0;
        int day_money = 0;

        while(day>0) {
            day_money = 1<<(day-1);
            day--;
            sum_money = sum_money + day_money;
        }
        System.out.println("收入是:"+sum_money);
    }
    public static void main(String[] args) {
        ControlProcess_For For =  new ControlProcess_For();
        For.task1();
        For.test();
    }
}
