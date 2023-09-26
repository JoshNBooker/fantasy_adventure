package org.example.creatures;

import org.example.abstracts.Character;
import org.example.abstracts.Creature;

public class Griffin extends Creature implements IDefend{


    public Griffin(String name, int damage, int healthPoints) {
        super(name, damage, healthPoints);
    }

    @Override
    public void attack(Character enemy) {
        enemy.setHealth(enemy.getHealth() - this.getDamage());
        enemy.takeDamage();
    }

    @Override
    public void defend(Character player) {

    }

}
