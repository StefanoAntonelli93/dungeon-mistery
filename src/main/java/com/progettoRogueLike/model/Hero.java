package com.progettoRogueLike.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hero extends GameCharacter {

    private int level;
    private int strength;
    private int dexterity;
    private int defense;

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
    public void move() {
        System.out.println( name + " move!");
    }

    @Override
    public void attack(GameCharacter character) {
        System.out.println( name + " attacks!");
    }
    // overload attack()
    public void attack(Monster monster) {
        System.out.println( name + " attacks " + monster.getName());
    }

}
