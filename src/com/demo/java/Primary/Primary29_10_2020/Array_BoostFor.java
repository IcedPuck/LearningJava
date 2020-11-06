package com.demo.java.Primary.Primary29_10_2020;

public class Array_BoostFor {
    /**
     *  增强型for循环
     *  增强型for循环只能用来取值，却不能用来修改数组里的值
     * */
    public void step1(){
        int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.println(each);
        }

        //增强型for循环遍历
        for (int each : values) {
            System.out.println(each);
        }
    }
    /**
     * 最大值
     * 用增强型for循环找出最大的那个数
     * */
    public void task(){
        int values [] = new int[]{18,62,68,82,65,9};

        //数组中的内容是
        for (int each : values) {
            System.out.print(each+" ");
        }
        System.out.println();
        int max = -1;
        for (int each : values) {
            if(each>max)
                max = each;
        }

        System.out.println("最大的一个值是:"+max);
    }

    public static void main(String[] args) {
        Array_BoostFor boostFor = new Array_BoostFor();
        boostFor.step1();
        boostFor.task();
    }
}
