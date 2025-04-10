package com.progettoRogueLike.model;

import com.progettoRogueLike.interfaces.CharacterAction;
import lombok.Data;

@Data
public abstract class GameCharacter implements CharacterAction {
    // visible only by class in same package
    protected int id;
    protected String name;
    protected int hp;

    @Override
    public void move() {}

    @Override
    public void use() {}

    @Override
    public void attack(GameCharacter character) {}

    @Override
    public void defend() {}

    public abstract void getStatus();

}
