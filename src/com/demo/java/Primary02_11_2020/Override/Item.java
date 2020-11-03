package com.demo.java.Primary02_11_2020.Override;
/**
 * 父类
 * */
public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }
/**
 * 调用重写的方法
 *
 * 调用重写的方法
 * 调用就会执行重写的方法，而不是从父类的方法
 * 所以LifePotion的effect会打印：
 * */
    public static void main(String[] args) {
        Item i = new Item();
        i.effect();

        LifePotion lp =  new LifePotion();
        lp.effect();
    }
}
