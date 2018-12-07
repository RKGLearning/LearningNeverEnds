package com.copart.threads.ReIntrantMonitor;

/***
 * According to Sun Microsystems, Java monitors are reentrant means java thread can reuse the same monitor for
 * different synchronized methods if method is called from the method.

 Advantage of Reentrant Monitor
 It eliminates the possibility of single thread deadlocking


 */

/**
 * In this class, m and n are the synchronized methods. The m() method internally calls the n() method.
 *
 * Now let's call the m() method on a thread. In the class given below, we are creating thread using annonymous class.
 */
public class ReintrantMonitorExample {
    public synchronized void m() {
        n();
    }

    public synchronized void n() {
        System.out.println("this is n() method");
    }

    public static void main(String[] args) throws Exception {
        final ReintrantMonitorExample reintrantMonitorExample = new ReintrantMonitorExample();
        Thread t1 = new Thread() {
            public void run() {
                reintrantMonitorExample.m();
            }
        };
        t1.start();
    }
}
