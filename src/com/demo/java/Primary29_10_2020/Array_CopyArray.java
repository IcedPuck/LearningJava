package com.demo.java.Primary29_10_2020;

import java.util.Random;

public class Array_CopyArray {
    /**
     * 复制数组
     * <p>
     * 把一个数组的值，复制到另一个数组中
     * <p>
     * System.arraycopy(src, srcPos, dest, destPos, length)
     * <p>
     * <p>
     * src: 源数组
     * srcPos: 从源数组复制数据的起始位置
     * dest: 目标数组
     * destPos: 复制到目标数组的起始位置
     * length: 复制的长度
     */
    public void step1() {
        int a[] = new int[]{18, 62, 68, 82, 65, 9};
        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值
        //通过数组赋值把，a数组的前3位赋值到b数组

        //方法一： for循环
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.arraycopy(a, 0, b, 0, 3);
        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    /**
     * 合并数组
     * */
    public void task1() {
        Random a = new Random();
        int Arr1[] = new int[a.nextInt(6) +  6];
        int Arr2[] = new int[a.nextInt(6) +  6];
        for (int j = 0; j < Arr1.length; j++){
            Arr1[j] = (int) (Math.random() * 100);
            System.out.println(Arr1[j]);
        }
        for (int i = 0; i < Arr2.length; i++) {
            Arr2[i] = (int)(Math.random() * 100);
            System.out.println(Arr2[i]);
        }
        int Arr3[] = new int[Arr1.length + Arr2.length];
        System.arraycopy(Arr1,0,Arr3,0,Arr1.length);
        System.arraycopy(Arr2,0,Arr3,Arr1.length,Arr2.length);
        for (int n = 0; n < Arr3.length; n++) {
            System.out.println(Arr3[n]);
        }
    }

    public static void main(String[] args) {
        Array_CopyArray copyArray = new Array_CopyArray();
        copyArray.step1();
        copyArray.task1();
    }
}
