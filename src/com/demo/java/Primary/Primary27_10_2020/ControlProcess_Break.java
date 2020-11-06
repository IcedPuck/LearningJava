package com.demo.java.Primary.Primary27_10_2020;

public class ControlProcess_Break {
    public void task1(){
        //打印单数
        for (int j = 0; j < 10; j++) {
            if(0==j%2)
                break; //如果是双数，直接结束循环

            System.out.println(j);
        }
    }
    // 假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
    //
    // 然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
    //
    // 那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
    // （复利计算按照每年12000投入计算，不按照每月计息）
    //
    // 复利公式：
    // F = p* ( (1+r)^n );
    // F 最终收入
    // p 本金
    // r 年利率
    // n 存了多少年
    public void test(){
        int n ;
        int F = 0;

        for (int j = 1; j < 100; j++) {
            n=j;
            float r = 1f;
            for (int i = 1; i <= n; i++) {
                r *= 1.2f;
            }
            F +=( 12000 * r - 12000);
            System.out.println("经过"+n+"年，总收入是"+F);
            if(F>=1000000){
                System.out.println("持续投资"+n+"年，总收入达到100万");
                break;
            }
        }
    }
    public static void main(String[] args) {
        ControlProcess_Break Break = new ControlProcess_Break();
        Break.task1();
        Break.test();
    }
}
