package com.demo.java.Primary27_10_2020;

public class Operator_Count {
    public void task1() {
        int a = 36;
        int b = 83;
        int c = a + b;
        System.out.println("task1- c is: " + c);
    }

    public void task2() {
        int a = 5;
        long b = 6;
        int c = (int) (a + b);
        long d = a + b;
        System.out.println("task2- int c is： " + c);
        System.out.println("task2- long d is： " + d);
    }

    public void task3() {
        byte a = 1;
        byte b = 2;
        byte c = (byte) (a + b); // a + b 是int 类型要强转
        int d = a + b;
        System.out.println("task3- byte c is: " + c);
        System.out.println("task3- int d is: " + d);
    }

    /**
     * 取模
     * 使用符号%
     */
    public void task4() {
        int i = 5;
        int j = 2;
        int x = 5 % 2;
        System.out.println("task4- 取模x的值是: " + x);
    }
    /**
     * 自增
     * 自减
     * */
    public void task5(){
        int i = 5;
        i++;
        System.out.println("task5- i++ is: " + i);//输出为6
    }
    public void task6(){
        int i = 5;
        int j = 5;
        System.out.println("task6- i++ is: " + i++);
        System.out.println("task6- i is: "+ i);
        System.out.println("task6- j++ is: " + ++j);
        System.out.println("task6- j is: "+ j);
    }
    public static void main(String[] args) {
        Operator_Count count = new Operator_Count();
        count.task1();
        count.task2();
        count.task3();
        count.task4();
        count.task5();
        count.task6();
    }
}
