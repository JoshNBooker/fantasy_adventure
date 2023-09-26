package org.example.abstracts;

import org.example.spells.ISpell;

import org.example.spells.ISpell;

public abstract class Spell implements ISpell {
    protected int manaValue;
    protected String name;

    public Spell(String name, int manaValue) {
        this.name = name;
        this.manaValue = manaValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManaValue() {
        return manaValue;
    }

    public void setManaValue(int manaValue) {
        this.manaValue = manaValue;
    }
}
