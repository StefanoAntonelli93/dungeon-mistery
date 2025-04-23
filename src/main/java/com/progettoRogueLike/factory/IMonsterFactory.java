package com.progettoRogueLike.factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Monster;
import com.progettoRogueLike.record.MonsterAttributes;

public interface IMonsterFactory {
    Monster createMonster(Dungeon dungeon,
                          String name,
                          MonsterAttributes stats,
                          int startingRoomId);
}
