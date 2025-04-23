package com.progettoRogueLike.factory;

import com.progettoRogueLike.model.CharacterInventory;
import com.progettoRogueLike.record.InventoryAttributes;

public class InventoryFactoryImpl implements IInventoryFactory {
    @Override
    public CharacterInventory createInventory(InventoryAttributes attrs) {
        CharacterInventory inventory = new CharacterInventory();
        for (String item : attrs.items()) {
            inventory.addItems(item);
        }
        return inventory;
    }

}
