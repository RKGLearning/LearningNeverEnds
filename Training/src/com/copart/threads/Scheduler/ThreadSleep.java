package com.copart.threads.Scheduler;

public class ThreadSleep extends Thread {
    public void run() {
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(500); } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        t1.start();
        t1.start();
    }

    /***
     *   0
     *   0
     *   1
     *   1
     *   2
     *   2
     *   3
     *   3
     *   4
     *   4
     *
     */
}
