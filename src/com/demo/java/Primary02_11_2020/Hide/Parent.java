package com.demo.java.Primary02_11_2020.Hide;

public class Parent {
    public String name;
    protected float hp;

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }
}
