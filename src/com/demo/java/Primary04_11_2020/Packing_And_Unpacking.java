package com.demo.java.Primary04_11_2020;

public class Packing_And_Unpacking {
    /**
     *封装类
     * 所有的基本类型，都有对应的类类型
     * 比如int对应的类是Integer
     * 这种类就叫做封装类
     * */
    public void Step1(){
        int i = 5;

        //把一个基本类型的变量,转换为Integer对象
        Integer it = Integer.valueOf(i);
        //把一个Integer对象，转换为一个基本类型的int
        int i2 = it.intValue();
    }
    /**
     * Number类
     * 数字封装类有
     * Byte,Short,Integer,Long,Float,Double
     * 这些类都是抽象类Number的子类
     * */
    public void Step2(){
        int i = 5;

        Integer it = Integer.valueOf(i);
        //Integer是Number的子类，所以打印true
        System.out.println(it instanceof Number);
    }
    /**
     *基本类型转封装类
     * */
    public void Step3(){
        int i = 5;

        //基本类型转换成封装类型
        Integer it = new Integer(i);
    }
    /**
     * 封装类转基本类型
     * */
    public void Step4(){
        int i = 5;

        //基本类型转换成封装类型
        Integer it = new Integer(i);

        //封装类型转换成基本类型
        int i2 = it.intValue();
    }
    /**
     *  自动装箱
     *  不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
     * */
    public void Step5(){
        int i = 5;

        //基本类型转换成封装类型
        Integer it = i;

        //自动转换就叫装箱
        Integer it2 = i;
    }
    /**
     *自动拆箱
     * 不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱
     * */
    public void Step6(){
        int i = 5;

        Integer it = i;

        //封装类型转换成基本类型
        int i2 = it.intValue();

        //自动转换就叫拆箱
        int i3 = it;
    }
    /**
     * int的最大值，最小值
     * int的最大值可以通过其对应的封装类Integer.MAX_VALUE获取
     * */
    public void Step7(){
        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);
    }
    /**
     * 装箱拆箱
     *1. 对byte,short,float,double进行自动拆箱和自动装箱
     *
     * 2. byte和Integer之间能否进行自动拆箱和自动装箱
     *
     * 3. 通过Byte获取byte的最大值
     * */
    public void task(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // byte的自动装箱与拆箱
        Byte By = Byte.valueOf((byte) 2);
        byte by = By;
        System.out.println("Byte型数据：" + By);
        System.out.println("byte型数据：" + by);

        // short的自动拆箱与装箱
        Short Sh = Short.valueOf((short) 2);
        short sh = Sh;
        System.out.println("Short型数据：" + Sh);
        System.out.println("short型数据：" + sh);

        // float的自动装箱与拆箱
        Float Fl = 2.1f;
        float fl = Fl;
        System.out.println("Float型数据：" + Fl);
        System.out.println("float型数据：" + fl);

        // double型数据的自动拆箱与装箱
        Double Do = 22.3;
        double dou = Do;
        System.out.println("Double型数据：" + Do);
        System.out.println("double型数据：" + dou);

        // 测试byte和Integer之间是否可自动拆装箱, 不可以
        /*Integer in = (byte) 22;
        byte by = new Integer(22);*/

        // 获取Byte的最大值
        System.out.println("Byte型数据的最大值为： " + Byte.MAX_VALUE);
    }

    public static void main(String[] args) {
        Packing_And_Unpacking packing_and_unpacking = new Packing_And_Unpacking();
        packing_and_unpacking.Step1();
        packing_and_unpacking.Step2();
        packing_and_unpacking.Step3();
        packing_and_unpacking.Step4();
        packing_and_unpacking.Step5();
        packing_and_unpacking.Step6();
        packing_and_unpacking.Step7();
        packing_and_unpacking.task();
    }
}
