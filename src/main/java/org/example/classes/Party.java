package org.example.classes;

import org.example.abstracts.Character;
import org.example.abstracts.Room;
import org.example.rooms.Loot;

import java.util.ArrayList;

public class Party {
    ArrayList<Character> partyMembers;
    int partyLoot;
    Room currentRoom;


    public Party(ArrayList<Character> partyMembers, int partyLoot, Room currentRoom){
        this.partyMembers = partyMembers;
        this.partyLoot = partyLoot;
        this.currentRoom = currentRoom;
    }

    public ArrayList<Character> getPartyMembers() {
        return partyMembers;
    }
    public String enterRoom(Room room){
        setCurrentRoom(room);
        return "You enter the room. " + room.describeRoom();
    }
    public String collectLoot(Loot loot){
        setPartyLoot(getPartyLoot() + loot.getValue());
        return "You pick up the " + loot.getName() + " and add it to your collection. You estimate it to be worth " + loot.getValue() + "gold coins.";
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setPartyMembers(ArrayList<Character> partyMembers) {
        this.partyMembers = partyMembers;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int getPartyLoot() {
        return partyLoot;
    }

    public void setPartyLoot(int value) {
        this.partyLoot = partyLoot;
    }
}
