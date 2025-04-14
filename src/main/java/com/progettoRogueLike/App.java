package com.progettoRogueLike;

import com.progettoRogueLike.Factory.CharacterFactory;
import com.progettoRogueLike.Factory.InventoryFactory;
import com.progettoRogueLike.Factory.RoomFactory;
import com.progettoRogueLike.model.*;
import enums.Direction;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Dungeon Mistery!" );

        Dungeon dungeon1 = RoomFactory.initDungeon();
        Room ingresso = dungeon1.getRoomId(1);
        Room nextRoom = ingresso.getRoom(Direction.EAST);
        if(nextRoom != null) {
            System.out.println(ingresso.getName() + " collegato a Est con: "+ nextRoom.getName());
        } else {
            System.out.println("Nessuna stanza a Est..");
        }

        Hero arthur = CharacterFactory.initHero(dungeon1);
        arthur.getStatus();
        if (arthur.getCurrentRoom().getId() == ingresso.getId()) {
            System.out.println("Arthur si trova in: " + ingresso.getName());
        }
        arthur.move(Direction.EAST);

        Monster valgavoth = CharacterFactory.initMonster(dungeon1);
        valgavoth.getStatus();
        if(valgavoth.getCurrentRoom().getId() == ingresso.getId()) {
            System.out.println("Valgavoth si trova in: " + ingresso.getName());
        } else {
            System.out.println(valgavoth.getName() + " non si trova qui: " + ingresso.getName() );
        }

        arthur.attack( valgavoth );
        valgavoth.attack( arthur );

        CharacterInventory arthurInventory = InventoryFactory.initCharacterInventory();
        arthurInventory.displayInventory();

    }
}
