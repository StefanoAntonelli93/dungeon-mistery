package com.progettoRogueLike.model;

import enums.Direction;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {
    private Integer id;
    private String name;
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
}