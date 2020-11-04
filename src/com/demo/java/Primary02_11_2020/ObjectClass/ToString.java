package com.demo.java.Primary02_11_2020.ObjectClass;

public class ToString {
    public String name;
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        ToString h = new ToString();
        h.name = "盖伦";
        System.out.println(h.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(h);
    }
}
