package org.example.spells;


import org.example.abstracts.Character;
import org.example.abstracts.Spell;

public class HealingBolt extends Spell implements ISpell {

    int healValue;
    public HealingBolt(String name, int manaValue, int healValue) {
        super(name, manaValue);
        this.healValue = healValue;
    }


    @Override
    public void cast(Character target) {

    }
}
