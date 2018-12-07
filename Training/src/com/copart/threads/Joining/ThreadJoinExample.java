package com.copart.threads.Joining;

public class ThreadJoinExample extends Thread {

    public void run() {
        System.out.println("Thread is running ...");
    }
    public static void main(String args[]) {
        ThreadJoinExample t1 = new ThreadJoinExample();
        ThreadJoinExample t2 = new ThreadJoinExample();
        System.out.println("***** Name of Thread T1 : " + t1.getName() + " And Id of Thread t1 : " + t1.getId() +
                "*****");
        System.out.println("***** Name of Thread T2 : " + t2.getName() + " And Id of Thread t2 : " + t2.getId() +
                "*****");
        t1.start();
        t2.start();

        t2.setName("Copart Thread");
        System.out.println("***** Name of Thread T1 : " + t2.getName() + " And Id of Thread t1 : " + t2.getId() +
                "*****");
    }
}
