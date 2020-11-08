package com.demo.java.Middle.Middle07_11_2020;

import java.io.*;

public class IO_BitStream {

    /**
     * ASCII码 概念
     * 所有的数据存放在计算机中都是以数字的形式存放的。 所以字母就需要转换为数字才能够存放。
     * 比如A就对应的数字65，a对应的数字97. 不同的字母和符号对应不同的数字，就是一张码表。
     * ASCII是这样的一种码表。 只包含简单的英文字母，符号，数字等等。 不包含中文，德文，俄语等复杂的。
     * */

    /**
     * 以字节流的形式读取文件内容
     * InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
     * FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
     */
    public void Step1(){
        try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f =new File("d:/lol.txt");
            //创建基于文件的输入流
            FileInputStream fileInputStream = new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all = new byte[(int) f.length()];
            fileInputStream.read(all);
            for (byte b : all){
                //打印出来是65 66
                System.out.println(b);
            }
            //每次使用完流，都应该进行关闭
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  以字节流的形式向文件写入数据
     *
     *  OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
     * FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据
     *
     * 注: 如果文件d:/lol2.txt不存在，写出操作会自动创建该文件。
     * 但是如果是文件 d:/xyz/lol2.txt，而目录xyz又不存在，会抛出异常
     */
    public void Step2(){
        try {
            // 准备文件lol2.txt其中的内容是空的
            File file = new File("d:/lol2.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };

            // 创建基于文件的输出流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //把数据写入到输出流
            fileOutputStream.write(data);
            //关闭输出流
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写入数据到文件
     * 以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
     * 但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
     * 那么怎么自动创建xyz目录？
     * 如果是多层目录 d:/xyz/abc/def/lol2.txt 呢？
     */
    public void Task1(){
        try {
            File file = new File("C:\\Users\\Jake-y\\Desktop\\a.txt");
            byte[] bytes = new byte[]{88,89,90};
            File file1 = new File(file.getParent());
            //判断是否存在
            if (!file1.exists()){
                //创建文件夹
                boolean flag = file1.mkdirs();
                if (flag){
                    System.out.println("创建文件夹成功");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bytes);
                    fileOutputStream.close();
                    System.out.println("写入成功");
                }
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                System.out.println("写入成功");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 拆分文件
     * 复原文件
     */
    public void Task2(){
        String path = "C:/Users/Jake-y/Desktop/新建文件夹/IMG_1517.JPG";
        try {
            boolean start = (new File(path).exists()) ? splitFile(path) : mergeFile(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 拆分文件
    static boolean splitFile (String path) throws IOException{
        File file = new File(path);
        int length = (int) file.length();
        // 新建字节数组并将文件数据存入
        byte[] fileContent = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        fileInputStream.read(fileContent);
        fileInputStream.close();
        // 删除原文件
        file.delete();
        // 创建新文件并将内容输出
        int chileLen = length/4;
        for (int i = 0; i < 4; i++) {
            File newFile = new File(path + "-" + i);
            FileOutputStream fileOutputStream = new FileOutputStream(newFile);
            fileOutputStream.write(fileContent, i*chileLen, chileLen);
            if (i == 3 && length % 4 > 0){
                fileOutputStream.write(fileContent, 4* chileLen, length % 4);
                fileOutputStream.close();
            }
        }
        return true;
    }
    // 复原文件
    static boolean mergeFile (String path) throws IOException{
        File file = new File(path);
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        //循环将子文件写入合并文件
        for (int i = 0; i < 4; i++) {
            File childFile = new File(path  + "-" + i);
            InputStream fis = new FileInputStream(childFile);
            byte[] bytes = new byte[(int) childFile.length()];
            fis.read(bytes);
            fis.close();
            fileOutputStream.write(bytes);
            // 删除拆分文件
            childFile.delete();
        }
        return true;
    }

    public static void main(String[] args) {
        IO_BitStream io_bitStream = new IO_BitStream();
//        io_bitStream.Task1();
        io_bitStream.Task2();
    }
}
