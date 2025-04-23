package com.progettoRogueLike.factory;

import com.progettoRogueLike.model.CharacterInventory;
import com.progettoRogueLike.record.InventoryAttributes;

public interface IInventoryFactory {
    CharacterInventory createInventory(InventoryAttributes attrs);
}