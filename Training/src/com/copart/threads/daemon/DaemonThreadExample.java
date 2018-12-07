package com.copart.threads.daemon;

/**
 * Daemon thread in java is a service provider thread that provides services to the user thread. Its life depend on
 * the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically
 * There are many java daemon threads running automatically e.g. gc, finalizer etc.
 *
 * You can see all the detail by typing the jconsole in the command prompt. The jconsole tool provides information
 * about the loaded classes, memory usage, running threads etc
 * Points to remember for Daemon Thread in Java
 * It provides services to user threads for background supporting tasks. It has no role in life than to serve user
 * threads.
 * Its life depends on user threads.
 * It is a low priority thread.
 *
 * Why JVM terminates the daemon thread if there is no user thread?
 * The sole purpose of the daemon thread is that it provides services to user thread for background supporting task.
 * If there is no user thread, why should JVM keep running this thread. That is why JVM terminates the daemon thread
 * if there is no user thread.
 *
 * Methods for Java Daemon thread by Thread class
 * The java.lang.Thread class provides two methods for java daemon thread.
 *
 * 1)	public void setDaemon(boolean status)	is used to mark the current thread as daemon thread or user thread.
 * 2)	public boolean isDaemon()	is used to check that current is daemon.
 */
public class DaemonThreadExample extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {

            System.out.println("Daemon Thread.");
        } else {
            System.out.println("User Thread");
        }
    }

    public static void main(String args[]) {
        DaemonThreadExample t1 = new DaemonThreadExample();
        DaemonThreadExample t2 = new DaemonThreadExample();
        DaemonThreadExample t3 = new DaemonThreadExample();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
