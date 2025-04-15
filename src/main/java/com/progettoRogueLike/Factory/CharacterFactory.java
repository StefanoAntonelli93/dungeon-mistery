package com.progettoRogueLike.Factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Hero;
import com.progettoRogueLike.model.character.Monster;
import com.progettoRogueLike.model.room.Room;

import java.util.Stack;

public class CharacterFactory {

    public static Hero initHero(
            Dungeon dungeon,
            String name,
            int hp,
            int level,
            int strength,
            int dexterity,
            int defense,
            int startingRoomId) {
        Room startingRoom = dungeon.getRoomId(startingRoomId);
        Hero hero = Hero.builder()
                .name(name)
                .hp(hp)
                .level(level)
                .strength(strength)
                .dexterity(dexterity)
                .defense(defense)
                .currentRoom(startingRoom)
                .roomsHistory(new Stack<>())
                .build();
        return hero;
    }


    public static Monster initMonster(
            Dungeon dungeon,
            String name,
            int hp,
            int startingRoomId
    ) {
        Room startingRoom = dungeon.getRoomId(startingRoomId);
        return Monster.builder()
                .name(name)
                .hp(hp)
                .currentRoom(startingRoom)
                .build();
    }
}
