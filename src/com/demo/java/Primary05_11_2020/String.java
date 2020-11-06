package com.demo.java.Primary05_11_2020;

public class String {
    /**
     * 创建字符串
     *
     * 字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象
     * 常见创建字符串手段：
     * 1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
     * 2. 调用String的构造方法创建一个字符串对象
     * 3. 通过+加号进行字符串拼接也会创建新的字符串对象
     * */
    public void Step1(){
        java.lang.String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

        java.lang.String teemo = new java.lang.String("提莫"); //创建了两个字符串对象

        char[] cs = new char[]{'崔','斯','特'};

        java.lang.String hero = new java.lang.String(cs);//  通过字符数组创建一个字符串对象

        java.lang.String hero3 = garen + teemo;//  通过+加号进行字符串拼接
    }
    /**
     *final
     *
     * String 被修饰为final,所以是不能被继承的
     * */
    public void Step2(){
//        MyString str = new MyString();
    }
//    不可继承
//    static class MyString extends java.lang.String{
//
//    }
    /**
     *  immutable
     *
     *  immutable 是指不可改变的
     * 比如创建了一个字符串对象
     * String garen ="盖伦";
     * 不可改变的具体含义是指：
     * 不能增加长度
     * 不能减少长度
     * 不能插入字符
     * 不能删除字符
     * 不能修改字符
     * 一旦创建好这个字符串，里面的内容 永远 不能改变
     *
     * String 的表现就像是一个常量
     * */
    public void Step3(){
        java.lang.String garen = "盖伦";
    }
    /**
     *  字符串格式化
     *  如果不使用字符串格式化，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
     * 使用字符串格式化，就可以简洁明了
     * */
    public void Step4(){
        java.lang.String name ="盖伦";
        int kill = 8;
        java.lang.String title="超神";

        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        java.lang.String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";

        System.out.println(sentence);

        //格式化字符串
        //%s表示字符串，%d表示数字,%n表示换行
        java.lang.String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";

        java.lang.String sentence2 = java.lang.String.format(sentenceFormat, name,kill,title);

        System.out.println(sentence2);
    }
    /**
     *  字符串长度
     *  length方法返回当前字符串的长度
     * 可以有长度为0的字符串,即空字符串
     * */
    public void Step5(){
        java.lang.String name ="盖伦";

        System.out.println(name.length());

        java.lang.String unknowHero = "";

        //可以有长度为0的字符串,即空字符串
        System.out.println(unknowHero.length());
    }

    public static void main(java.lang.String[] args) {
        String string = new String();
        string.Step1();
        string.Step2();
        string.Step3();
        string.Step4();
        string.Step5();
    }
}
