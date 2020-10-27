package com.demo.java.Primary27_10_2020;

public class ControlProcess_EndLoop {
    public void task1(){
        //打印单数
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2)
                    break; //如果是双数，结束当前循环
            }

        }
    }
    public void task2(){
        boolean breakout = false; //是否终止外部循环的标记
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
                if (0 == j % 2) {
                    breakout = true; //终止外部循环的标记设置为true
                    break;
                }
            }
            if (breakout) //判断是否终止外部循环
                break;
        }
    }
    public void task3(){
        //打印单数
        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2)
                    break outloop; //如果是双数，结束外部循环
            }

        }
    }
    public static void main(String[] args) {
        ControlProcess_EndLoop endLoop =  new ControlProcess_EndLoop();
        endLoop.task1();
        endLoop.task2();
        endLoop.task3();
    }
}
