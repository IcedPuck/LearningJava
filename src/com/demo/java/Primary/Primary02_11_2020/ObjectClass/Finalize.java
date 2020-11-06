package com.demo.java.Primary.Primary02_11_2020.ObjectClass;

public class Finalize {
    public String name;
    protected float hp;

    public String toString(){
        return name;
    }

    protected void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public static void main(String[] args) {
        //只有一引用
        Finalize h;
        for (int i = 0; i < 20; i++) {
            //不断生成新的对象
            //每创建一个对象，前一个对象，就没有引用指向了
            //那些对象，就满足垃圾回收的条件
            //当，垃圾堆积的比较多的时候，就会触发垃圾回收
            //一旦这个对象被回收，它的finalize()方法就会被调用
            h = new Finalize();
        }

    }
}
