package org.example.pattern.factory;

public class AnimalFactory {

    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        return null;
    }
}
