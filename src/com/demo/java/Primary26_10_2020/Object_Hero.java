package com.demo.java.Primary26_10_2020;

public class Object_Hero {
    String name;//名字
    float hp;//生命值
    float armor;//护甲
    int moveSpeed;//移动速度
    int kill;

    String Item_name;
    int Item_price;

    void Keng(){
        System.out.println("真的坑！");
    }
    void addSpeed(int Spped){
        moveSpeed = moveSpeed + Spped;
    }
    float getArmor(){
        return armor;
    }
    void legendary(int kill){
        if (kill >= 6){
            System.out.println("legendery");
        }
    }
    float getHp(){
        return hp;
    }
    void recovery(float blood){
        hp += blood;
    }
    public static void main(String[] args) {
        Object_Hero Garen =  new Object_Hero();
        Garen.name = "盖伦";
        Garen.hp = 616.28f;
        Garen.armor = 27.536f;
        Garen.moveSpeed = 350;
        Garen.kill = 10;
        Garen.recovery(100);
        Garen.addSpeed(100);

        Object_Hero teemo =  new Object_Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        Object_Hero blood=new Object_Hero();
        blood.Item_name="血瓶";
        blood.Item_price=10;

        Object_Hero straw=new Object_Hero();
        straw.Item_name="草鞋";
        straw.Item_price=20;
    }
}
