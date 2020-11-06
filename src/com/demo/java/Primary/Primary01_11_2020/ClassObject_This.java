package com.demo.java.Primary.Primary01_11_2020;

public class ClassObject_This {
    String name;

    //打印内存中的虚拟地址
    public void showAddressInMemory() {
        System.out.println("打印this看到的虚拟地址：" + this);
    }

    public void setName1(String name) {
        //name代表的是参数name
        //this.name代表的是属性name
        this.name = name;
    }

    public ClassObject_This() {
        System.out.println("一个参数的构造方法");
        this.name = name;
    }    //带一个参数的构造方法

    public ClassObject_This(String name) {
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    public void step1() {
        ClassObject_This garen = new ClassObject_This();
        garen.name = "盖伦";
        //直接打印对象，会显示该对象在内存中的虚拟地址
        //格式：Hero@c17164 c17164即虚拟地址，每次执行，得到的地址不一定一样
        System.out.println("打印对象看到的虚拟地址：" + garen);
        //调用showAddressInMemory，打印该对象的this，显示相同的虚拟地址
        garen.showAddressInMemory();

        ClassObject_This teemo = new ClassObject_This();
        teemo.name = "提莫";
        System.out.println("打印对象看到的虚拟地址：" + teemo);
        teemo.showAddressInMemory();
    }

    public void step2() {
        ClassObject_This h = new ClassObject_This();

        h.setName1("teemo");
        System.out.println(h.name);
    }

    public void step3() {
        ClassObject_This teemo = new ClassObject_This("提莫");

        System.out.println(teemo.name);
    }

    public static void main(String[] args) {
        ClassObject_This classObject_this = new ClassObject_This();
        classObject_this.step1();
        classObject_this.step2();
    }
}
