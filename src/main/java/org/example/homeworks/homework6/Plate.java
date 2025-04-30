package org.example.homeworks.homework6;

public class Plate {
    private int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void info() {
        System.out.printf("Текущее количество еды - %d\n", foodQuantity);
    }

    public void decreaseFood(int foodQuantity) {
        this.foodQuantity -= foodQuantity;
    }

    public void addFreshFood(int quantity) {
        foodQuantity += quantity;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }
}
