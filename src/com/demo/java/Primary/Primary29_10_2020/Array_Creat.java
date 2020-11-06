package com.demo.java.Primary.Primary29_10_2020;

public class Array_Creat {
    /**
     * 声明数组
     * int[] a; 声明了一个数组变量。
     * []表示该变量是一个数组
     * int 表示数组里的每一个元素都是一个整数
     * a 是变量名
     * 但是，仅仅是这一句声明，不会创建数组
     * */
    public void step1(){
        // 声明一个数组
        int[] a;
    }
    /**
     *  创建数组
     *  创建数组的时候，要指明数组的长度。
     * new int[5]
     * 引用概念：
     * 如果变量代表一个数组，比如a,我们把a叫做引用
     * 与基本类型不同
     * int c = 5; 这叫给c赋值为5
     * 声明一个引用 int[] a;
     * a = new int[5];
     * 让a这个引用，指向数组
     * */
    public void step2(){
        //声明一个引用
        int[] a;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        a = new int[5];

        int[] b = new int[5]; //声明的同时，指向一个数组
    }
    /**
     *  访问数组
     *  下标0，代表数组里的第一个数
     * */
    public void step3(){
        int[] a;
        a = new int[5];

        a[0]= 1;  //下标0，代表数组里的第一个数
        a[1]= 2;
        a[2]= 3;
        a[3]= 4;
        a[4]= 5;
    }
    /**
     *  数组长度
     *  .length属性用于访问一个数组的长度
     * 数组访问下标范围是0到长度-1
     * 一旦超过这个范围,就会产生数组下标越界异常
     * */
    public void step4(){
        int[] a;
        a = new int[5];

        System.out.println(a.length); //打印数组的长度

        a[4]=100; //下标4，实质上是“第5个”，即最后一个
        a[5]=101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常
    }
    /**
     * 首先创建一个长度是5的数组
     * 然后给数组的每一位赋予随机整数
     * 通过for循环，遍历数组，找出最小的一个值出来
     *
     * 0-100的 随机整数的获取办法有多种，下面是参考办法之一:
     * */
    public void task(){
        int a[]= new int[5];
        for (int i = 0; i < 5; i++)
            a[i]=(int)(Math.random() * 100);
        int min=a[0],j=0;
        for (int i = 0; i < 5 ; i++)
        {
            System.out.println(a[i]);
            if(a[i]< min)
            {
                min = a[i];
                j=i;
            }
        }
        System.out.println("数组a中最小的元素是："+min+",它对应的下标是："+j);
    }
    public static void main(String[] args) {
        Array_Creat creat = new Array_Creat();
        creat.step1();
        creat.step2();
        creat.step3();
        creat.step4();
        creat.task();
    }
}
