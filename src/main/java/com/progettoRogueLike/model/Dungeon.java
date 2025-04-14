package com.progettoRogueLike.model;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Data
public class Dungeon {
    Map<Integer, Room> rooms;

    public Dungeon() {
        rooms = new HashMap<>();
    }
    public void addRoom(Room room) {
        rooms.put(room.getId(), room);
    }
    public Room getRoomId(int id){
        return rooms.get(id);
    }
}
