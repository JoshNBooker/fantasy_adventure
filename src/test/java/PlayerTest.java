import com.sun.xml.internal.ws.wsdl.writer.document.Part;
import org.example.abstracts.Room;
import org.example.abstracts.Weapon;
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
import org.example.spells.ISpell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Cleric cleric;
    Wizard wizard;
    Fighter fighter;
    Sword sword;
    Axe axe;
    Dagger dagger;
    HealingPotion potion;
    BundleOfHealingHerbs herbs;
    Griffin griffin;
    Fireball fireball;
    HealingBolt healingBolt;
    Orc orc;
    TreasureRoom treasureRoom;
    EnemyRoom enemyRoom;
    Party party;


    @Before
    public void setUp(){
        enemyRoom = new EnemyRoom(orc);
        treasureRoom = new TreasureRoom(Loot.SACKOFCOINS);
        fireball = new Fireball("Fireball",30, 80);
        healingBolt = new HealingBolt("Healing Bolt",50,30);
        herbs = new BundleOfHealingHerbs(20);
        sword = new Sword(100);
        orc = new Orc("Jonny", 90, sword);
        axe = new Axe(30);
        dagger = new Dagger(13);
        potion = new HealingPotion(60);
        griffin = new Griffin("Gerry", 30, 80);
        cleric = new Cleric("Clarence", 100, new ArrayList<>(), herbs);
        wizard = new Wizard("Waldo", 100, new ArrayList<>(), new ArrayList<>(), griffin, fireball);
        fighter = new Fighter("Frank", 100, new ArrayList<>(), sword);
        fighter.getWeapons().add(axe);
        wizard.getSpells().add(healingBolt);
        cleric.getHealingTools().add(potion);
        party = new Party(new ArrayList<>(), 0, enemyRoom);
        party.getPartyMembers().add(fighter);
        party.getPartyMembers().add(cleric);
        party.getPartyMembers().add(wizard);
    }
    @Test
    public void clericCanHeal(){
        cleric.heal(fighter);
        assertEquals(120, fighter.getHealth());
    }
    @Test
    public void fighterCanAttack(){
        fighter.attack(orc);
        assertEquals(0, orc.getHealth());
    }
    @Test
    public void wizardCanCastSpells(){
        wizard.cast(orc);
        assertEquals(60, orc.getHealth());
    }
    @Test
    public void playersCanSwitchEquipped(){
        fighter.setEquippedWeapon((Weapon) fighter.getWeapons().get(0));
        assertEquals(axe, fighter.getEquippedWeapon());
    }
    @Test
    public void playersCanEnterRoom(){
        party.enterRoom(treasureRoom);
        assertEquals(treasureRoom, party.getCurrentRoom());
    }

    @Test
    public void playerCanDie(){
        orc.attack(fighter);
        assertEquals("Frank has died!", fighter.takeDamage());
    }

}
