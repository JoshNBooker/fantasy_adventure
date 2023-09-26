package org.example.abstracts;

import org.example.items.IWeapon;

public abstract class Weapon implements IWeapon {
    int damage;
    public Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
