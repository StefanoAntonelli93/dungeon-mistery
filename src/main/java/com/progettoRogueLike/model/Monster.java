package com.progettoRogueLike.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Monster extends GameCharacter {

    // id name hp

    @Override
    public void getStatus() {
        System.out.println("Monster Status => " +
                "Name: " + name +
                ", HP: " + hp);
    }

    @Override
    public void move() {
        System.out.println(name+ " move!");
    }

}
