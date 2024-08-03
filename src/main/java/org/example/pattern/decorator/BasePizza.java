package org.example.pattern.decorator;

public class BasePizza implements Pizza {
    private static final int PRICE = 50;

    @Override
    public int calculateCost() {
        return PRICE;
    }
}
