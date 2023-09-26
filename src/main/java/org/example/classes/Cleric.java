package org.example.classes;

import org.example.abstracts.Character;
import org.example.abstracts.HealingTool;
import org.example.abstracts.Room;
import org.example.items.IHeal;

import java.util.ArrayList;

public class Cleric extends Character {
    ArrayList<IHeal> healingTools;
    HealingTool equippedHealingTool;

    public Cleric(String name, int health, ArrayList<IHeal> healingTools, HealingTool equippedHealingTool) {
        super(name, health);
        this.healingTools = healingTools;
        this.equippedHealingTool = equippedHealingTool;
    }
    public String heal(Character player){
        this.equippedHealingTool.heal(player);
        return this.getName() + " healed " + player.getName() + " for " + this.equippedHealingTool.getHealValue();
    }

    public ArrayList<IHeal> getHealingTools() {
        return healingTools;
    }

    public void setHealingTools(ArrayList<IHeal> healingTools) {
        this.healingTools = healingTools;
    }

    public HealingTool getEquippedHealingTool() {
        return equippedHealingTool;
    }

    public void setEquippedHealingTool(HealingTool equippedHealingTool) {
        this.equippedHealingTool = equippedHealingTool;
    }



}
