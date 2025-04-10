package com.progettoRogueLike.interfaces;

import com.progettoRogueLike.model.GameCharacter;

public interface CharacterAction {

    void move();
    void attack(GameCharacter character);
    void use();
    void defend();

}
