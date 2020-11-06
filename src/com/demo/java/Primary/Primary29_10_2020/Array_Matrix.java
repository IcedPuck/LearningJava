package com.demo.java.Primary.Primary29_10_2020;

public class Array_Matrix {
    /**
     * 初始化二维数组
     */
    public void step1() {
        //初始化二维数组，
        int[][] a = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        a[1][2] = 5;//可以直接访问一维数组，因为已经分配了空间
        //只分配了二维数组
        int[][] b = new int[2][];//有两个一维数组，每个一维数组的长度暂未分配
        b[0] = new int[3];//必须事先分配长度，才可以访问
        b[0][2] = 5;
        //指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1, 2, 4},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println(c.length);
    }

    /**
     * 二维数组
     * */
    public void task1() {
        int[][] matrix =  new int[5][5];
        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] =  (int)(Math.random() * 100);
                System.out.println(matrix[i][j] + "");
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("最大值为"+max+"坐标为"+(x+1)+" "+(y+1));


    }

    public static void main(String[] args) {
        Array_Matrix matrix = new Array_Matrix();
        matrix.step1();
        matrix.task1();
    }
}
