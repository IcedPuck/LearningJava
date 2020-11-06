package com.demo.java.Primary.Primary26_10_2020;

public class Variable_area {
    int i = 1;
    int j = i;  //其他的属性可以访问i
    public void method1(){
        System.out.println(i); //方法1里可以访问i
    }
    public void method2(){
        System.out.println(i); //方法2里可以访问i
    }
    public void method3() {
        int i  = 5;  //其作用范围是从声明的第4行，到其所处于的块结束12行位置
        System.out.println(i);
        {            //子块
            System.out.println(i); //可以访问i
            int j = 6;
            System.out.println(j); //可以访问j
        }
        System.out.println(j); //不能访问j,因为其作用域到第10行就结束了
    }
    public void method1(int i){ //参数也是i
        System.out.println(i);
    }
    public static void main(String[] args) {
        new Variable_area().method1(5);
    }
}
