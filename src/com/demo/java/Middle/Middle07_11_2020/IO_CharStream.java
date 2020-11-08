package com.demo.java.Middle.Middle07_11_2020;

import java.io.*;

/**
 * Reader字符输入流
 * Writer字符输出流
 * 专门用于字符的形式读取和写入数据
 */
public class IO_CharStream {
    /**
     * 使用字符流读取文件
     * <p>
     * FileReader 是Reader子类，以FileReader 为例进行文件读取
     */
    final String path = "d:/lol.txt";

    public void Step1() {
        // 准备文件lol.txt其中的内容是AB
        File file = new File(path);
        // 创建基于文件的Reader
        try (FileReader fileReader = new FileReader(file)) {
            char[] all = new char[(int) file.length()];
            // 以字符流的形式读取文件所有内容
            fileReader.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用字符流把字符串写入到文件
     *
     * FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
     */
    public void Step2(){
        // 准备文件a.txt
        File file =  new File("C:\\Users\\Jake-y\\Desktop\\a.txt");
        // 创建基于文件的Writer
        try (FileWriter fileWriter = new FileWriter(file)) {
            // 以字符流的形式把数据写入到文件中
            String  data = "abcdef123456789";
            char[] cs = data.toCharArray();
            fileWriter.write(cs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件加密
     *
     * 准备一个文本文件(非二进制)，其中包含ASCII码的字符和中文字符。
     * 设计一个方法
     *
     * public static void encodeFile(File encodingFile, File encodedFile);
     * 在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
     * 加密算法：
     * 数字：
     * 如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
     * 如果是9的数字，变成0
     * 字母字符：
     * 如果是非z字符，向右移动一个，比如d变成e, G变成H
     * 如果是z，z->a, Z-A。
     * 字符需要保留大小写
     * 非字母字符
     * 比如',&^ 保留不变，中文也保留不变
     */
    /**
     * 解密在文件加密中生成的文件。
     * 设计一个方法 public static void decodeFile(File decodingFile, File decodedFile);
     *
     * 在这个方法中把decodingFile的内容进行解密，然后保存到decodedFile文件中。
     * 解密算法：
     * 数字：
     * 如果不是0的数字，在原来的基础上减1，比如6变成5, 4变成3
     * 如果是0的数字，变成9
     * 字母字符：
     * 如果是非a字符，向左移动一个，比如e变成d, H变成G
     * 如果是a，a->z, A-Z。
     * 字符需要保留大小写
     * 非字母字符：
     * 比如',&^ 保留不变，中文也保留不变
     */
    // 加密

    // 解密

    public void Task1(){
        File file =  new File("C:/Users/Jake-y/Desktop/a.txt");
        String lowercCseLetters="qwertyuiopasdfghjklzxcvbnm";
        char[] LCL = new char[lowercCseLetters.length()];

        String upperCaseLetter="QWERTYUIOPASDFGHJKLZXCVBNM";
        char[] UCL = new char[upperCaseLetter.length()];

        LCL = lowercCseLetters.toCharArray();
        UCL = upperCaseLetter.toCharArray();

        try (FileReader fileReader = new FileReader(file);){
            char[] all=new char[(int) file.length()];
            fileReader.read(all);
            for (int i = 0; i < all.length; i++) {
                System.out.println(all[i]);
                // 数字加密
                if (Character.isDigit(all[i])){
                   all[i] += 1;
                } else {
                    all[i] = '0';
                }
                //字母加密
                for (int j = 0; j < LCL.length; j++) {
                    if (all[i] == LCL[j] && Character.isLowerCase(all[i])){
                        if (all[i] != 'z'){
                            all[i] += 1;
                            break;
                        } else {
                            all[i] = 'a';
                            break;
                        }
                    }
                    if (all[i] == UCL[j] && Character.isUpperCase(all[i])){
                        if (all[i] != 'Z'){
                            all[i] += 1;
                            break;
                        } else {
                            all[i] = 'A';
                            break;
                        }
                    }
                }
            }
            fileReader.close();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(all);

            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IO_CharStream io_charStream = new IO_CharStream();
        io_charStream.Task1();
    }
}
