package com.demo.java.Primary.Primary02_11_2020.ObjectChange;

import com.demo.java.Primary.Primary02_11_2020.Interface.AD;

public class InterfaceToReal {
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        //AD对象对AD接口 -- 成功
        AD adi =  ad;
        //AD接口对AD对象是成功的，因为两个都有ADattack()
        ADHero  adHero = (ADHero) adi;
        //这里失败的原因是adi引用所指向的对象是一个ADHero，要转换为ADAPHero就会失败。
        ADAPHero adapHero = (ADAPHero) adi;
        adapHero.MagicAttack();
    }
}
