package org.example.homeworks.homework8;

public class Human implements Participant {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 90;
    }

    @Override
    public int jump() {
        return 1;
    }

    public String getName() {
        return name;
    }
}
