package org.example.items;

import org.example.abstracts.Character;
import org.example.abstracts.HealingTool;

public class HealingPotion extends HealingTool implements IHeal {
    public HealingPotion(int healValue) {
        super(healValue);
    }

    @Override
    public void heal(Character target) {
        target.setHealth(target.getHealth() + this.getHealValue());
    }
}
