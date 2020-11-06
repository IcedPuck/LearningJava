package com.demo.java.Primary.Primary05_11_2020;

import java.util.Locale;
import java.util.Scanner;

public class PrintF_Format {
    /**
     *格式化输出
     *
     * 如果不使用格式化输出，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
     * 使用格式化输出，就可以简洁明了
     *
     * 符号：
     * %s 表示字符串
     * %d 表示数字
     * %n 表示换行
     * */
    public void Step1(){
        java.lang.String name ="盖伦";
        int kill = 8;
        java.lang.String title="超神";

        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        java.lang.String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";

        System.out.println(sentence);

        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        java.lang.String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);
    }
    /**
     * printf和format
     * printf和format能够达到一模一样的效果，如何通过eclipse查看java源代码 可以看到，在printf中直接调用了format
     * */
    public void Step2(){
        java.lang.String name ="盖伦";
        int kill = 8;
        java.lang.String title="超神";

        java.lang.String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        //使用printf格式化输出
        System.out.printf(sentenceFormat,name,kill,title);
        //使用format格式化输出
        System.out.format(sentenceFormat,name,kill,title);
    }
    /**
     * 换行符
     * 换行符就是另起一行 --- '\n' 换行（newline）
     * 回车符就是回到一行的开头 --- '\r' 回车（return）
     * 在eclipse里敲一个回车，实际上是回车换行符
     * Java是跨平台的编程语言，同样的代码，可以在不同的平台使用，比如Windows,Linux,Mac
     * 然而在不同的操作系统，换行符是不一样的
     * （1）在DOS和Windows中，每行结尾是 “\r\n”；
     * （2）Linux系统里，每行结尾只有 “\n”；
     * （3）Mac系统里，每行结尾是只有 "\r"。
     * 为了使得同一个java程序的换行符在所有的操作系统中都有一样的表现，使用%n，就可以做到平台无关的换行
     * */
    public void Step3(){
        System.out.printf("这是换行符%n");
        System.out.printf("这是换行符%n");
    }
    /**
     *总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
     * */
    public void Step4(){
        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);

        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
    }
    /**
     *
     * */
    public void Task(){
        java.lang.String Where;
        java.lang.String Company;
        java.lang.String Name;
        int Money;
        java.lang.String Object;
        java.lang.String Units;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入地名： ");
        Where = scanner.next();
        System.out.println("请输入公司名称：");
        Company = scanner.next();
        System.out.println("请输入老板名称：");
        Name = scanner.next();

        System.out.println("请输入金额： ");
        Money = scanner.nextInt();
        System.out.println("请输入产品： ");
        Object = scanner.next();
        System.out.println("请输入价格计量单位： ");
        Units = scanner.next();
        java.lang.String format = "%s最大%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%d个亿，带着他的小姨子跑了！我们没办法，拿着%s抵工资！原价都是一%s多、二%s多、三%s多的%s,现在全部只卖二十块，统统二十块！%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(format,Where,Company,Name,Money,Object,Units,Units,Units,Object,Name);
    }

    public static void main(java.lang.String[] args) {
        PrintF_Format printF_format = new PrintF_Format();
        printF_format.Step1();
        printF_format.Step2();
        printF_format.Step3();
        printF_format.Step4();
        printF_format.Task();
    }
}
