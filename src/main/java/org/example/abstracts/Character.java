package org.example.abstracts;

public abstract class Character {
    String name;
    int health;
    boolean dead;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
        this.dead = false;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public String takeDamage(){
        if (this.getHealth() > 0) {
            return this.getName() + " has " + this.getHealth() + " left.";
        } else {
            this.setDead(true);
            return this.getName() + " has died!";
        }
    }
}
