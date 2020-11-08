package com.demo.java.Middle.Middle07_11_2020;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

public class IO_Stream {
    /**
     *  什么是流
     *  当不同的介质之间有数据交互的时候，JAVA就使用流来实现。
     * 数据源可以是文件，还可以是数据库，网络甚至是其他的程序
     *
     *
     * 比如读取文件的数据到程序中，站在程序的角度来看，就叫做输入流
     * 输入流： InputStream
     * 输出流：OutputStream
     */

    //文件输入流
    //如下代码，就建立了一个文件输入流，这个流可以用来把数据从硬盘的文件，读取到JVM(内存)。
    //
    //目前代码只是建立了流，还没有开始读取，真正的读取在下个章节讲解。
    //
    public void Step1() {
        try{
            File file = new File("d:/lol.txt");
            // 创建基于文件的输入流
            FileInputStream fileInputStream = new FileInputStream(file);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void Task(){
        File file = new File("d:/lol.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IO_Stream stream = new IO_Stream();
        stream.Task();
    }
}
