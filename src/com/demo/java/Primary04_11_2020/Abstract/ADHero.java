package com.demo.java.Primary04_11_2020.Abstract;

import com.demo.java.Primary02_11_2020.Interface.AD;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void attack() {
        physicAttack();
    }
}
