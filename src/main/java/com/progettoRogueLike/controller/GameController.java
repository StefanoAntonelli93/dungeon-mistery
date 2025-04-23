package com.progettoRogueLike.controller;

import com.progettoRogueLike.factory.*;
import com.progettoRogueLike.model.CharacterInventory;
import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Hero;
import com.progettoRogueLike.model.character.Monster;
import com.progettoRogueLike.record.HeroAttributes;
import com.progettoRogueLike.record.InventoryAttributes;
import com.progettoRogueLike.record.MonsterAttributes;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Getter
public class GameController {
    private final Dungeon dungeon;
    private final Hero hero;
    private final List<Monster> monsters;

    public GameController() {
        // 1) init dungeon
        dungeon = RoomFactory.initDungeon();

        // 2) create factories
        IHeroFactory heroFactory = new HeroFactoryImpl();
        IMonsterFactory monsterFactory = new MonsterFactoryImpl();
        IInventoryFactory invFactory = new InventoryFactoryImpl();

        // 3) build hero stats and create hero
        HeroAttributes stats = new HeroAttributes(
                100,
                1,
                5,
                5,
                5

        );

        hero = heroFactory.createHero(
                dungeon,
                "Player1",
                stats,
                1
        );
        System.out.println(hero.getName() + " è nato dalla Luce");

        // 4) create monsters con loop
        monsters = new ArrayList<>();
        // definisco configurazione in array per facilità di aggiunta
        List<Object[]> monsterConfigs = Arrays.asList(
                new Object[]{"Valgavoth", 200, 3, 8, 4, "Difficoltà 3", 1},
                new Object[]{"Vendel",    250, 5,10, 6, "Difficoltà 5", 1}
        );
        for (Object[] cfg : monsterConfigs) {
            String name      = (String) cfg[0];
            int    hp        = (Integer) cfg[1];
            int    level     = (Integer) cfg[2];
            int    strength  = (Integer) cfg[3];
            int    defense   = (Integer) cfg[4];
            String type      = (String) cfg[5];
            int    roomId    = (Integer) cfg[6];

            // build monster stats
            MonsterAttributes monsterStats = new MonsterAttributes(
                    hp,
                    level,
                    strength,
                    defense,
                    type
            );

            Monster m = monsterFactory.createMonster(
                    dungeon,
                    name,
                    monsterStats,
                    roomId
            );
            monsters.add(m);
            System.out.println(m.getName() + " è nato dalle tenebre");
        }

        // 5) display inventario
        InventoryAttributes invAttrs = new InventoryAttributes(List.of(
                "potion","sword","shield","apple","pearl","water")
        );
        CharacterInventory inventory = invFactory.createInventory(invAttrs);
        inventory.displayInventory();
    }

}
