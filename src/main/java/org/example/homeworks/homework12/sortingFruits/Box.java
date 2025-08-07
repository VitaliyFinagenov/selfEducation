package org.example.homeworks.homework12.sortingFruits;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Fruit> fruits = new ArrayList<>();

    public float getWeight() {
        return fruits.size() * fruits.getFirst().getWeight();
    }

    public String getTypeBox() {
        return fruits.isEmpty() ? "Empty box" : fruits.getFirst().getName();
    }

    private String getFruitType(Fruit fruit) {
        return fruit.getName();
    }

    public void addFruits(Fruit... fruits) {
        for (Fruit fruit : fruits) {
            addFruit(fruit);
        }
    }

    private void addFruit(Fruit fruit) {
        if (fruits.isEmpty()) {
            fruits.add(fruit);
        } else if (getTypeBox().equals(getFruitType(fruit))) {
            fruits.add(fruit);
        } else {
            System.out.println("Error fruit type");
        }
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void clear() {
        fruits.clear();
    }

    public List<Fruit> getFruits() {
        return fruits;
    }
}
