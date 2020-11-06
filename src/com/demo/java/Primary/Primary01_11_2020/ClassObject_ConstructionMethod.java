package com.demo.java.Primary.Primary01_11_2020;

/**
 * 无参数的构造方法在未写的时候会被有参数的构造方法代替
 * 不能有返回Keyword，有就是普通方法
 *
 */
class ClassObject_ConstructionMethod {

    // 方法名和类名一样（包括大小写）
    // 没有返回类型
    public ClassObject_ConstructionMethod() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }
    public ClassObject_ConstructionMethod(String He) {
        System.out.println("实例化一个对象的时候，必然调用有参数的构造方法"  +  He);
    }

    public static void main(String[] args) {
        new ClassObject_ConstructionMethod();
        new ClassObject_ConstructionMethod("aass");
    }
}
