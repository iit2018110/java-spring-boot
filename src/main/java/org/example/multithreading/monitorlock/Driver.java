package org.example.multithreading.monitorlock;

public class Driver {
    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(() -> obj.method1());
        Thread t2 = new Thread(() -> obj.method2());
        Thread t3 = new Thread(() -> obj.method3());

        t1.start();
        t2.start();
        t3.start();
    }
}
