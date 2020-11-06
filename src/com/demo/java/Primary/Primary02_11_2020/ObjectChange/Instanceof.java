package com.demo.java.Primary.Primary02_11_2020.ObjectChange;

public class Instanceof {
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();

        Hero h1= ad;
        Hero h2 = ap;

        //instanceof 判断一个引用所指向的对象，是否是Hero类型，或者Hero的子类

        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println("h1-> ADHero: ");
        System.out.println(h1 instanceof ADHero);

        //判断引用h2指向的对象，是否是APHero类型
        System.out.println("h2 -> APHero: ");
        System.out.println(h2 instanceof APHero);

        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println("h1 -> Hero: ");
        System.out.println(h1 instanceof Hero);
    }
}
