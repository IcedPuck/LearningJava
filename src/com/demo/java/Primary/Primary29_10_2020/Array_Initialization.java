package com.demo.java.Primary.Primary29_10_2020;

public class Array_Initialization {
    /***/
    public void step1(){
        int[] a = new int[5]; //分配了长度是5的数组，但是没有赋值

        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
        System.out.println(a[0]);

        //进行赋值

        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;
    }
    /***/
    public void step2(){
        //写法一： 分配空间同时赋值
        int[] a = new int[]{100,102,444,836,3236};

        //写法二： 省略了new int[],效果一样
        int[] b = {100,102,444,836,3236};

        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
//        int[] c = new int[3]{100,102,444,836,3236};
    }
    /**
     * 数组反转
     * 首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
     *
     * 使用for循环或者while循环，对这个数组实现反转效果
     * */
    public void task(){
        int[] a = new int[5];
        System.out.println("原宿主");
        for (int i = 0; i < 5; i++) {
            a[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
        //实现反转代码
        for (int i = 0; i < a.length/2; i++){
            int t = a[i];
            a[i] =  a[a.length-i - 1];
            a[a.length - i -1] =t;
        }
        System.out.println("现在的数组： ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Array_Initialization initialization =  new Array_Initialization();
        initialization.step1();
        initialization.step2();
        initialization.task();
    }
}
