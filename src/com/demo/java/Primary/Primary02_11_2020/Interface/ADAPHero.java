package com.demo.java.Primary.Primary02_11_2020.Interface;

public class ADAPHero implements AD,AP{
    @Override
    public void physicAttack() {
        System.out.println("发起物理攻击");
    }

    @Override
    public void MagicAttack() {
        System.out.println("发起了一次魔法攻击");
    }
}
