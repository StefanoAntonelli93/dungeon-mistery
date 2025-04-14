package com.progettoRogueLike.Factory;

import com.progettoRogueLike.model.CharacterInventory;

public class InventoryFactory {
    public static CharacterInventory initCharacterInventory() {

        CharacterInventory arthurInventory = new CharacterInventory();
        arthurInventory.addItems("potion");
        arthurInventory.addItems("sword");
        arthurInventory.addItems("shield");
        arthurInventory.addItems("apple");
        arthurInventory.addItems("pearl");
        arthurInventory.addItems("water");

        return arthurInventory;

    }
}
