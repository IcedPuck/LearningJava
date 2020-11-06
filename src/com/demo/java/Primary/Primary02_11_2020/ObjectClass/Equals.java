package com.demo.java.Primary.Primary02_11_2020.ObjectClass;

public class Equals {
    public String name;
    protected float hp;

    /**
     * @param o
     * @return boolean
     * equals() 用于判断两个对象的内容是否相同
     * 方法用于将字符串与指定的对象比较。
     */
    public boolean equals(Object o){
        if(o instanceof Equals){
            Equals h = (Equals) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Equals h1= new Equals();
        h1.hp = 300;
        Equals h2= new Equals();
        h2.hp = 400;
        Equals h3= new Equals();
        h3.hp = 300;

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
    }
}
