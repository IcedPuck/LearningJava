package com.demo.java.Primary04_11_2020.InstateClass;

import com.demo.java.Primary02_11_2020.ObjectChange.ADHero;

/**
 *  匿名类
 *  匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
 * 通常情况下，要使用一个接口或者抽象类，都必须创建一个子类
 *
 * 有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
 * 既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
 * 这样的类，叫做匿名类
 * */
public abstract class _Anonymous {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度

    public abstract void attack();

    public static void main(String[] args) {
        ADHero adh=new ADHero();
        //通过打印adh，可以看到adh这个对象属于ADHero类
        adh.physicAttack();
        System.out.println(adh);

        _Anonymous h = new _Anonymous(){
            //当场实现attack方法
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();
        //通过打印h，可以看到h这个对象属于Hero$1这么一个系统自动分配的类名

        System.out.println(h);
    }
}
