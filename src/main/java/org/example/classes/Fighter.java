package org.example.classes;

import org.example.abstracts.Character;
import org.example.abstracts.Enemy;
import org.example.abstracts.Room;
import org.example.abstracts.Weapon;
import org.example.items.IWeapon;

import java.util.ArrayList;

public class Fighter extends Character {
    ArrayList<IWeapon> weapons;
    Weapon equippedWeapon;


    public Fighter(String name, int health, ArrayList<IWeapon> weapons, Weapon equippedWeapon) {
        super(name, health);
        this.weapons = weapons;
        this.equippedWeapon = equippedWeapon;

    }

    public String attack(Character enemy){
        this.equippedWeapon.attack(enemy);
        enemy.takeDamage();
        return this.getName() + " hit " + enemy.getName() + " for " + this.equippedWeapon.getDamage();
    }

    public ArrayList<IWeapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<IWeapon> weapons) {
        this.weapons = weapons;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

}
