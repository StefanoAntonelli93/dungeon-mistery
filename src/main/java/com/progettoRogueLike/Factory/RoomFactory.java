package com.progettoRogueLike.Factory;

import com.progettoRogueLike.model.Dungeon;
import com.progettoRogueLike.model.room.CombatRoom;
import com.progettoRogueLike.model.room.SafeRoom;
import com.progettoRogueLike.enums.Direction;

public class RoomFactory {
    public static Dungeon initDungeon() {
        
        Dungeon dungeon1 = new Dungeon();

        SafeRoom ingresso = new SafeRoom();
        ingresso.setName("Ingresso");
        ingresso.setId(1);
        dungeon1.addRoom(ingresso);

        SafeRoom corridoioA = new SafeRoom();
        corridoioA.setName("Corridoio A");
        corridoioA.setId(2);
        dungeon1.addRoom(corridoioA);

        SafeRoom corridoioB = new SafeRoom();
        corridoioB.setName("Corridoio B");
        corridoioB.setId(3);
        dungeon1.addRoom(corridoioB);

        SafeRoom corridoioC = new SafeRoom();
        corridoioC.setName("Corridoio C");
        corridoioC.setId(4);
        dungeon1.addRoom(corridoioC);

        CombatRoom salaTesoro = new CombatRoom();
        salaTesoro.setName("Sala del Tesoro");
        salaTesoro.setId(5);
        dungeon1.addRoom(salaTesoro);

        SafeRoom cucine = new SafeRoom();
        cucine.setName("Cucine");
        cucine.setId(6);
        dungeon1.addRoom(cucine);

        CombatRoom salaGrande = new CombatRoom();
        salaGrande.setName("Sala Grande");
        salaGrande.setId(7);
        dungeon1.addRoom(salaGrande);

        CombatRoom salaTrono = new CombatRoom();
        salaTrono.setName("Sala del Trono");
        salaTrono.setId(8);
        dungeon1.addRoom(salaTrono);

        CombatRoom prigione = new CombatRoom();
        prigione.setName("Prigione");
        prigione.setId(9);
        dungeon1.addRoom(prigione);

        CombatRoom tanaTroll = new CombatRoom();
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
