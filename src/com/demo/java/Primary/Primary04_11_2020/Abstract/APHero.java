package com.demo.java.Primary.Primary04_11_2020.Abstract;

import com.demo.java.Primary.Primary02_11_2020.Interface.AP;

public class APHero extends Hero implements AP {
    @Override
    public void MagicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void attack() {
        MagicAttack();
    }
}
