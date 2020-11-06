package com.demo.java.Primary.Primary02_11_2020.ObjectChange;

public class NoInheritance {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        /**
         * 出错原因是ad 和 ap 没有继承关系
         * */
        /* ad = (ADHero) ap; */
    }
}
