package com.progettoRogueLike.factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Hero;
import com.progettoRogueLike.record.HeroAttributes;

public interface IHeroFactory {
    Hero createHero(Dungeon dungeon,
                    String name,
                    HeroAttributes stats,
                    int startingRoomId);
}
