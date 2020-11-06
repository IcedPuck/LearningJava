package com.demo.java.Primary.Primary02_11_2020.ObjectChange;

import com.demo.java.Primary.Primary02_11_2020.Interface.AD;

public class Test {
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        Hero h = ad;
        AD adi =  (AD) h;
//        APHero ap = (ADHero) adi;
    }
}
