package com.demo.java.Primary.Primary02_11_2020.ObjectChange;

import com.demo.java.Primary.Primary02_11_2020.Interface.AD;

public class RealToInterface {
    /**
     * 实现类转换成接口(向上转型)
     *
     * 引用ad指向的对象是ADHero类型，这个类型实现了AD接口
     * 15行： 把一个ADHero类型转换为AD接口
     * 从语义上来讲，把一个ADHero当做AD来使用，而AD接口只有一个physicAttack方法，这就意味着转换后就有可能要调用physicAttack方法，而ADHero一定是有physicAttack方法的，所以转换是能成功的。 as
     * */
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        AD adi = ad;
    }

}
