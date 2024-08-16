package org.example.multithreading.synchronizedblock;

public class SynchronizedTest {
//    public synchronized void method1() {
//        System.out.println(Thread.currentThread().getName() + " : inside method1");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void method1() {
        System.out.println("inside method1");
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " : inside synchronized block of method1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
