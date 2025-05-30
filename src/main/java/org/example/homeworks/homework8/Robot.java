package org.example.homeworks.homework8;

public class Robot implements Participant {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public int run() {
        return 1000;
    }

    @Override
    public int jump() {
        return 10;
    }

    public String getName() {
        return name;
    }
}
