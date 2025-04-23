package com.progettoRogueLike.model.character;

import com.progettoRogueLike.model.room.Room;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monster {
    private int id;
    private String name;
    private int hp;

    public Monster(String name, int hp, int level, int strength, int defense, String type, Room currentRoom) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.strength = strength;
        this.defense = defense;
        this.type = type;
        this.currentRoom = currentRoom;
    }

    private int level;
    private int strength;
    private int defense;
    private String type;
    private Room currentRoom;

    public void getStatus() {
        System.out.println("Monster Status => "
                + "Name: " + name
                + ", HP: " + hp
                + ", Level: " + level
                + ", Strength: " + strength
                + ", Defense: " + defense
                + ", Type: " + type);
    }
}
