package com.copart.threads.IntruptingThread;

/**
 * If thread is not in sleeping or waiting state, calling the interrupt() method sets the interrupted flag to true
 * that can be used to stop the thread by the java programmer later.
 */
public class TiExample2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
/*            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }*/
        }
    }

    public static void main(String[] args) throws Exception {
        TiExample2 t1 = new TiExample2();
        t1.start();
        t1.interrupt();
    }
}
