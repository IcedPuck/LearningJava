package com.demo.java.Primary.Primary02_11_2020.Super;

import com.demo.java.Primary.Primary02_11_2020.Override.Item;

public class Parent4 {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public void useItem(Item i){
        System.out.println("Parent4 use item");
        i.effect();
    }

    public Parent4(){
        System.out.println("Parent4的有一个参数的构造方法 ");
    }

    public Parent4(String name){
        System.out.println("Parent3的有一个参数的构造方法 " + name);
        this.name = name;
    }

    public static void main(String[] args) {
        new Parent4();
    }
}
