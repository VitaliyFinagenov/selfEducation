package org.example.homeworks.cart;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Item {
    private static int count;
    private double price;
    private double finalPrice;
    private String name;
    private int itemId;

    public Item(String name, double price) {
        count++;
        this.itemId = count;
        this.price = price;
        this.name = name;
    }

    public void setFinalPrice(int discount) {
        this.finalPrice = price - (price * ((double) discount / 100));
    }
}
