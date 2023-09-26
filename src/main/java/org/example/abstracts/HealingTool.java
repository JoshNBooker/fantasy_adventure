package org.example.abstracts;

import org.example.items.IHeal;

public abstract class HealingTool implements IHeal {
    int healValue;
    public HealingTool(int healValue){
        this.healValue = healValue;
    }

    public int getHealValue() {
        return healValue;
    }

    public void setHealValue(int healValue) {
        this.healValue = healValue;
    }
}
