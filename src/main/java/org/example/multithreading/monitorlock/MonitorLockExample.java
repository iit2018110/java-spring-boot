package org.example.multithreading.monitorlock;

public class MonitorLockExample {
    public synchronized void method1() {
        System.out.println("inside method1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("finishing method1");
    }

    public void method2() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("inside method2, but before synchronized block");
        synchronized (this) {
            System.out.println("inside method2");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method3() {
        System.out.println("inside method3");
    }
}
