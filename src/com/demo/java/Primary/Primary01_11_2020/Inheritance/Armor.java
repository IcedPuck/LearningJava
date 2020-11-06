package com.demo.java.Primary.Primary01_11_2020.Inheritance;

public class Armor extends Item{
    public static void main(String[] args) {
        Armor cloth = new Armor(); //布甲
        cloth.name = "布甲";
        cloth.price =  300;
        System.out.println(cloth.name + "的价格是" + cloth.price);
    }
}
