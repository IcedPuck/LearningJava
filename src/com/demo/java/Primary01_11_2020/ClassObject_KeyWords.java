package com.demo.java.Primary01_11_2020;

import com.demo.java.Primary01_11_2020.Inheritance.Item;

public class ClassObject_KeyWords {
    /**
     *  private 私有的
     *
     *  使用private修饰属性
     * 自身：是可以访问的
     * 同包子类：不能继承
     * 不同包子类：不能继承
     * 同包类：不能访问
     * 其他包类：不能访问
     */
    private int step1;

    /**
     * @param weapon
     *  package/friendly/default 不写
     *  没有修饰符即代表package/friendly/default
     */
    public void  equip(Item weapon){
        System.out.println(weapon);
    }

    /**
     *  protected 受保护的
     *  受保护的修饰符
     * protected float hp; 血量
     *  // protected饰符的属性 hp
     *     // 自己可以访问
     *
     *     // 同包子类可以继承
     *     // 不同包子类可以继承
     *
     *     // 同包类可以访问
     *     // 不同包类不能访问
     */
    protected float hp;

    // public的属性 name
    // 自己可以访问

    // 同包子类可以继承
    // 不同包子类可以继承

    // 同包类可以访问
    // 不同包类可以访问
    public String name;

    public static void main(String[] args) {
        ClassObject_KeyWords keyWords = new ClassObject_KeyWords();
    }
}
