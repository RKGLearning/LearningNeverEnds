package com.copart.threads.Joining;

/**
 * The join() method waits for a thread to die. In other words, it causes the currently running threads to stop
 * executing until the thread it joins with completes its task.
 * public void join()throws InterruptedException
 * public void join(long milliseconds)throws InterruptedException
 */
public class ThreadJoiningMilliSecond extends Thread{
    public void run() {
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

        ThreadJoiningMilliSecond t1 = new ThreadJoiningMilliSecond();
        ThreadJoiningMilliSecond t2 = new ThreadJoiningMilliSecond();
        ThreadJoiningMilliSecond t3 = new ThreadJoiningMilliSecond();
        t1.start();

        try {
            t1.join(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /** when t1 completes its task then t2 and t3 starts executing.**/
        
        t2.start();
        t3.start();

    }
}
