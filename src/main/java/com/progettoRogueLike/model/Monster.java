package com.progettoRogueLike.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class Monster extends GameCharacter {

    // id name hp
    private Room currentRoom;

    @Override
    public void getStatus() {
        System.out.println("Monster Status => " +
                "Name: " + name +
                ", HP: " + hp);
    }
    
    @Override
    public void attack(GameCharacter character) {
        System.out.println(name + " attacks!");
    }
    public void attack(Hero hero) {
        System.out.println(name + " attacks: " + hero.getName());
    }

}
