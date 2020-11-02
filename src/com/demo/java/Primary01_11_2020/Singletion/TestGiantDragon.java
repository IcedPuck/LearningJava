package com.demo.java.Primary01_11_2020.Singletion;

public class TestGiantDragon {
    public static void main(String[] args) {
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        System.out.println(g1 == g2);
        GiantDragon.printXXX();
    }
}
