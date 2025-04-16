package com.progettoRogueLike.controller;

import com.progettoRogueLike.factory.CharacterFactory;
import com.progettoRogueLike.factory.InventoryFactory;
import com.progettoRogueLike.factory.RoomFactory;
import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.character.Hero;
import com.progettoRogueLike.model.character.Monster;
import com.progettoRogueLike.model.room.Room;
import com.progettoRogueLike.view.GameIntroFrame;
import com.progettoRogueLike.view.GameView;
import com.progettoRogueLike.enums.Direction;
import lombok.Data;

import javax.swing.*;
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
        System.out.println(hero.getName() + " è nato dalla Luce");
        Monster valgavoth = CharacterFactory.initMonster(dungeon,
                "Valgavoth",
                200,
                3
        );
        monsters.add(valgavoth);
        System.out.println(valgavoth.getName() + " è nato dalle tenebre ");

        Monster vendel = CharacterFactory.initMonster(dungeon,
                "Vendel",
                250,
                5);
        monsters.add(vendel);
        System.out.println(vendel.getName() + " è nato dalle tenebre ");

        // Inventory management
        InventoryFactory.initCharacterInventory().displayInventory();
    }

    // Start Intro
    public void startIntro() {
        SwingUtilities.invokeLater(() -> {
            GameIntroFrame introFrame = new GameIntroFrame(this);
            introFrame.setVisible(true);
        });
    }

    // setting hero's name
    public void setHeroName(String name) {
        // Se l'eroe non è già stato creato, o se devi aggiornare il nome, operi qui:
        if (hero == null) {
            // Inizializza il dungeon se non è già stato fatto
            dungeon = RoomFactory.initDungeon();
            hero = CharacterFactory.initHero(dungeon, name, 100, 1, 5, 5, 5, 1);
        } else {
            // Se l'eroe esiste già, aggiorna il nome:
            hero.setName(name);
        }
        System.out.println("Nome dell'eroe impostato su: " + name);
    }

    // start game
    public void startGameView() {
        // Avvia la GameView
        SwingUtilities.invokeLater(() -> {
            view = new GameView(this);
            view.init();
        });
    }

    public void moveHero(Direction direction) {
        Room ingresso = dungeon.getRoomId(1);
        Room nextRoom = ingresso.getRoom(Direction.EAST);
        if (nextRoom != null) {
            System.out.println(ingresso.getName() + " collegato a Est con: " + nextRoom.getName());
        } else {
            System.out.println("Nessuna stanza a Est..");
        }
        hero.getStatus();
        if (hero.getCurrentRoom().getId() == ingresso.getId()) {
            System.out.println("Player1 in: " + ingresso.getName());
        }
        hero.move(direction);
        view.displayMessage("Ti trovi ora in: " + ingresso.getName() );
    }

}
