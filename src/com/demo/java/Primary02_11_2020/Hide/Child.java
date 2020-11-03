package com.demo.java.Primary02_11_2020.Hide;

import com.demo.java.Primary02_11_2020.Interface.AD;

public class Child extends Parent implements AD {

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public static void battleWin(){
        System.out.println("ad hero battle win");
    }
    public static void main(String[] args) {
        Parent.battleWin();
        Child.battleWin();
    }
}
