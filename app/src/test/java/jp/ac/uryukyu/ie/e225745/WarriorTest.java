package jp.ac.uryukyu.ie.e225745;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class WarriorTest {

    @Test void attackWithWeaponSkillTest() {
            int eHp = 1000;
            int attackPower = 100;
            Warrior demoWarrior = new Warrior("デモ戦士", 1, attackPower);
            Enemy slime = new Enemy("スライムもどき", eHp, 1);
            for(int count = 0; count < 3; count++){
                eHp = slime.hitPoint;
                demoWarrior.attackWithWeponSkill(slime);
                assertEquals(eHp - attackPower*1.5, slime.hitPoint);
            }
    }
}


