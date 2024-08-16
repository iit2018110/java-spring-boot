package org.example.multithreading.producerconsumer;

public class Driver {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                obj.addItem(i);
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                obj.consumeItem();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
