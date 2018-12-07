package com.copart.threads.IntruptingThread;

/***
 * If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method
 * on the thread, breaks out the sleeping or waiting state throwing InterruptedException. If the thread is not in the
 * sleeping or waiting state, calling the interrupt() method performs normal behaviour and doesn't interrupt the
 * thread but sets the interrupt flag to true. Let's first see the methods provided by the Thread class for thread
 * interruption.
 * The 3 methods provided by the Thread class for interrupting a thread
 public void interrupt()
 public static boolean interrupted()
 public boolean isInterrupted()

 */
public class ThreadIntrypExample extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("tasks");
        } catch (InterruptedException ex) {
            throw new RuntimeException("Thread Intrupted" + ex);
        }
    }

    public static void main(String [] args) throws Exception {
        ThreadIntrypExample t1 = new ThreadIntrypExample();
        t1.start();
        try {
            t1.interrupt();
        } catch(Exception e) {
            System.out.println("Exception Handled :" + e);
        }
    }
}
