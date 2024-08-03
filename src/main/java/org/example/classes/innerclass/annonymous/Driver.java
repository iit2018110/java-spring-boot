package org.example.classes.innerclass.annonymous;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void drive() {
                System.out.println("Driving car");
            }
        };
        car.drive();
    }
}
