package org.example.items;
import org.example.abstracts.Character;
import org.example.abstracts.Weapon;

public class Axe extends Weapon implements IWeapon{

    public Axe(int damage) {
        super(damage);
    }

    @Override
    public void attack(Character enemy) {
        enemy.setHealth(enemy.getHealth() - getDamage());
    }

}
