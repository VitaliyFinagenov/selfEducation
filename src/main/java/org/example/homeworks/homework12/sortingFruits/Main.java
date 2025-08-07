package org.example.homeworks.homework12.sortingFruits;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple("apple");
        Apple apple2 = new Apple("apple");
        Apple apple3 = new Apple("apple");
        Orange orange1 = new Orange("orange");
        Orange orange2 = new Orange("orange");
        Orange orange3 = new Orange("orange");

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();

        box2.addFruits(orange1);
        box3.addFruits(apple1, apple2, apple3, apple1, apple2, apple3);
        box1.addFruits(apple1, apple2, apple3);
        box4.addFruits(orange1, orange2, orange3);
        pour(box1, box2);

        System.out.println();
        System.out.println("Вес коробок равен - " + box3.compare(box4));
    }

    private static void pour(Box box1, Box box2) {
        System.out.println("box1 type - " + box1.getTypeBox()); //todo доделать, не удалять из коробки фрукты, если не удалось пересыпать (несоответствие типов)
        System.out.println("box2 type - " + box2.getTypeBox());
        System.out.println();

        for (Fruit fruit : box1.getFruits()) {
            box2.addFruits(fruit);
        }
        box1.clear();

        System.out.println("box1 type - " + box1.getTypeBox());
        System.out.println("box2 type - " + box2.getTypeBox());
    }
}
