package com.demo.java.Primary27_10_2020;

import java.util.Scanner;

public class Operator_Bit {
    /**
     *  一个整数的二进制表达
     *  方法: Integer.toBinaryString()
     *  将一个十进制整数转换为一个二进制字符串
     * */
    public void task1(){
        int i = 5;
        String b = ("task1- i的二进制的表达是： "+Integer.toBinaryString(i)); // 5的二进制的表达101
        System.out.println(i+" 的二进制表达是: "+b);
    }
    /**
     *  位或
     *  符号: |
     * 5的二进制是101
     * 6的二进制是110
     * 位或是两个数的二进制相加的时候见1变1，且不进位
     * 所以 5|6 对每一位进行或运算，得到 111->7
     * */
    public void task2(){
        int i  =5;
        int j = 6;

        System.out.println("task2- i的二进制的表达是： "+Integer.toBinaryString(i)); //5的二进制是101
        System.out.println("task2- j的二进制的表达是： "+Integer.toBinaryString(j)); //6的二进制是110
        System.out.println(i|j); //所以 5|6 对每一位进行或运算，得到 111->7
    }
    /**
     *  位与
     *  符号: &
     *  5的二进制是101
     * 6的二进制是110
     * 位与是两个数的二进制相加的时候见0变0
     * 所以 5&6 对每一位进行与运算，得到 100->4
     * */
    public void task3(){
        int i  =5;
        int j = 6;

        System.out.println("task3- i的二进制的表达是： "+Integer.toBinaryString(i)); //5的二进制是101
        System.out.println("task3- j的二进制的表达是： "+Integer.toBinaryString(j)); //6的二进制是110
        System.out.println(i&j); //所以 5&6 对每一位进行与运算，得到 100->4
    }
    /**
     * 异或
     * 符号：^
     * 5的二进制是101
     * 6的二进制是110
     * 所以 5^6 对每一位进行异或运算，得到 011->3
     *  在二进制进行异或运算时，保留不同项
     * 一些特别情况：
     * 任何数和自己进行异或 都等于 0
     * 任何数和0 进行异或 都等于自己
     * */
    public void task4(){
        int i  =5;
        int j = 6;
        System.out.println("task4- i的二进制的表达是： "+Integer.toBinaryString(i)); //5的二进制是 101
        System.out.println("task4- j的二进制的表达是： "+Integer.toBinaryString(j)); //6的二进制是110
        System.out.println(i^j); //所以 5^6 对每一位进行或运算，得到 011->3

        System.out.println(i^0);
        System.out.println(i^i);
    }
    /**
     *  取非
     *  符号：~
     *  5 的二进制是 00000101
     * 所以取反即为 11111010
     * 这个二进制换算成十进制即为-6
     * */
    public void task5(){
        byte i  =5;

        System.out.println("task5- i的二进制的表达是： "+Integer.toBinaryString(i)); //5的二进制是00000101,所以取非即为11111010,即为-6
        System.out.println(~i);
    }
    /**
     * 左移 右移
     * 左移：根据一个整数的二进制表达，将其每一位都向左移动，最右边一位补0
     * 左移符号：<<
     * 左移: x2
     * 右移：根据一个整数的二进制表达，将其每一位都向右移动
     * 右移符号：>>
     * 右移: /2
     * */
    public void task6(){
        byte i  =6;

        //6的二进制是110
        System.out.println("task6- i的二进制的表达是： "+Integer.toBinaryString(i));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(i<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(i>>1);
    }
    /**
     * 不用乘法符号(*) 计算 2x16
     * */
    public void test(){
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();//控制台输入16
        System.out.println(b<<1);//左移一位可以算输入的数字乘以2
        a.close();
    }
    /**
     *  带符号右移与无符号右移
     *  带符号右移 >>
     *      对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
     *      对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1
     *  无符号右移>>>
     *      如果是一个负数，那么对应的二进制的第一位是1
     *      无符号右移>>>会把第一位的1也向右移动，导致移动后，第一位变成0
     *      这样就会使得负数在无符号右移后，得到一个正数
     *  简单的说：
     *      带符号右移 >> 移动后正的还是正的，负的还是负的,符号不变
     *      无符号右移>>>移动后，变正的了
     * */
    public void task7(){
        int i  =-10;

        //-10的二进制是11111111111111111111111111110110
        //第一位是1，即符号位，代表这是一个负数
        System.out.println("task7- i的二进制的表达是： "+Integer.toBinaryString(i));

        //对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        //对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1

        //-10带符号右移1位，移动后前面补齐1
        //得到11111111111111111111111111111011
        //因为第一位是1，所以依然是一个负数，对应的十进制是-5
        int j = i>>1;
        System.out.println("task7- j的二进制的表达是： "+Integer.toBinaryString(j));
        System.out.println(j);

        //-10无符号向右移1位，符号位也会向右移，第一位就变成了0
        //得到01111111111111111111111111111011，对应的十进制是2147483643
        int k = i>>>1;
        System.out.println("task7- k的二进制的表达是： "+Integer.toBinaryString(k));

        System.out.println(k);
    }
    public static void main(String[] args) {
        Operator_Bit bit = new Operator_Bit();
        bit.task1();
        bit.task2();
        bit.task3();
        bit.task4();
        bit.task5();
        bit.task6();
        bit.task7();
    }
}
