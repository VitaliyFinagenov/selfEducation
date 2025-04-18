package org.example.homeworks.special_order;


import java.util.List;

/**
 * Воспроизведи создание бутерброда с сосиской, майонезом и луком.
 */
public class Main {
    public static void main(String[] args) {
        Base bread = new Base("хлебушек");
        MainIngredient sausage = new MainIngredient("сосиска");
        Souse mayones = new Souse("майнез");
        SideIngredient onion = new SideIngredient("лук");
        Dish sandwich = new Dish(
                "бутерброд",
                bread,
                sausage,
                List.of(mayones),
                List.of(onion)
        );

        System.out.println(sandwich.toString());
    }
}
