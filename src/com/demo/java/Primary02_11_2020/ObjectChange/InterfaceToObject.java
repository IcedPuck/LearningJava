package com.demo.java.Primary02_11_2020.ObjectChange;

import com.demo.java.Primary02_11_2020.Interface.AD;
import com.demo.java.Primary02_11_2020.Interface.ADAPHero;

public class InterfaceToObject {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        ADHero ad = new ADHero();

        AD adi = ad;

        ADHero adHero = (ADHero) adi;
        ADAPHero  adapHero = (ADAPHero) adi;
        adapHero.MagicAttack();
    }
}
