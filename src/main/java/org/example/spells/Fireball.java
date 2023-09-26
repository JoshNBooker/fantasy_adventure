package org.example.spells;

import org.example.abstracts.Character;
import org.example.abstracts.Spell;

public class Fireball extends Spell implements ISpell {
    int damage;
    public Fireball(String name, int damage, int manaValue) {
        super(name, manaValue);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void cast(Character target) {
        target.setHealth(target.getHealth() - this.getDamage());
        target.takeDamage();
    }


}
