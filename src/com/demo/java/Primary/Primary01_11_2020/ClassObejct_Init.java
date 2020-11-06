package com.demo.java.Primary.Primary01_11_2020;

public class ClassObejct_Init {
    public String name = "some hero"; //声明该属性的时候初始化
    protected float hp;
    float maxHP;

    {
        maxHP = 200; //初始化块
    }

    public ClassObejct_Init(){
        hp = 100; //构造方法中初始化

    }
    ////////////////////////////
    public static int itemCapacity=8; //声明的时候 初始化
    static {
        itemCapacity = 6;//静态初始化块 初始化
    }

    public static void main(String[] args) {
        System.out.println(ClassObejct_Init.itemCapacity);
    }
}
