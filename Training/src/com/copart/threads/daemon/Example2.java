package com.copart.threads.daemon;

/**
 * If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.
 */
public class Example2 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {

            System.out.println("Daemon Thread");
        } else {
            System.out.println("User Thread");
        }
    }
    public static void main(String args[]) {
        Example2 t1 = new Example2();
        Example2 t2 = new Example2();
        t1.start();
        t1.setDaemon(true);
        t2.start();
    }
}
