package com.demo.java.Primary.Primary02_11_2020.Super;

import com.demo.java.Primary.Primary02_11_2020.Override.Item;

public class Parent2 {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }

    public Parent2(){
        System.out.println("Hero的无参的构造方法 ");
    }

    public Parent2(String name){
        System.out.println("Parent2的有一个参数的构造方法 " + name);
        this.name = name;
    }

    public static void main(String[] args) {
        new Parent2();
    }
}
