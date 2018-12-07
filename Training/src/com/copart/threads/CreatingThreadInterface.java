package com.copart.threads;

public class CreatingThreadInterface implements Runnable {
    public void run() {
        System.out.println("Thread is running ....");
    }

    public static void main(String args[]) {
           CreatingThreadInterface creatingThreadInterface = new CreatingThreadInterface();
           Thread t1 = new Thread(creatingThreadInterface);
           t1.start();
    }
}
