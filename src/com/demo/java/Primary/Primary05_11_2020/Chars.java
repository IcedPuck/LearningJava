package com.demo.java.Primary.Primary05_11_2020;

public class Chars {
    /**
     * 保存一个字符的时候使用char
     * */
    public void Step1(){
        char c1 = 'a';
        char c2 = '1';//字符1,而非数字1
        char c3 = '中';//汉字字符
//        char c4 = 'ab'; //只能放一个字符
    }
    /**
     * char对应的封装类
     * */
    public void Step2(){
        char c1 = 'a';
        Character c = c1; //自动装箱
        c1 = c;//自动拆箱
    }
    /**
     * Character常见方法
     * */
    public void Step3(){
        System.out.println(Character.isLetter('a'));//判断是否为字母
        System.out.println(Character.isDigit('a')); //判断是否为数字
        System.out.println(Character.isWhitespace(' ')); //是否是空白
        System.out.println(Character.isUpperCase('a')); //是否是大写
        System.out.println(Character.isLowerCase('a')); //是否是小写

        System.out.println(Character.toUpperCase('a')); //转换为大写
        System.out.println(Character.toLowerCase('A')); //转换为小写

//        String a = 'a'; //不能够直接把一个字符转换成字符串
         java.lang.String a2 = Character.toString('a'); //转换为字符串
    }
    /**
     *常见转义
     * */
    public void Step4(){
        System.out.println("使用空格无法达到对齐的效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");

        System.out.println("使用\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");

        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");

        System.out.println("换行符 \\n");
        System.out.println("abc\ndef");

        System.out.println("单引号 \\'");
        System.out.println("abc\'def");
        System.out.println("双引号 \\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");
    }

    public static void main(java.lang.String[] args) {
        Chars chars = new Chars();
        chars.Step1();
        chars.Step2();
        chars.Step3();
        chars.Step4();
    }
}
