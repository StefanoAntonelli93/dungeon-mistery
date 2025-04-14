package com.progettoRogueLike.interfaces;

import com.progettoRogueLike.model.GameCharacter;
import enums.Direction;

public interface CharacterAction {

    void move(Direction direction);
    void attack(GameCharacter character);
    void use();
    void defend();

}
