package org.example;

public interface IGreeting {
    default String sayHi() {
        return "Hello!";
    }
}
