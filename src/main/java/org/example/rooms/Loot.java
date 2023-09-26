package org.example.rooms;

public enum Loot {
    SINGLECOIN(1, "coin"),

    SACKOFCOINS(20, "sack of coins"),
    LARGEBAGOFCOINS(50, "large bag of coins"),
    TREASURECHEST(100,"treasure chest");
    private final int value;
    private final String name;

    Loot(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}

