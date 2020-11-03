package com.demo.java.Primary02_11_2020.Super;

import com.demo.java.Primary02_11_2020.Interface.AD;

public class Child2 extends Parent2 implements AD {

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public Child2(String name){
        //用super进行参数的传递
        super(name);
        System.out.println("Child2的构造方法");
    }

    public static void main(String[] args) {
        new Child2("德莱文");
    }
}
