package com.demo.java.Primary02_11_2020.ObjectChange;

import com.demo.java.Primary02_11_2020.Interface.APHero;

public class ParentToChild {
    public static void main(String[] args) {
        Hero h = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        h = ad;
        ad = (ADHero) h;
//        h = ap;
//        ad = (APHero) h;
        test(ad);
//        test(ap);
    }
    public static void test(Hero h){
        ADHero ad = (ADHero) h;
    }
}
