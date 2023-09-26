package org.example.items;

import org.example.abstracts.Character;
import org.example.abstracts.HealingTool;

public class BundleOfHealingHerbs extends HealingTool implements IHeal{
    public BundleOfHealingHerbs(int healValue) {
        super(healValue);
    }

    @Override
    public void heal(Character target) {
        target.setHealth(target.getHealth() + this.getHealValue());
    }
}
