package org.example.homeworks.homework12.sortingFruits;

public class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return 0.0f;
    }

    @Override
    public String toString() {
        return name;
    }
}
