package com.demo.java.Middle.Middle06_11_2020.Custom;

public class Hero {
    public String name;
    protected float hp;

    public void attackHero(Hero hero) throws  EnemyHeroIsDeadException{
        if (hero.hp == 0){
            throw new EnemyHeroIsDeadException(hero.name + "已经挂了,不需要施放技能");
        }
    }

    public String toString(){
        return name;
    }
    class EnemyHeroIsDeadException extends Exception{
        public EnemyHeroIsDeadException(){

        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616;

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 0;

        try {
            garen.attackHero(teemo);
        } catch (EnemyHeroIsDeadException e) {
            // TODO Auto-generated catch block
            System.out.println("异常的具体原因:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
