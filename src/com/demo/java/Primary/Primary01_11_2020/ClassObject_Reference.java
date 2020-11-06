package com.demo.java.Primary.Primary01_11_2020;

public class ClassObject_Reference {
        String name; //姓名

        float hp; //血量

        float armor; //护甲

        int moveSpeed; //移动速度
    /**
     *  引用和指向
     * */
    public void step1(){
        ClassObject_Reference reference = new ClassObject_Reference();
        reference.armor = 1;
        reference.hp = 2;
    }
    /**
     *  多个引用，一个对象
     *  引用有多个，但是对象只有一个。
     * 在这个例子里，所有引用都指向了同一个对象。
     * 对象就像 "房产"， 引用就像"房产证"
     * 房产证的复印件可以有多张，但是真正的"房产" 只有这么一处
     * */
    public void step2(){
        ClassObject_Reference reference  = new ClassObject_Reference();
        //使用一个引用来指向这个对象
        ClassObject_Reference ref1 = reference; //h2指向h1所指向的对象
        ClassObject_Reference ref2 = reference;
        //h1,h2,h3,h4,h5 五个引用，都指向同一个对象
    }
    /**
     * 一个引用，多个对象
     * 引用garen指向新创建的对象（对象1）
     * 同一个引用garen指向新创建的对象（对象2）
     * 这个时候，对象1，就没有任何引用指向了
     * 换句话说，就没有任何手段控制和访问该对象，那么该对象就变得没有意义。
     * */
    public void step3(){
        ClassObject_Reference garen = new ClassObject_Reference();//引用garen指向新创建的对象（对象1）
        garen = new ClassObject_Reference();//同一个引用garen指向新创建的对象（对象2）
        //简单来说盖伦的第一个对象被第二个覆盖了
    }
    /**
     * 引用
     *  h4所指向的对象和h2所指向的对象，是否是同一个对象？
     * */
    public void task1(){
        ClassObject_Reference h1 =  new ClassObject_Reference();
        ClassObject_Reference h2 =  new ClassObject_Reference();
        ClassObject_Reference h3;
        ClassObject_Reference h4;
        h3 = h1;
        h4 = h3;
        /**
         * 不是
         * h4 < h3 < h1
         * h2 < new Object
         * */
    }
    public static void main(String[] args) {
        ClassObject_Reference reference = new ClassObject_Reference();
        reference.step1();
        reference.step2();
        reference.step3();
        reference.task1();
    }
}
