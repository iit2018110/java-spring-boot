package org.example.multithreading.produerconsumereasy;

public class Driver {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Thread producerThread1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            obj.addItem();
        });

        Thread consumerThread1 = new Thread(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            obj.consumeItem();
        });

        producerThread1.start();
        consumerThread1.start();
    }
}
