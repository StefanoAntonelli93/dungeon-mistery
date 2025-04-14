package com.progettoRogueLike.Factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.Room;
import enums.Direction;

public class RoomFactory {
    public static Dungeon initDungeon() {
        
        Dungeon dungeon1 = new Dungeon();

        Room ingresso = new Room();
        ingresso.setName("Ingresso");
        ingresso.setId(1);
        dungeon1.addRoom(ingresso);

        Room corridoioA = new Room();
        corridoioA.setName("Corridoio A");
        corridoioA.setId(2);
        dungeon1.addRoom(corridoioA);

        Room corridoioB = new Room();
        corridoioB.setName("Corridoio B");
        corridoioB.setId(3);
        dungeon1.addRoom(corridoioB);

        Room corridoioC = new Room();
        corridoioC.setName("Corridoio C");
        corridoioC.setId(4);
        dungeon1.addRoom(corridoioC);

        Room salaTesoro = new Room();
        salaTesoro.setName("Sala del Tesoro");
        salaTesoro.setId(5);
        dungeon1.addRoom(salaTesoro);

        Room cucine = new Room();
        cucine.setName("Cucine");
        cucine.setId(6);
        dungeon1.addRoom(cucine);

        Room salaGrande = new Room();
        salaGrande.setName("Sala Grande");
        salaGrande.setId(7);
        dungeon1.addRoom(salaGrande);

        Room salaTrono = new Room();
        salaTrono.setName("Sala del Trono");
        salaTrono.setId(8);
        dungeon1.addRoom(salaTrono);

        Room prigione = new Room();
        prigione.setName("Prigione");
        prigione.setId(9);
        dungeon1.addRoom(prigione);

        Room tanaTroll = new Room();
        prigione.setName("Tana del Troll ");
        prigione.setId(10);
        dungeon1.addRoom(tanaTroll);

        // connections

        ingresso.setConnection(Direction.EAST, corridoioA);

        corridoioA.setConnection(Direction.EAST, salaGrande);

        salaGrande.setConnection(Direction.EAST, corridoioC);
        salaGrande.setConnection(Direction.SOUTH, cucine);
        salaGrande.setConnection(Direction.NORTH, salaTrono);

        salaTrono.setConnection(Direction.SOUTH, salaGrande);
        salaTesoro.setConnection(Direction.WEST, corridoioA);
        salaTesoro.setConnection(Direction.EAST, corridoioC);

        // TODO FINIRE CONNESIONI ROOMS

        return dungeon1;

    }
}
