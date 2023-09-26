package org.example.rooms;
import org.example.abstracts.Character;
import org.example.abstracts.Room;

public class EnemyRoom extends Room {
    Character enemy;

    public EnemyRoom(Character enemy){
        this.enemy = enemy;
    }

    public Character getEnemy() {
        return enemy;
    }

    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }

    @Override
    public String describeRoom() {
        return "In this room there is a snarling " + this.enemy.getName() + ". It blocks the exit. You must defeat it to continue! Are you ready to attack?";
    }
}
