package org.example.creatures;

import org.example.abstracts.Character;
import org.example.abstracts.Enemy;
import org.example.abstracts.Room;
import org.example.abstracts.Weapon;
import org.example.items.IWeapon;

public class Orc extends Character {

    Weapon weapon;


    public Orc(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }
    public String attack(Character player){
        this.weapon.attack(player);
        player.takeDamage();
        return this.getName() + " hit " + player.getName() + " for " + this.weapon.getDamage();
    }
}
