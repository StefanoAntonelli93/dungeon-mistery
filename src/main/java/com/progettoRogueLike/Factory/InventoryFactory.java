package com.progettoRogueLike.Factory;

import com.progettoRogueLike.model.CharacterInventory;

public class InventoryFactory {
    public static CharacterInventory initCharacterInventory() {

        CharacterInventory playerInventory = new CharacterInventory();
        playerInventory.addItems("potion");
        playerInventory.addItems("sword");
        playerInventory.addItems("shield");
        playerInventory.addItems("apple");
        playerInventory.addItems("pearl");
        playerInventory.addItems("water");

        return playerInventory;

    }
}
