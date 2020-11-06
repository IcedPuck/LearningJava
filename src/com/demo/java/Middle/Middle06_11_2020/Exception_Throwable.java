package com.demo.java.Middle.Middle06_11_2020;

import java.io.File;
import java.io.FileInputStream;

public class Exception_Throwable {
    /**
     * Throwable是类，Exception和Error都继承了该类
     * 所以在捕捉的时候，也可以使用Throwable进行捕捉
     * 如图： 异常分Error和Exception
     * Exception里又分运行时异常和可查异常。
     */
    public void Step1(){
        File file = new File("d:/LOL.exe");
        try {
            new FileInputStream(file);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Exception_Throwable throwable = new Exception_Throwable();
        throwable.Step1();
    }
}
