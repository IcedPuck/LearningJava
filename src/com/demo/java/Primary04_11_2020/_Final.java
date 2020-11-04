package com.demo.java.Primary04_11_2020;

import com.demo.java.Primary02_11_2020.Override.Item;
/**
 *  final修饰类
 *  当_Final被修饰成final的时候，表示_Final不能够被继承
 * 其子类会出现编译错误
 * */
public final class _Final extends Object{
    String name;
    /**
     * 常量指的是可以公开，直接访问，不会变化的值
     * 比如 itemTotalNumber 物品栏的数量是6个
     * */
    public static final int itemTotalNumber = 6;//物品栏的数量
    /**
     * @param item
     *  final修饰方法
     *  Hero的useItem方法被修饰成final,那么该方法在ADHero中，不能够被重写
     */
    public final void useItem(Item item){
        System.out.println("Hero use item");
        item.effect();
    }

    public static void main(String[] args) {
        new _Final();
        /**
         * 	final修饰基本类型变量
         *  final修饰基本类型变量，表示该变量只有一次赋值机会
         * 33行进行了赋值，35行就不可以再进行赋值了
         * */
        final int hp;
        hp = 5;
//        hp = 6;

        /**
         *  final修饰引用
         * h引用被修饰成final，表示该引用只有1次指向对象的机会
         * 所以45行会出现编译错误
         * 但是，依然通过h引用修改对象的属性值hp，因为hp并没有final修饰
         * */
        final _Final h;
        h  =new _Final();
//        h  =new Hero();
    }
}
