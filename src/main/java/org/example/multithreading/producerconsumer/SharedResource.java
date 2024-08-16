package org.example.multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private final Queue<Integer> buffer;
    private final int bufferSize;

    public SharedResource() {
        this.buffer = new LinkedList<>();
        this.bufferSize = 5;
    }

    public synchronized void addItem(int num) {
        System.out.println(Thread.currentThread().getName() + " inside addItem() : " + num);
        while (buffer.size() == bufferSize) {
            try {
                System.out.println("Buffer is full. " + Thread.currentThread().getName() + " is waiting. : " + num);
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        buffer.add(num);
        System.out.println(Thread.currentThread().getName() + " added item : " + num);
        notify();
    }

    public synchronized void consumeItem() {
        System.out.println(Thread.currentThread().getName() + " inside consumeItem()");
        while (buffer.isEmpty()) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting to consume");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Integer element = buffer.poll();
        System.out.println(Thread.currentThread().getName() + " consumed : " + element);
        notify();
    }
}
