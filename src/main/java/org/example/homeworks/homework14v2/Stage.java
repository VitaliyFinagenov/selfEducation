package org.example.homeworks.homework14v2;

import lombok.Getter;

public abstract class Stage {
    protected int length;
    @Getter
    protected String description;

    public abstract void go(Car car);
}