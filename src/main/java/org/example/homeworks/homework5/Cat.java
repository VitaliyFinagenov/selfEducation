package org.example.homeworks.homework5;

public class Cat extends Animal {
    private static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    public Cat() {
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance > 0) {
            super.run(distance);
        } else {
            System.out.println(super.getName() + " не может столько пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

    public static void printCount() {
        System.out.println("котов создано " + count);
    }
}
