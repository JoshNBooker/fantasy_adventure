package org.example.abstracts;

import org.example.creatures.IDefend;

public abstract class Creature implements IDefend {

    String name;
    int damage;
    int healthPoints;


    public Creature(String name, int damage, int healthPoints){
        this.damage = damage;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
