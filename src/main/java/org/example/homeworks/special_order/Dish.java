package org.example.homeworks.special_order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.homeworks.homework2.Main;

import java.util.List;
@Data
@NoArgsConstructor
public class Dish {
    private String name;
    private Base base;
    private MainIngredient mainIngredient;
    private List<Souse> souses;
    private List<SideIngredient> sideIngredients;
}
