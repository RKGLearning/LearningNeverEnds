package com.copart.threads.Joining;

/**
 * The join() method waits for a thread to die. In other words, it causes the currently running threads to stop
 * executing until the thread it joins with completes its task.
 * public void join()throws InterruptedException
 * public void join(long milliseconds)throws InterruptedException
 */
public class ThreadJoining  extends Thread{
    public void run() {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        for (int i =1;i<=5;i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {

        ThreadJoining thread1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();

        thread1.start();
//        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /** when thread1 completes its task then t2 and t3 starts executing.**/

        t2.start();
        t3.start();

    }
}
