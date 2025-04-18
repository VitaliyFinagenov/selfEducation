package org.example.homeworks.special_order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Dish {
    private String name;
    private Base base;
    private MainIngredient mainIngredient;
    private List<Souse> souses;
    private List<SideIngredient> sideIngredients;
}
