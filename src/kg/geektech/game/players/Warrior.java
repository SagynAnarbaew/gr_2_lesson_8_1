package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(2)+2;
        boss.setHealth(boss.getHealth() - this.getDamage()*coeff);
        System.out.println(" Warrior hits critical damage "+ this.getDamage()*coeff);

    }
}
