package com.demo.java.Primary02_11_2020.Super;

import com.demo.java.Primary02_11_2020.Interface.AD;

public class Child extends Parent implements AD {

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public Child(){
        System.out.println("Child的构造方法");
    }

    public static void main(String[] args) {
        new Child();
    }
}
