package com.copart.threads.Priority;

/**
 * Each thread have a priority. Priorities are represented by a number between 1 and 10. In most cases, thread
 * schedular schedules the threads according to their priority (known as preemptive scheduling). But it is not
 * guaranteed because it depends on JVM specification that which scheduling it chooses.
 * constants defined in Thread class:
 * public static int MIN_PRIORITY
 * public static int NORM_PRIORITY
 * public static int MAX_PRIORITY
 * Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is
 * 10.
 */
public class ThreadPriorityExample extends Thread {
    public void run() {
        System.out.println("Running thread name is : " + Thread.currentThread().getName() + " And  Priority is : " +
                Thread.currentThread().getPriority());
    }

    public static void main(String args[]) {
        ThreadPriorityExample t1 = new ThreadPriorityExample();
        ThreadPriorityExample t2 = new ThreadPriorityExample();
        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(8);

        t1.start();

        t2.start();
    }
}
