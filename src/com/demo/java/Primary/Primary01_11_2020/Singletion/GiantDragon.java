package com.demo.java.Primary.Primary01_11_2020.Singletion;

public class GiantDragon {
    private static GiantDragon instance = new GiantDragon();
    private static GiantDragon instance1;
    private GiantDragon(){
        System.out.println("GiantDragon constructor");
    }

    public static void printXXX(){
        System.out.println("printXXX()");
    }
    /**
     * @return  饿汉式单例模式
     */
    public static GiantDragon getInstance(){
        return instance;
    }

    /**
     * @return  懒汉式单例模式
     */
    public static GiantDragon getInstance1(){
        if(null == instance1){
            instance1 = new GiantDragon();
        }
        return instance1;
    }
    public void kill (Hero h){
        System.out.println(h.name);
    }
}
