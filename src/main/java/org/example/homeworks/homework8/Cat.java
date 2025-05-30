package org.example.homeworks.homework8;

public class Cat implements Participant {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 10000;
    }

    @Override
    public int jump() {
        return 2;
    }

    public String getName() {
        return name;
    }
}
