package com.demo.java.Middle.Middle07_11_2020;

import java.io.*;

public class IO_BufferStream {
    /**
     * 使用缓存流读取数据
     *
     * 缓存字符输入流 BufferedReader 可以一次读取一行数据
     */
    public void step1(){
        // 准备文件a.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File file = new File("C:/Users/Jake-y/Desktop/a.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            while (true){
                // 一次读一行
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用缓存流写出数据
     *
     * PrintWriter 缓存字符输出流， 可以一次写出一行数据
     */
    public void Step2(){
        // 向文件a.txt中写入三行语句
        File file = new File("C:/Users/Jake-y/Desktop/a.txt");
        try (   // 创建文件字符流
                FileWriter writer = new FileWriter(file);
                // 缓存流必须建立在一个存在的流的基础上
                PrintWriter pw = new PrintWriter(writer);
                ) {
            pw.println("garen kill teemo");
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  flush
     *  有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。 这时候就需要用到flush
     */
    public void Step3(){
        // 向文件a.txt中写入三行语句
        File file = new File("C:/Users/Jake-y/Desktop/a.txt");
        //创建文件字符流
        //缓存流必须建立在一个存在的流的基础上
        try(FileWriter writer =  new FileWriter(file); PrintWriter printWriter =  new PrintWriter(writer)) {
            printWriter.println("garen kill teemo");
            printWriter.flush();
            printWriter.println("teemo revive after 1 minutes");
            printWriter.flush();
            printWriter.println("teemo try to garen, but killed again");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 移除注释
     * 设计一个方法，用于移除Java文件中的注释   public void removeComments(File javaFile)
     * 比如，移出以//开头的注释行
     * File f = new File("d:/LOLFolder/LOL.exe");
     * System.out.println("当前文件是：" +f);
     * //文件是否存在
     * System.out.println("判断是否存在："+f.exists());
     * //是否是文件夹
     * System.out.println("判断是否是文件夹："+f.isDirectory());
     */
    public void Task(File file){
        //缓存流必须建立在一个存在的流的基础上
        FileReader reader = null;
        BufferedReader BReader = null;
        FileWriter writer = null;
        PrintWriter PWriter = null;
        //StringBuffer存放读取到的全部内容
        StringBuffer SBuffer = new StringBuffer();
        try {
            reader = new FileReader(file);
            BReader = new BufferedReader(reader);
            //一次读取一行，循环读取
            while (true){
                String line = BReader.readLine();
                //读取完之后退出循环
                if (line == null){
                    break;
                }
                //去除掉每行首尾空格再筛选：长度大于0的（排除空行）、不以//开头的（排除注释）
                if (line.trim().length()> 0 && !line.trim().startsWith("//")){
                    //每读取一行即追加到StringBuffer里，每追加完一行即回车换行
                    SBuffer.append(line).append("\r\n");
                }
            }
            //将StringBuffer中的内容写入到原文件
            writer = new FileWriter(file);
            PWriter = new PrintWriter(writer);
            PWriter.println(SBuffer);
            PWriter.flush();
            System.out.println("文件处理成功！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                PWriter.close();
                writer.close();
                BReader.close();
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        IO_BufferStream bufferStream = new IO_BufferStream();
        File file = new File("C:/Users/Jake-y/Desktop/a.txt");
        bufferStream.step1();
        bufferStream.Task(file);
    }
}
