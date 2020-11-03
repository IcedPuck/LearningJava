package com.demo.java.Primary02_11_2020.Super;
import com.demo.java.Primary02_11_2020.Override.Item;

public class Parent {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public void useItem(Item i) {
        System.out.println("hero use item");
        i.effect();
    }

    public Parent() {
        System.out.println("Parent的构造方法 ");
    }

    public static void main(String[] args) {
        new Parent();
    }
}
