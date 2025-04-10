package com.progettoRogueLike.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class CharacterInventory {

    ArrayList<String> items = new ArrayList<>();

    public void addItems(String item) {
        items.add(item);
        System.out.println(item + " added in inventory.");
    }
    public void removeItems(String item) {
        items.remove(item);
        System.out.println(item + " removed from inventory.");
    }
    public void displayInventory() {
        System.out.println("hero's inventory: ");
        if(items.isEmpty()) {
            System.out.println("nothing to show");
        } else {
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}
