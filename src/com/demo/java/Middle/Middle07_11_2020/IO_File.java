package com.demo.java.Middle.Middle07_11_2020;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Date;

public class IO_File {
    /**
     * 创建一个文件对象
     */
    public void Step1() {
        // 绝对路径
        File file = new File("d:/LOLFolder");
        System.out.println("file的绝对路径：" + file.getAbsolutePath());
        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
        File file1 = new File("LOL.exe");
        System.out.println("file1的绝对路径：" + file1.getAbsolutePath());
        // 把file作为父目录创建文件对象
        File file2 = new File(file, "LOL.exe");
        System.out.println("file2的绝对路径：" + file2.getAbsolutePath());
    }

    /**
     * 文件常用方法1
     * <p>
     * 需要在D:\LOLFolder确实存在一个LOL.exe,才可以看到对应的文件长度、修改时间等信息
     */
    public void Step2() {
        File file = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" + file);
        //文件是否存在
        System.out.println("判断是否存在：" + file.exists());
        //是否是文件夹
        System.out.println("判断是否是文件夹：" + file.isDirectory());
        //是否是文件（非文件夹）
        System.out.println("判断是否是文件：" + file.isFile());
        //文件长度
        System.out.println("获取文件的长度：" + file.length());
        //文件最后修改时间
        long time = file.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        file.setLastModified(0);

        //文件重命名
        File file1 = new File("d:/LOLFolder/DOTA.exe");
        file1.renameTo(file1);
        System.out.println("把LOL.exe改名成了DOTA.exe");
        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
    }

    /**
     *  文件常用方法2
     */
    public void Step3() throws IOException {
        File file = new File("d:/LOLFolder/skin/garen.ski");
        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        file.list();

        // 以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[] files = file.listFiles();
        // 以字符串形式返回获取所在文件夹
        file.getParent();
        // 以文件形式返回获取所在文件夹
        file.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        file.mkdir();
        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        file.mkdirs();
        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        file.createNewFile();
        // 所以创建一个空文件之前，通常都会创建父目录
        file.getParentFile().mkdirs();
        // 列出所有的盘符c: d: e: 等等
        file.listRoots();
        // 刪除文件
        file.delete();
        // JVM结束的时候，刪除文件，常用于临时文件的删除
        file.deleteOnExit();
    }
    public void Task(){
        File file = new File("C:\\WINDOWS");
        File[] files = file.listFiles();
        String max = "";
        String min = "";
        long i = Long.MAX_VALUE;
        long j = 0;
        for (File file1 : files){
            if (file1.isFile()){
                if (file1.length() == 0){
                    continue;
                }
                if (file1.length() < i){
                    i = file1.length();
                    min  = file1.toString();
                }
                if (file1.length() > j){
                    j = file1.length();
                    max = file1.toString();
                }
            }
        }
        System.out.println("最大的文件是：" + max + "，其大小是：" + j + "字节");
        System.out.println("最小的文件是：" + min + "，其大小是：" + i +"字节");
    }

    public static void main(String[] args) {
        IO_File io_file = new IO_File();
        io_file.Task();
    }
}
