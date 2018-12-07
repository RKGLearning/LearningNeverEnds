package com.copart.threads.Multi;

/**
 * If you have to perform single task by many threads, have only one run() method.For example:
 */
public class MultiThreadingex extends Thread{
    public void run() {
        System.out.println("Task One is running");
    }
    public static void main(String [] args) {
        MultiThreadingex t1 = new MultiThreadingex();
        MultiThreadingex t2 = new MultiThreadingex();
        MultiThreadingex t3 = new MultiThreadingex();
        t1.start();
        t2.start();
        t3.start();
    }
}
