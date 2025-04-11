package com.progettoRogueLike.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private Integer id;
    private String description;

    List<Room> adjacentRooms = new ArrayList<>();

    // connection bidirectional A-B B-A
    public void connectRoom(Room room) {
        if (!this.adjacentRooms.contains(room)) {
            this.adjacentRooms.add(room);
        }
        if (!room.adjacentRooms.contains(this)) {
            room.adjacentRooms.add(this);
        }
    }
    // print rooms connection
    public void printConnections() {
        for (Room room : adjacentRooms) {
            System.out.println(this.description + " djacents to: " + room.description);
        }
    }
}