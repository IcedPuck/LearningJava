package com.demo.java.Primary.Primary04_11_2020.Abstract;

public abstract class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
    public abstract void attack();

    public static void main(String[] args) {
        //虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
//        Hero hero = new Hero();
    }
}
/**
 *抽象类和接口的区别
 *区别1：
 * 子类只能继承一个抽象类，不能继承多个
 * 子类可以实现多个接口
 * 区别2：
 * 抽象类可以定义
 * public,protected,package,private
 * 静态和非静态属性
 * final和非final属性
 * 但是接口中声明的属性，只能是
 * public
 * 静态
 * final的
 * 即便没有显式的声明
 * */