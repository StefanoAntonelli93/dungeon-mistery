package com.progettoRogueLike.factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Monster;
import com.progettoRogueLike.model.room.Room;
import com.progettoRogueLike.record.MonsterAttributes;

public class MonsterFactoryImpl implements IMonsterFactory {

    @Override
    public Monster createMonster(Dungeon dungeon,
                                 String name,
                                 MonsterAttributes stats,
                                 int startingRoomId) {
        Room startingRoom = dungeon.getRoomId(startingRoomId);
        return new Monster(
                name,
                stats.hp(),
                stats.level(),
                stats.strength(),
                stats.defense(),
                stats.type(),
                startingRoom
        );
    }

}
