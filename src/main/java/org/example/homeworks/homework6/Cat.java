package org.example.homeworks.homework6;

import lombok.Getter;

public class Cat {
    private String name;
    @Getter
    private int appetite;
    @Getter
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat() {
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println("Кот " + name + " сыт.");
        } else {
            if (plate.getFoodQuantity() >= appetite) {
                plate.decreaseFood(appetite);
                satiety = true;
                System.out.println("Кот " + name + " начал есть. Съел " + appetite + " едениц еды.\nКот " + name + " наелся и спит.");
            } else {
                System.out.println("Еда кончилась, кот " + name + " требовательно мяучит.");
            }
        }
    }

    public void getInfo() {
        System.out.println("Кот :\n     имя - " + name +
                ";\n     cытость - " + satiety + ";");
    }
}
