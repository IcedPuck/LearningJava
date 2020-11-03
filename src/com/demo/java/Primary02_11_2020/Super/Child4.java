package com.demo.java.Primary02_11_2020.Super;

import com.demo.java.Primary02_11_2020.Interface.AD;
import com.demo.java.Primary02_11_2020.Override.Item;
import com.demo.java.Primary02_11_2020.Override.LifePotion;

public class Child4 extends Parent4 implements AD {
    int moveSpeed = 400; // 移动速度
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public int getMoveSpeed() {
        return this.moveSpeed;
    }

    public int getMoveSpeed2() {
        return super.moveSpeed;
    }
    // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i){
        System.out.println("Child4 use item");
        super.useItem(i);//Parent的 UserItem
    }
    public static void main(String[] args) {
        Child4 h = new Child4();
        LifePotion lp = new LifePotion();
    }
}
