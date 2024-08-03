package org.example.pattern.decorator;

import org.example.pattern.decorator.topling.CapsicumTopDecorator;
import org.example.pattern.decorator.topling.CheeseTopDecorator;
import org.example.pattern.decorator.topling.CornTopDecorator;

public class Driver {
    public static void main(String[] args) {
//        Pizza: base_pizza + cheese + capsicum + corn
        Pizza pizza = new CornTopDecorator(new CapsicumTopDecorator(new CheeseTopDecorator(new BasePizza())));
        System.out.println(pizza.calculateCost());
    }
}
