package com.progettoRogueLike;

import com.progettoRogueLike.model.CharacterInventory;
import com.progettoRogueLike.model.Hero;
import com.progettoRogueLike.model.Monster;
import com.progettoRogueLike.model.Room;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Dungeon Mistery!" );

        Hero arthur = new Hero();
        arthur.setName( "Arthur" );
        arthur.setHp( 100 );
        arthur.getStatus();

        Monster valgavoth = new Monster();
        valgavoth.setName( "Valgavoth" );
        valgavoth.setHp( 200 );
        valgavoth.getStatus();

        valgavoth.move();
        arthur.move();
        arthur.attack( valgavoth );
        valgavoth.attack( arthur );

        CharacterInventory inventory = new CharacterInventory();
        inventory.addItems("potion");
        inventory.addItems("sword");
        inventory.addItems("shield");
        inventory.addItems("apple");
        inventory.addItems("pearl");
        inventory.addItems("water");
        inventory.displayInventory();

        Room ingresso = new Room();
        ingresso.setDescription( "Ingresso" );
        Room corridoioA = new Room();
        corridoioA.setDescription( "Corrido A" );
        Room salaNord = new Room();
        salaNord.setDescription( "Sala Nord" );
        Room salaSud = new Room();
        salaSud.setDescription( "Sala Sud" );
        Room salaTesoro = new Room();
        salaTesoro.setDescription( "Salan del Tesoro" );
        Room salaBossFight = new Room();
        salaBossFight.setDescription( "Sala Boss Fight" );
        Room uscita = new Room();
        uscita.setDescription( "Uscita" );

        // bidirectional arcs for room connections
        ingresso.connectRoom( corridoioA );
        ingresso.printConnections();


    }
}
