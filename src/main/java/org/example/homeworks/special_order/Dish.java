package org.example.homeworks.special_order;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Dish {
    private String name;
    private Base base;
    private MainIngredient mainIngredient;
    private List<Souse> souses;
    private List<SideIngredient> sideIngredients;
}
