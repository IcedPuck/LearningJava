package com.demo.java.Primary04_11_2020;

public class _Math {
    /**
     *  四舍五入
     *  随机数
     *  开方
     *  次方
     *  π
     *  自然常数
     * */
    public void Step1(){
        float f1 = 5.4f;
        float f2 = 5.5f;
        //5.4四舍五入即5
        System.out.println(Math.round(f1));
        //5.5四舍五入即6
        System.out.println(Math.round(f2));

        //得到一个0-1之间的随机浮点数（取不到1）
        System.out.println(Math.random());

        //得到一个0-10之间的随机整数 （取不到10）
        System.out.println((int)( Math.random()*10));
        //开方
        System.out.println(Math.sqrt(9));
        //次方（2的4次方）
        System.out.println(Math.pow(2,4));

        //π
        System.out.println(Math.PI);

        //自然常数
        System.out.println(Math.E);
    }
    /**
     * 数学方法
     *这个图是自然对数的计算方式。
     *
     * 借助Math的方法，把自然对数计算出来，看看经过自己计算的自然对数和Math.E的区别有多大
     * */
    public void Task(){
        int max_value = (int)Math.pow(10, 7);
        System.out.println(max_value);
        int sum = 0; //统计质数个数
         /*boolean 数组初始化全是false，而且只占一个bit，占用空间很小
          所以用筛选法将合数全部置true，剩下的false就是质数，最后统计false数量即可*/

        boolean judge[] = new boolean[max_value];
        judge[1] = true;   //0这个位置不要，1的位置代表数字1，2的位置代表数字2，以此类推
        for (int i = 2; i < max_value; i++)
        {
            if (!judge[i])   // 如果是质数，就把他的倍数都置true
            {
                sum +=1;     //当场统计
                for (int j = 2; j*i <max_value; j++)
                    judge[i*j] = true;
            }

        }
        System.out.println("1000W数字内的质数有" + sum + "个");

    }

    public static void main(String[] args) {
        _Math math = new _Math();
        math.Step1();
        math.Task();
    }
}
