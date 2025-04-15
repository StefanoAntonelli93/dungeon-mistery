package com.progettoRogueLike.Factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Hero;
import com.progettoRogueLike.model.character.Monster;
import com.progettoRogueLike.model.room.Room;

import java.util.Stack;

public class CharacterFactory {

    public static Hero initHero(Dungeon dungeon) {
        Room startingRoom = dungeon.getRoomId(1);
        Hero arthur = Hero.builder()
                .name("Arthur")
                .hp(100)
                .level(1)
                .strength(10)
                .dexterity(10)
                .defense(5)
                .currentRoom(startingRoom)
                .roomsHistory(new Stack<>())
                .build();
        return arthur;
    }

    public static Monster initMonster(Dungeon dungeon) {
        Room startingRoom = dungeon.getRoomId(3);
        Monster valgavoth = Monster.builder()
                .name("Valgavoth")
                .hp(200)
                .currentRoom(startingRoom)
                .build();
        return valgavoth;
    }
}
