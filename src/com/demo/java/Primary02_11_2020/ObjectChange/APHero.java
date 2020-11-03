package com.demo.java.Primary02_11_2020.ObjectChange;

import com.demo.java.Primary02_11_2020.Interface.AP;

public class APHero extends Hero implements AP {
    @Override
    public void MagicAttack() {
        System.out.println("发起了一次魔法攻击");
    }
}
