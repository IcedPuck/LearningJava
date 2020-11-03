package com.demo.java.Primary02_11_2020.Interface;


import com.demo.java.Primary02_11_2020.ObjectChange.Hero;

public class ADHero extends Hero implements AD{
    public String getName(){
        return name;
    }

    @Override
    public void physicAttack() {
        System.out.println("发起物理攻击");
    }
}
