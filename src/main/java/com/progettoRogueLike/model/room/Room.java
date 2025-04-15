package com.progettoRogueLike.model.room;

import com.progettoRogueLike.interfaces.RoomCategory;
import com.progettoRogueLike.model.character.Hero;
import enums.Direction;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room implements RoomCategory {
    private Integer id;
    private String name;
    private RoomCategory category;

    @ToString.Exclude
    Map<Direction, Room> connections = new HashMap<>();
    public void setConnection(Direction direction, Room room) {
        connections.put(direction, room);
        if(room != null) {
            room.getConnections().put(direction.getOpposite(), this);
        }
    }
    public Room getRoom(Direction direction) {
        return connections.get(direction);
    }

    @Override
    public void enter(Hero hero, Room room){
        System.out.println("Sei entrato in una safe room");
    }
}