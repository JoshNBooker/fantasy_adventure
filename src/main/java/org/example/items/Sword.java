package org.example.items;

import org.example.abstracts.Character;
import org.example.abstracts.Enemy;
import org.example.abstracts.Weapon;

public class Sword extends Weapon implements IWeapon {
    public Sword(int damage) {
        super(damage);
    }

    @Override
    public void attack(Character enemy) {
        enemy.setHealth(enemy.getHealth() - this.getDamage());
    }
}
