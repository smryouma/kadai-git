package jp.ac.uryukyu.ie.e225745;

public class LivingThing{
    public String name;
    public int hitPoint;
    public int attack;
    public boolean dead;


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 名
     * @param maximumHP HP
     * @param attack 攻撃力
     */

    public LivingThing(String nae,int maximumHP,int attack){
        this.name=name;
        hitPoint=maximumHP;
        this.attack=attack;
        dead=false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name ,maximumHP, attack);
    }
    

    public void attack(LivingThing opponent){
        if (this.dead==false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }    
    }

    public boolean isDead(){
        return dead=true;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public String getName(){
        return name;
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = isDead();
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}