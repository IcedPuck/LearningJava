package com.demo.java.Primary26_10_2020;

public class Variable_final {
    public void method1() {
        final int i = 5;
        //i = 10; //i在第4行已经被赋值过了，所以这里会出现编译错误
    }

    public void method2() {
        final int i;
        i = 10; //i在第4行，只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值
        //i = 11; //i在第6行已经被赋值过了，所以这里会出现编译错误
    }
}
