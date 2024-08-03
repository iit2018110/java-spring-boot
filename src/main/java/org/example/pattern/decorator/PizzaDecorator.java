package org.example.pattern.decorator;

public abstract class PizzaDecorator implements Pizza {
    private final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int calculateCost() {
        return pizza.calculateCost();
    }
}
