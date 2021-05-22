package com.demo.java.Middle.Middle07_11_2020.IO_ObjectStream;

import java.io.*;

public class Task {
    /**
     * 要创建对象流对象对应的类必须实现Serializable接口
     * 且是在依靠字节输入输出流的基础上
     * 对象输出流ObjectInputStream
     * 对象输入流ObjectOutputStream
     */
    //对象输入流
    public static void or(ObjectInputStream Obj) throws IOException, ClassNotFoundException{
        _hero hero =  (_hero) Obj.readObject();//获取对象数据
        hero.show();
        Obj.close();
    }
    public static void main(String[] args) {
        File file = new File("C:/Users/Jake-y/Desktop/a.txt");
        try {
            _hero h =new _hero("h1",110d);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            objectOutputStream.writeObject(h);
            or(objectInputStream);
            fileInputStream.close();
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//hero类
class _hero implements Serializable {
    String name;
    Double hp;
    void show(){
        System.out.println("name："+name+"\n"+"血量"+hp);
    }
    public _hero(String name, Double hp){
        this.hp = hp;
        this.name = name;
    }
}