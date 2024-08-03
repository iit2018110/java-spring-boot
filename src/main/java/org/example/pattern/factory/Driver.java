package org.example.pattern.factory;

public class Driver {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.getAnimal("Cat");
        System.out.println(cat.speak());

        Animal dog = AnimalFactory.getAnimal("Dog");
        System.out.println(dog.speak());
    }
}
