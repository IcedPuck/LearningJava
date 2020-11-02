package com.demo.java.Primary01_11_2020.Enum;

public class TestSeason {
    public static void main(String[] args) {
        Enus enus = Enus.Spring;
        switch (enus){
            case Spring:
                System.out.println("Spring");
                break;
            case Summer:
                System.out.println("Summer");
                break;
            case Fall:
                System.out.println("Fall");
                break;
            case Winter:
                System.out.println("Winter");
                break;
        }
    }
}
