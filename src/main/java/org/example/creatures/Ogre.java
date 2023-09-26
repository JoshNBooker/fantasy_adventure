package org.example.creatures;

import org.example.abstracts.Character;


import org.example.abstracts.Weapon;


public class Ogre extends Character {

    Weapon weapon;
    public Ogre(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
    public String attack(Character player){
        this.weapon.attack(player);
        player.takeDamage();
        return this.getName() + " hit " + player.getName() + " for " + this.weapon.getDamage();
    }


}
