package org.example.classes;

import org.example.abstracts.Character;

import org.example.abstracts.Creature;
import org.example.abstracts.Room;
import org.example.abstracts.Spell;

import org.example.creatures.IDefend;
import org.example.spells.ISpell;

import java.util.ArrayList;

public class Wizard extends Character {
    ArrayList<ISpell> spells;
    ArrayList<IDefend> creatures;
    Creature equippedCreature;
    Spell equippedSpell;

    public Wizard(String name, int health, ArrayList<ISpell> spells, ArrayList<IDefend> creatures, Creature equippedCreature, Spell equippedSpell) {
        super(name, health);
        this.spells = spells;
        this.creatures = creatures;
        this.equippedCreature = equippedCreature;
        this.equippedSpell = equippedSpell;

    }
    public String cast(Character target){
        this.equippedSpell.cast(target);
        return this.getName() + " cast " + this.equippedSpell.getName() + " on " + target.getName();
    }
    public String attackWithCreature(Character target){
        this.equippedCreature.attack(target);
        return this.getName()+"'s "+this.equippedCreature.getName()+" attacked for " + this.equippedCreature.getDamage() + " damage ";
    }

    public ArrayList<ISpell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<ISpell> spells) {
        this.spells = spells;
    }

    public ArrayList<IDefend> getCreatures() {
        return creatures;
    }

    public IDefend getEquippedCreature() {
        return equippedCreature;
    }

    public ISpell getEquippedSpell() {
        return equippedSpell;
    }

    public void setCreatures(ArrayList<IDefend> creatures) {
        this.creatures = creatures;
    }

    public void setEquippedCreature(Creature equippedCreature) {
        this.equippedCreature = equippedCreature;
    }

    public void setEquippedSpell(Spell equippedSpell) {
        this.equippedSpell = equippedSpell;
    }

}
