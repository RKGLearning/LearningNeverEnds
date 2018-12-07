package com.copart.threads.IntruptingThread;

/***
 * after interrupting the thread, we handle the exception, so it will break out the sleeping but will not stop working.
 */
public class ThreadIntruptExample2 extends Thread {
    public void run() {
        try {
            Thread.sleep(1000000);
            System.out.println("task");
        } catch (InterruptedException ex) {
            System.out.println(" Exception Handled " + ex);
        }
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        ThreadIntruptExample2 t1 = new ThreadIntruptExample2();
        t1.start();
        t1.interrupt();
    }
}
