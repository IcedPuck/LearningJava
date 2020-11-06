package com.demo.java.Primary.Primary02_11_2020.ObjectClass;

public class _Equal {
    public String name;
    protected float hp;

    /**
     * @param o
     * @return boolean
     * <p>
     * 这不是Object的方法，但是用于判断两个对象是否相同
     * 更准确的讲，用于判断两个引用，是否指向了同一个对象
     */
    public boolean equals(Object o) {
        if (o instanceof _Equal) {
            _Equal h = (_Equal) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        _Equal h1 = new _Equal();
        h1.hp = 300;
        _Equal h2 = new _Equal();
        h2.hp = 400;
        _Equal h3 = new _Equal();
        h3.hp = 300;

        System.out.println(h1 == h2);
        System.out.println(h1 == h3);
    }
}