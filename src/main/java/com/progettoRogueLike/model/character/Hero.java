package com.progettoRogueLike.model.character;

import com.progettoRogueLike.model.room.Room;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hero {
    private int id;
    private String name;
    private int hp;
    private int level;
    private int strength;
    private int dexterity;
    private int defense;
    private Room currentRoom;

    public Hero(String name, int hp, int level, int strength, int dexterity, int defense, Room currentRoom) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
        this.defense = defense;
        this.currentRoom = currentRoom;
    }

    public void getStatus() {
        System.out.println("Hero Status => "
                + "Name: " + name
                + ", HP: " + hp
                + ", Level: " + level
                + ", Strength: " + strength
                + ", Dexterity: " + dexterity
                + ", Defense: " + defense);
    }
}
