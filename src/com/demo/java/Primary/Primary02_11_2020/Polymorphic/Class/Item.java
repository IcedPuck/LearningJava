package com.demo.java.Primary.Primary02_11_2020.Polymorphic.Class;
/**
 * 观察类的多态现象：
 * 1. i1和i2都是Item类型
 * 2. 都调用effect方法
 * 3. 输出不同的结果
 * */
public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果 ");
    }

    public static void main(String[] args) {
        //这里必须让LifePotion继承，不然东西是对不上的
        Item i1= new LifePotion();
        Item i2 = new MagicPotion();
        System.out.print("i1  是Item类型，执行effect打印:");
        i1.effect();//print的是血瓶使用后，可以回血
        System.out.print("i2也是Item类型，执行effect打印:");
        i2.effect();//print的是蓝瓶使用后，可以回魔法
    }

}
