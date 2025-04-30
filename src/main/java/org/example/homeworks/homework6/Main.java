package org.example.homeworks.homework6;

public class Main {
    public static void main(String[] args) {
        Cat catMax = new Cat("Макс", 10);
        Cat catIgor = new Cat("Игорь", 15);
        Cat catIsidor = new Cat("Исидор", 20);
        Cat catBoris = new Cat("Борис", 30);
        Plate plate = new Plate(50);
        Cat[] cats = {catBoris, catIgor, catIsidor, catMax};

        plate.info();
        plate.addFreshFood(50);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        plate.info();

        System.out.println();
        for (Cat cat : cats) {
            cat.getInfo();
        }
    }
}
