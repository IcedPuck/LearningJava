package com.demo.java.Middle.Middle07_11_2020;

import java.io.*;
import java.util.Scanner;

public class IO_Systemin {
    /**
     *  System.in
     */
    public void Step1(){
        try (InputStream is = System.in) {
            while (true){
                // 敲入a,然后敲回车可以看到
                // 97 13 10
                // 97是a的ASCII码
                // 13 10分别对应回车换行
                int i = is.read();
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Scanner读取字符串
     *
     * 使用System.in.read虽然可以读取数据，但是很不方便
     * 使用Scanner就可以逐行读取了
     */
    public void Step2(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line =  scanner.nextLine();
            System.out.println(line);
        }
    }

    /**
     *  Scanner从控制台读取整数
     *
     *  使用Scanner从控制台读取整数
     */
    public void Step3(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("第一个整数："+a);
        int b = scanner.nextInt();
        System.out.println("第二个整数："+b);
    }


    public static void main(String[] args) {
        IO_Systemin systemin = new IO_Systemin();
//        systemin.Step1();
//        systemin.Step2();
    }
}

class Stream_in_Modul_P{
    /**
     * 自动创建类
     *
     * 自动创建有一个属性的类文件。
     * 通过控制台，获取类名，属性名称，属性类型，根据一个模板文件，自动创建这个类文件，并且为属性提供setter和getter
     */
    /*  public class @class@ {
        public @type@ @property@;
        public @class@() {
        }
        public void set@Uproperty@(@type@  @property@){
            this.@property@ = @property@;
        }

        public @type@  get@Uproperty@(){
            return this.@property@;
        }*/
    public static void CretfollowFile(){
        /**
         * 功能描述：<br>
         * <先把文件中的内容都按每一行存一个字符串中得到一个字符串数组
         * 在把字符串中的数组都用替换函数替换掉
         * 最后在利用这个新的字符串数组创建一个完整的类文件>
         *
         No such property: code for class: Script1
         *@return:void
         *&@since:1.0.0
         *@Author:zengj
         *@Date:2020/11/1 12:26
         */
        String str[] = getString();
        File file = new File("C:/Users/Jake-y/Desktop/a.txt");
        String strs[] = new String[20];
        try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int nn = 0;
            while (true){
                String string = bufferedReader.readLine();
                if(string == null){
                    break;
                }
                if (string.length() != 0){
                    strs[nn++] = string;
                }
            }
            char cc[] = str[2].toCharArray();
            cc[0] = Character.toUpperCase(cc[0]);
            String ss = new String(cc);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] != null){
                    if (strs[i].length() != 0){
                        strs[i] = str[i].replaceAll("@class@", str[0]);
                        strs[i]=strs[i].replaceAll("@type@",str[1]);
                        strs[i]=strs[i].replaceAll("@property@",str[2]);
                        strs[i]=strs[i].replaceAll("@Uproperty@",ss);
                    }else {
                        continue;
                    }
                }else {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file2 = new File("C:/Users/Jake-y/Desktop/"+ str[0] +".java");
        try (FileWriter fileWriter = new FileWriter(file2); PrintWriter printWriter = new PrintWriter(fileWriter)) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] != null){
                    if (strs[i].length() != 0){
                        printWriter.write(strs[i]);
                        printWriter.write("\n");
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return //得到一个保存 类名称 属性类型 属性名的字符串数组
     */
    public static String[] getString(){
        String str[] = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类的名称：");
        String classname = scanner.next();
        str[0] = classname;
        System.out.println("请输入属性的类型:");
        String natureclass = scanner.next();
        str[1] = natureclass;
        System.out.println("请输入属性的名称：");
        String shuxname = scanner.next();
        str[2] = shuxname;
        return str;
    }
    public static void Creat_moduleFile(){
        /**
         * 功能描述：<br>
         * <把模板存入模板文件中>
         *
         No such property: code for class: Script1
         *@return:void
         *&@since:1.0.0
         *@Author:zengj
         *@Date:2020/11/1 12:29
         */
        File file = new File("C:/Users/Jake-y/Desktop/a.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String str="public class @class@ {\npublic @type@ @property@;\n public @class@() {\n" +
                    "    }\n public void set@Uproperty@(@type@  @property@){\nthis.@property@ = @property@;}\n pub" +
                    "lic @type@  get@Uproperty@(){\n" +
                    "        return this.@property@;\n" +
                    "    }\n}";
            printWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Creat_moduleFile();
        CretfollowFile();
    }
}
