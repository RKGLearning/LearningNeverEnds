package com.copart.threads.IntruptingThread;

/**
 * What about isInterrupted and interrupted method?
 * The isInterrupted() method returns the interrupted flag either true or false. The static interrupted() method
 * returns the interrupted flag afterthat it sets the flag to false if it is true.
 */
public class TiExample3 extends Thread{
    public void run() {
        for(int i=1;i<=2;i++) {
            if (Thread.interrupted()) {
                System.out.println("Code for Intrupted Thread...");
            } else {
                System.out.println("Code for Normal Thread...");
            }

        }
        }
        public static void main(String [] args) throws Exception {

        TiExample3 t1 = new TiExample3();
        TiExample3 t2 = new TiExample3();
        t1.start();
        t1.interrupt();
        t2.start();
        }
}
