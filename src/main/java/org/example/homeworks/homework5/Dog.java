package org.example.homeworks.homework5;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    public Dog() {
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance > 0) {
            super.run(distance);
        } else {
            System.out.println(super.getName() + " не может столько пробежать");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance > 0) {
            super.swim(distance);
        } else {
            System.out.println(super.getName() + " не может столько проплыть");
        }
    }

    public static void printCount() {
        System.out.println("собак создано " + count);
    }
}
