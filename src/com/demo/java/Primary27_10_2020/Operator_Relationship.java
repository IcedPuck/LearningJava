package com.demo.java.Primary27_10_2020;

public class Operator_Relationship {
    public void task1(){
        int a = 5;
        int b = 6;
        int c = 5;

        System.out.println(a>b);  //返回 false
        System.out.println(a>=c);  //返回 true
        System.out.println(a==b); //返回false
    }
    public static void main(String[] args) {
        Operator_Relationship relationship = new Operator_Relationship();
        relationship.task1();
    }
}
