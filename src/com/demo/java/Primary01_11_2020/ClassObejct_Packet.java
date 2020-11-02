package com.demo.java.Primary01_11_2020;
import com.demo.java.Primary01_11_2020.Inheritance.Weapon_Item;

public class ClassObejct_Packet {
    public void step1(){
        String name; //姓名

        float hp; //血量

        float armor; //护甲

        int moveSpeed; //移动速度
    }
    public void step2(Weapon_Item w){

    }

    public static void main(String[] args) {
        ClassObejct_Packet packet = new ClassObejct_Packet();
        packet.step1();
    }
}
