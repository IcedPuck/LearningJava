package com.demo.java.Primary02_11_2020.Super;

import com.demo.java.Primary02_11_2020.Interface.AD;

public class Child3 extends Parent3 implements AD {
    int moveSpeed =  400;
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public static void main(String[] args) {
        Child3 h= new Child3();

        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());

    }
}
