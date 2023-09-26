package org.example.abstracts;

import org.example.items.IWeapon;

public abstract class Enemy {

    String name;
    int health;
    IWeapon weapon;

    public Enemy(String name, int health, IWeapon weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
