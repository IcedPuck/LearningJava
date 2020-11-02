package com.demo.java.Primary01_11_2020;

public class ClassObejct_ClassProperty {
    /**
     *  类属性
     *  类属性： 又叫做静态属性
     * 对象属性： 又叫实例属性，非静态属性
     * 如果一个属性声明成类属性，那么所有的对象，都共享这么一个值
     */
    public String name; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性
    public static void main(String[] args) {
        ClassObejct_ClassProperty garen =  new ClassObejct_ClassProperty();
        garen.name = "盖伦";

        ClassObejct_ClassProperty.copyright = "版权由Riot Games公司所有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        ClassObejct_ClassProperty teemo =  new ClassObejct_ClassProperty();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);

    }
}
