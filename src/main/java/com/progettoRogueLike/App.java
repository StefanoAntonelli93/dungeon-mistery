package com.progettoRogueLike;

import com.progettoRogueLike.model.CharacterInventory;
import com.progettoRogueLike.model.Hero;
import com.progettoRogueLike.model.Monster;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Dungeon Mistery!" );

        Hero hero = new Hero();
        hero.setName( "Arthur" );
        hero.setHp( 100 );
        hero.getStatus();

        Monster valgavoth = new Monster();
        valgavoth.setName( "Valgavoth" );
        valgavoth.setHp( 200 );
        valgavoth.getStatus();

        valgavoth.move();
        hero.move();
        hero.attack( valgavoth );

        CharacterInventory inventory = new CharacterInventory();
        inventory.addItems("potion");
        inventory.addItems("apple");
        inventory.addItems("orange");
        inventory.addItems("grape");
        inventory.addItems("pearl");
        inventory.addItems("water");
        inventory.displayInventory();

    }
}
