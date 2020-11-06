package com.demo.java.Primary.Primary27_10_2020;

public class Operator_Logical {
    /**
     *  长路与 和 短路与
     *  长路与:  &
     *  短路与:  &&
     * */
    public void task1(){
        //长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
        System.out.println( i== 1 & i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);

        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println( j== 1 && j++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);
    }
    /**
     *  长路或 和 短路或
     *  长路或:  |
     *  短路或:  ||
     * */
    public void task2(){
        //长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
        System.out.println( i== 1 | i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);

        //短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println( j== 2 || j++ ==2  );  //因为j==2返回true,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);
    }
    /**
     * 	取反
     * 	真变为假
     *  假变为真
     * 	取反: !
     * */
    public void task3(){
        boolean b = true;

        System.out.println(b); //输出true
        System.out.println(!b);//输出false
    }
    /**
     *  异或
     *  不同，返回真
     *  相同，返回假
     *  异或: ^
     * */
    public void task4(){
        boolean a = true;
        boolean b = false;

        System.out.println(a^b); //不同返回真
        System.out.println(a^!b); //相同返回假
    }
    public static void main(String[] args) {
        Operator_Logical logical = new Operator_Logical();
        logical.task1();
        logical.task2();
        logical.task3();
        logical.task4();
    }
}
