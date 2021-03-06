package com.demo.java.Primary.Primary05_11_2020;

public class _Buffer {

    /**
     *  追加 删除 插入 反转
     *  append追加
     * delete 删除
     * insert 插入
     * reverse 反转
     */
    public void Step1(){
        java.lang.String str1 = "let there ";

        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
        sb.append("be light"); //在最后追加

        System.out.println(sb);

        sb.delete(4, 10);//删除4-10之间的字符

        System.out.println(sb);

        sb.insert(4, "there ");//在4这个位置插入 there

        System.out.println(sb);

        sb.reverse(); //反转

        System.out.println(sb);
    }

    /**
     * 长度 容量
     *
     * 为什么StringBuffer可以变长？
     * 和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度
     * 比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。
     * 如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中，看上去 数组长度就变长了 参考MyStringBuffer
     * length: “the”的长度 3
     * capacity: 分配的总空间 19
     */
    public void Step2(){
        java.lang.String str1 = "the";

        StringBuffer sb = new StringBuffer(str1);

        System.out.println(sb.length()); //内容长度

        System.out.println(sb.capacity());//总空间
    }

    public void task(){
        
    }

    public static void main(String[] args) {
        _Buffer buffer = new _Buffer();
        buffer.Step1();
        buffer.Step2();
    }
}
