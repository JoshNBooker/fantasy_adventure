package org.example;

import org.example.classes.Cleric;
import org.example.classes.Fighter;
import org.example.classes.Party;
import org.example.classes.Wizard;
import org.example.creatures.Griffin;
import org.example.creatures.Orc;
import org.example.items.*;
import org.example.rooms.EnemyRoom;
import org.example.rooms.Loot;
import org.example.rooms.TreasureRoom;
import org.example.spells.Fireball;
import org.example.spells.HealingBolt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TreasureRoom treasureRoom = new TreasureRoom(Loot.SACKOFCOINS);
        Fireball fireball = new Fireball("Fireball",30, 80);
        HealingBolt healingBolt = new HealingBolt("Healing Bolt",50,30);
        BundleOfHealingHerbs herbs = new BundleOfHealingHerbs(20);
        Sword sword = new Sword(10);
        Axe axe = new Axe(30);
        Dagger dagger = new Dagger(13);
        HealingPotion potion = new HealingPotion(60);
        Griffin griffin = new Griffin("Gerry", 30, 80);
        Cleric cleric = new Cleric("Clarence", 100,  new ArrayList<>(), herbs);
        Wizard wizard = new Wizard("Waldo", 100,  new ArrayList<>(), new ArrayList<>(), griffin, fireball);
        Fighter fighter = new Fighter("Frank", 100,  new ArrayList<>(), sword);
        fighter.getWeapons().add(axe);
        wizard.getSpells().add(healingBolt);
        cleric.getHealingTools().add(potion);
        Orc orc = new Orc("orc", 90, sword);
        EnemyRoom enemyRoom = new EnemyRoom(orc);
        Party party = new Party(new ArrayList<>(), 0, enemyRoom);
        party.getPartyMembers().add(fighter);
        party.getPartyMembers().add(cleric);
        party.getPartyMembers().add(wizard);
        Scanner choice = new Scanner(System.in);

        System.out.println("Your party enters the dungeon. There are two doors in front of you, one is plain wood and one is painted pitch black. Which one would you like to enter, plain or black?");
        String selectedRoom = choice.nextLine();
        if ("plain".equals(selectedRoom)) {
            System.out.println(party.enterRoom(treasureRoom));
            System.out.println(party.collectLoot(treasureRoom.getLoot()));
        } else if ("black".equals(selectedRoom)){
            System.out.println(party.enterRoom(enemyRoom));
            String playerReady = choice.nextLine();
            if ("yes".equals(playerReady)) {
                System.out.println(fighter.attack(enemyRoom.getEnemy()));
                System.out.println(wizard.cast(enemyRoom.getEnemy()));
                System.out.println(cleric.heal(wizard));
                System.out.println(orc.attack(fighter));
            }
        }else {
            System.out.println("invalid input");
        }
    }
}