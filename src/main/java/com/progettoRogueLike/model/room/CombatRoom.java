package com.progettoRogueLike.model.room;

import com.progettoRogueLike.interfaces.RoomCategory;
import com.progettoRogueLike.model.character.Hero;

public class CombatRoom extends Room implements RoomCategory {
    @Override
    public void enter(Hero hero, Room room){
        System.out.println("Sei entrato in una combat room");
    }
}
