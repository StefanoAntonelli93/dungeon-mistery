package com.progettoRogueLike.Factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.Hero;
import com.progettoRogueLike.model.Monster;
import com.progettoRogueLike.model.Room;

public class CharacterFactory {

    public static Hero initHero(Dungeon dungeon) {
        Room startingRoom = dungeon.getRoomId(1);
        Hero arthur = new Hero();
        arthur.setName("Arthur");
        arthur.setHp(100);
        arthur.setCurrentRoom(startingRoom);
        return arthur;
    }

    public static Monster initMonster() {
        Monster monster = new Monster();
        monster.setName("Valgavoth");
        monster.setHp(200);
        return monster;
    }
}
