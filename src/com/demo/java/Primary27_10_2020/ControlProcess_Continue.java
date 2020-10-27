package com.demo.java.Primary27_10_2020;

public class ControlProcess_Continue {
    public void task1(){
        //打印单数
        for (int j = 0; j < 10; j++) {
            if(0==j%2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环

            System.out.println(j);
        }
    }
    public void test(){
        int i=0;
        while(i<100) {
            i++;
            if(i%3==0 || i%5==0)
                continue;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ControlProcess_Continue Continue = new ControlProcess_Continue();
        Continue.task1();
        Continue.test();
    }
}
