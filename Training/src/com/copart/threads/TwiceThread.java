package com.copart.threads;

public class TwiceThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }


    public static void main(String args[]) {
        TwiceThread t1 = new TwiceThread();
        t1.run();  // In this State Thread is new
        /* Invoking the run() method from main thread, the run() method goes onto the current call stack rather than
        at the beginning of a new call stack.**/

        t1.start(); // in this state the Thread Will be Runnable.
        /** Each thread starts in a separate call stack.**/
    }
}
