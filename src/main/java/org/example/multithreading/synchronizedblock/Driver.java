package org.example.multithreading.synchronizedblock;

public class Driver {
    public static void main(String[] args) {
        SynchronizedTest obj = new SynchronizedTest();
        Thread t1 = new Thread(obj::method1);
        Thread t2 = new Thread(obj::method1);
        Thread t3 = new Thread(obj::method1);
        t1.start();
        t2.start();
        t3.start();
    }
}
