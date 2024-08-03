package org.example;

public interface I1 {
    default void fun() {

    }

    default void run() {
        System.out.println("hi");
    }
}
