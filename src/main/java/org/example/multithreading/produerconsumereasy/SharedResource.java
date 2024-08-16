package org.example.multithreading.produerconsumereasy;

public class SharedResource {

    private boolean itemAvailable = false;

    public synchronized void addItem() {
        System.out.println(Thread.currentThread().getName() + " : inside addItem()");
        if (!itemAvailable) {
            this.itemAvailable = true;
            System.out.println(Thread.currentThread().getName() + " : added Item");
        }
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println(Thread.currentThread().getName() + " : inside consumeItem()");
        while (!itemAvailable) {
            try {
                System.out.println(Thread.currentThread().getName() + " : is waiting now!");
                wait(); // Releases monitor lock
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        this.itemAvailable = false;
        System.out.println(Thread.currentThread().getName() + " : consumed Item");
    }
}
