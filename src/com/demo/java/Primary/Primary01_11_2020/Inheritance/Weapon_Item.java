package com.demo.java.Primary.Primary01_11_2020.Inheritance;

public class Weapon_Item extends Item {
    int damage;

    public static void main(String[] args) {
        Weapon_Item infinityEdge = new Weapon_Item();
        infinityEdge.damage = 65;
        infinityEdge.name = "无尽之刃";//name属性，是从Item中继承来的，就不需要重复设计了
        infinityEdge.price = 3600;
    }
}
