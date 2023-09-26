package org.example.rooms;

import org.example.abstracts.Room;

public class TreasureRoom extends Room {
    Loot loot;
    public TreasureRoom(Loot loot){
        this.loot = loot;
    }

    public Loot getLoot() {
        return loot;
    }

    public void setLoot(Loot loot) {
        this.loot = loot;
    }

    @Override
    public String describeRoom() {
        return "In front of you is a " + this.getLoot().getName();
    }
}
