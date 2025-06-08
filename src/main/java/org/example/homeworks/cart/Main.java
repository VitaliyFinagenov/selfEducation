package org.example.homeworks.cart;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int discount = 10;
        Item carrot = new Item("Carrot", 58);
        Item milk = new Item("Milk", 86);
        Item tea = new Item("Tea", 1002);
        Item cucumber = new Item("Cucumber", 105);

        Cart cart = new Cart();
        cart.setItems(carrot, milk, tea, cucumber);

        System.out.println("---Cart---");
        cart.printCartPrice();
        System.out.println("---set discount " + discount + "---");
        cart.setDiscountForCart(discount);
        System.out.println("---Cart price---");
        cart.printCartPrice();
        System.out.println("---Cart price with discount---");
        cart.printCartPriceWithDiscount();

        System.out.println("Item ids");
        var items = cart.getItems();
        for (Item item : items) {
            System.out.println(item.getItemId());
        }
        System.out.println("get item by id = 3");
        System.out.println(cart.getItemById(3));

        System.out.println("get by id 7");
        try {
            System.out.println(cart.getItemById(7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
