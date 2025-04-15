package com.progettoRogueLike.model.character;

import com.progettoRogueLike.interfaces.CharacterAction;
import enums.Direction;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public abstract class GameCharacter implements CharacterAction {
    // visible only by class in same package
    protected int id;
    protected String name;
    protected int hp;

    @Override
    public void move(Direction direction) {}

    @Override
    public void use() {}

    @Override
    public void attack(GameCharacter character) {}

    @Override
    public void defend() {}

    public abstract void getStatus();

}
