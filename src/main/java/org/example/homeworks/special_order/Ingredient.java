package org.example.homeworks.special_order;

import lombok.*;

@Getter
@Setter
@ToString
public class Ingredient {
    private String name;

    public Ingredient(String name) {
        this.name = name;
    }
}
