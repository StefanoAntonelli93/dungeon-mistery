package com.progettoRogueLike.model.character;

import com.progettoRogueLike.model.room.Room;
import com.progettoRogueLike.enums.Direction;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Stack;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class Hero extends GameCharacter {

    private int level;
    private int strength;
    private int dexterity;
    private int defense;

    private Room currentRoom;
    private Stack<Room> roomsHistory;

    @Override
    public void getStatus() {
        System.out.println("Hero Status => " +
                "Name: " + name +
                ", HP: " + hp +
                ", Level: " + level +
                ", Strength: " + strength +
                ", Dexterity: " + dexterity +
                ", Defense: " + defense);
    }


    @Override
    public void move(Direction direction) {
        if (currentRoom == null) {
            System.out.println("La stanza corrente non è stata inizializzata.");
            return;
        }
        Room nextRoom = currentRoom.getRoom(direction);
        if(nextRoom != null) {
            roomsHistory.push(nextRoom);
            currentRoom = nextRoom;
            System.out.println( name + " cammini verso " + direction + " ed entri in : " + nextRoom.getName());
        } else {
            System.out.println("Nessuna stanza trovata in direzione " + direction);
        }
    }

    @Override
    public void attack(GameCharacter character) {
        System.out.println( name + " attacks!");
    }
    // overload attack()
    public void attack(Monster monster) {
        System.out.println( name + " attacks: " + monster.getName());
    }

}
