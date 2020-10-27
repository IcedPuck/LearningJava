package com.demo.java.Primary27_10_2020;

public class Operator_Assignment {
    /**
     * 赋值操作
     * 赋值操作的操作顺序是从右到左
     * int i = 5+5;
     * 首先进行5+5的运算，得到结果10，然后把10这个值，赋给i
     * */
    public void task1(){
        int i = 5+5;
        System.out.println("task1- i 的值是： " + i);
    }
    /**
     *  对本身进行运算，并赋值
     *  +=即自加
     *  i+=2;
     *  等同于
     *  i=i+2;
     *  其他的 -= , *= , /= , %= , &= , |= , ^= , >>= , >>>= 都是类似，不做赘述
     * */
    public void task2(){
        int i = 3;
        i+=2;
        System.out.println("task2- i 的值是： " +i);

        int j=3;
        j=j+2;
        System.out.println("task2- j 的值是： " +j);
    }
    public static void main(String[] args) {
        Operator_Assignment assignment = new Operator_Assignment();
        assignment.task1();
        assignment.task2();
    }
}
