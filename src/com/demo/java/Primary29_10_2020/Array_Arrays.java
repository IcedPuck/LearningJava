package com.demo.java.Primary29_10_2020;

import java.util.Arrays;

public class Array_Arrays {
    /**
     *  数组复制
     *
     *  与使用System.arraycopy进行数组复制类似的， Arrays提供了一个copyOfRange方法进行数组复制。
     * 不同的是System.arraycopy，需要事先准备好目标数组，并分配长度。 copyOfRange 只需要源数组就就可以了，通过返回值，就能够得到目标数组了。
     * 除此之外，需要注意的是 copyOfRange 的第3个参数，表示源数组的结束位置，是取不到的。
     * */
    public void step1(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        int[] b = Arrays.copyOfRange(a,0,3);
        for (int i = 0; i < b.length; i++) {
            System.out.println("step1: " + b[i] + " ");
        }
    }
    /**
     * 转换为字符串
     *
     * 如果要打印一个数组的内容，就需要通过for循环来挨个遍历，逐一打印
     *
     * 但是Arrays提供了一个toString()方法，直接把一个数组，转换为字符串，这样方便观察数组的内容
     * */
    public void step2(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        String content = Arrays.toString(a);
        System.out.println("step2: " + content);
    }
    /**
     *  排序
     *  在前面章节学习了 选择法排序 和 冒泡法排序，Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能。
     * */
    public void step3(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        System.out.println("排序之前 :");
        System.out.println("step3: " +Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println("step3: " +Arrays.toString(a));
    }
    /**
     *  搜索
     *  查询元素出现的位置
     * 需要注意的是，使用binarySearch进行查找之前，必须使用sort进行排序
     * 如果数组中有多个相同的元素，查找结果是不确定的
     * */
    public void step4(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        Arrays.sort(a);

        System.out.println("step4: " + Arrays.toString(a));
        System.out.println("step4: " + "数字 62出现的位置:" + Arrays.binarySearch(a, 62));
    }
    /**
     * 判断是否相同
     *
     * 比较两个数组的内容是否一样
     * 第二个数组的最后一个元素是8，和第一个数组不一样，所以比较结果是false
     * */
    public void step5(){
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b[] = new int[] { 18, 62, 68, 82, 65, 8 };
        System.out.println("step5: " + Arrays.equals(a,b));
    }
    /**
     *  填充
     *
     *  使用同一个值，填充整个数组
     * */
    public void step6(){
        int a[] = new int[10];
        Arrays.fill(a, 5);
        System.out.println("step6: " + Arrays.toString(a));
    }
    /**
     * 二维数组排序
     *
     * 首先定义一个5X8的二维数组，然后使用随机数填充满。
     * 借助Arrays的方法对二维数组进行排序。
     * */
    public void task1(){
        int array[][] = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j]= (int)(Math.random() * 100);
            }
        }
        int temp[] = new int[array.length * array[0].length];//长乘宽
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0 , temp,i*8,8);
        }
        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(temp, i*8, array[i],0,8);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
    public static void main(String[] args) {
        Array_Arrays array_arrays = new Array_Arrays();
        array_arrays.step1();
        array_arrays.step2();
        array_arrays.step3();
        array_arrays.step4();
        array_arrays.step5();
        array_arrays.step6();
        array_arrays.task1();
    }
}
