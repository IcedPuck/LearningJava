package com.demo.java.Primary01_11_2020;

public class ClassObject_ParameterPassing {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public ClassObject_ParameterPassing(){}
    public void huixue(int xp){
        hp = hp  + xp;
        xp  = 0;
    }
    public ClassObject_ParameterPassing(String name, float hp){
        this.name = name;
        this.hp = hp;
    }

    public static void main(String[] args) {
        ClassObject_ParameterPassing teemo = new ClassObject_ParameterPassing();
        int xueping =  100;
        teemo.huixue(xueping);
        System.out.println(xueping);
    }
}
