package org.example.multithreading.thread;

class Test extends Thread {
    @Override
    public void run() {
        System.out.println("code executed by thread : " + Thread.currentThread().getName());
    }
}

public class Driver {
    public static void main(String[] args) {
        System.out.println("Going inside Main method : " + Thread.currentThread().getName());
        Test obj = new Test();
        obj.start();
        System.out.println("Finish main method : " + Thread.currentThread().getName());
    }
}
