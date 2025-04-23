package com.progettoRogueLike.factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Hero;
import com.progettoRogueLike.model.room.Room;
import com.progettoRogueLike.record.HeroAttributes;

public class HeroFactoryImpl implements IHeroFactory {

    @Override
    public Hero createHero(Dungeon dungeon,
                           String name,
                           HeroAttributes stats,
                           int startingRoomId) {
        Room startingRoom = dungeon.getRoomId(startingRoomId);
        return new Hero(
                name,
                stats.hp(),
                stats.level(),
                stats.strength(),
                stats.dexterity(),
                stats.defense(),
                startingRoom
        );
    }
}
