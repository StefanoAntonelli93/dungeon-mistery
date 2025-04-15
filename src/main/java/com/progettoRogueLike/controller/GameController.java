package com.progettoRogueLike.controller;

import com.progettoRogueLike.Factory.CharacterFactory;
import com.progettoRogueLike.Factory.InventoryFactory;
import com.progettoRogueLike.Factory.RoomFactory;
import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Hero;
import com.progettoRogueLike.model.character.Monster;
import com.progettoRogueLike.model.room.Room;
import com.progettoRogueLike.view.GameView;
import com.progettoRogueLike.enums.Direction;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GameController {
    private Dungeon dungeon;
    private Hero hero;
    private List<Monster> monsters = new ArrayList<>();
    private GameView view;

    public GameController() {
        initGame();
        view = new GameView(this);
        view.init();
    }

    // Initialize the game
    private void initGame() {
        dungeon = RoomFactory.initDungeon();
        hero = CharacterFactory.initHero(dungeon,
              "Player1",
              100,
              1,
              5,
              5,
              5,
              1
        );
        Monster monster = CharacterFactory.initMonster(dungeon,
                "Valgavoth",
                200,
                3
        );
        monsters.add(monster);
        System.out.println(monster.getName() + " è nato dalle tenebre ");

        // info in console
        Room ingresso = dungeon.getRoomId(1);
        Room nextRoom = ingresso.getRoom(Direction.EAST);
        if (nextRoom != null) {
            System.out.println(ingresso.getName() + " collegato a Est con: " + nextRoom.getName());
        } else {
            System.out.println("Nessuna stanza a Est..");
        }
        hero.getStatus();
        if (hero.getCurrentRoom().getId() == ingresso.getId()) {
            System.out.println("Ti trovi in: " + ingresso.getName());
        }

        hero.move(Direction.EAST);
        ingresso.enter(hero, ingresso);

        monster.getStatus();
        if (monster.getCurrentRoom().getId() == ingresso.getId()) {
            System.out.println("Il mostro si trova in: " + ingresso.getName());
        } else {
            System.out.println(monster.getName() + " non si trova qui: " + ingresso.getName());
        }

        hero.attack(monster);
        monster.attack(hero);

        // Inventory management
        InventoryFactory.initCharacterInventory().displayInventory();
    }

    // methods per view
    public void moveHero(Direction direction) {
        hero.move(direction);
        view.displayMessage("L'eroe si è mosso verso " + direction.toString());
    }

}
