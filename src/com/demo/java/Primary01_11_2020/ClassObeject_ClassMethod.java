package com.demo.java.Primary01_11_2020;

public class ClassObeject_ClassMethod {
    public String name;
    protected float hp;

    //实例方法,对象方法，非静态方法
    //必须有对象才能够调用
    public void die(){
        hp = 0;
    }

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("battle win");
    }

    public static void main(String[] args) {
        ClassObeject_ClassMethod garen =  new ClassObeject_ClassMethod();
        garen.name = "盖伦";
        //必须有一个对象才能调用
        garen.die();

        ClassObeject_ClassMethod teemo =  new ClassObeject_ClassMethod();
        teemo.name = "提莫";

        //无需对象，直接通过类调用
        ClassObeject_ClassMethod.battleWin();

    }
}
