package org.example.homeworks.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Cart {
    private List<Item> items;

    {
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void setItems(Item... items) {
        this.items.addAll(List.of(items));
    }

    public Item getItemById(int id) throws RuntimeException {
        Item resultItem = null;
        for (Item item : items) {
            if (item.getItemId() == id) {
                resultItem = item;
            }
        }
        if (isNull(resultItem)) {
            throw new RuntimeException("Товар с " + id + " не найден");
        }
        return resultItem;
    }

    public void printCartPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        System.out.println(totalPrice);
    }

    public void printCartPriceWithDiscount() {
        double totalPrice = 0;
        for (Item item : items) {
            if (item.getFinalPrice() > 0) {
                totalPrice += item.getFinalPrice();
            } else {
                totalPrice += item.getPrice();
            }
        }
        System.out.println(totalPrice);
    }

    public void setDiscountForCart(int discount){
        for (Item item : items) {
            item.setFinalPrice(discount);
        }
    }
}
