package com.progettoRogueLike.interfaces;

import com.progettoRogueLike.enums.Direction;

public interface CharacterAction {

    void move(Direction direction);
    void attack();
    void use();
    void defend();

}
