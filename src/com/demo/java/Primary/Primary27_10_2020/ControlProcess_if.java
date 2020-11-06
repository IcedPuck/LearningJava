package com.demo.java.Primary.Primary27_10_2020;

public class ControlProcess_if {
    public void task1() {
        boolean b = true;
        //如果成立就打印yes
        if (b) {
            System.out.println("yes");
        }
    }

    public void task2() {
        boolean b = false;
        //如果有多个表达式，必须用大括弧包括起来
        if (b) {
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }

        //否则表达式2 3 无论b是否为true都会执行
        if (b)
            System.out.println("yes1");
        System.out.println("yes2");
        System.out.println("yes3");

        //如果只有一个表达式可以不用写括弧，看上去会简约一些
        if (b) {
            System.out.println("yes1");
        }

        if (b)
            System.out.println("yes1");
    }

    public void task3() {
        boolean b = false;

        if (b) ;
        System.out.println("yes");
    }

    public void task4(){
        boolean b = false;

        if (b)
            System.out.println("yes");
        else
            System.out.println("no");
    }

    public void task5(){
        //如果只使用 if,会执行4次判断
        int i = 2;
        if (i==1)
            System.out.println(1);
        if (i==2)
            System.out.println(2);
        if (i==3)
            System.out.println(3);
        if (i==4)
            System.out.println(4);

        //如果使用else if, 一旦在18行，判断成立， 20行和22行的判断就不会执行了，节约了运算资源
        if (i==1)
            System.out.println(1);
        else if (i==2)
            System.out.println(2);
        else if (i==3)
            System.out.println(3);
        else if (i==4)
            System.out.println(4);
    }

    public static void main(String[] args) {
        ControlProcess_if controlProcess_if = new ControlProcess_if();
        controlProcess_if.task1();
        controlProcess_if.task2();
        controlProcess_if.task3();
        controlProcess_if.task4();
        controlProcess_if.task5();
    }
}
