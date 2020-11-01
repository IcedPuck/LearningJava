package com.demo.java.Primary01_11_2020.Overload;


public class Hero_T {
 String name;
 float hp;
 /**
  * 方法一
  * */
 public void attack(){
     System.out.println(name + "未攻击到");
 }
 public void attack(Hero_T h1){
     System.out.println(name + "攻击了" + h1.name);
 }
 public void attack(Hero_T h1, Hero_T h2){
     System.out.println(name + "同时" + h1.name + "和" + h2.name + "进行攻击");
 }
/**
 * 方法二
 * */
public void attack(Hero_T ... heros){
    for(Hero_T hero : heros){
        System.out.println(name + "同时" + hero.name + "进行攻击");
    }
}
    public static void main(String[] args) {
        Hero_T gareen = new Hero_T();
        gareen.name = "盖伦";

        Hero_T teemo = new Hero_T();
        teemo.name = "提莫";

        Hero_T db = new Hero_T();
        db.name = "死歌";


        Hero_T Annie = new Hero_T();
        Annie.name = "安妮";
        gareen.attack();
        gareen.attack(teemo);
        gareen.attack(teemo,db);
        gareen.attack(teemo,db, Annie);
    }
}
