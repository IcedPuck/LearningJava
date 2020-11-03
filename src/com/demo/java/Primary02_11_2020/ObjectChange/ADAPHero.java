package com.demo.java.Primary02_11_2020.ObjectChange;

import com.demo.java.Primary02_11_2020.Interface.AD;
import com.demo.java.Primary02_11_2020.Interface.AP;

public class ADAPHero implements AD, AP {
    @Override
    public void physicAttack() {
        System.out.println("发起物理攻击");
    }

    @Override
    public void MagicAttack() {
        System.out.println("发起了一次魔法攻击");
    }
}
