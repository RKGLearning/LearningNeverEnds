package com.copart.threads.synchronization;

/**
 * Synchronization in java is the capability to control the access of multiple threads to any shared resource.
 *
 * Java Synchronization is better option where we want to allow only one thread to access the shared resource.
 * Why use Synchronization
 * The synchronization is mainly used to
 *
 * To prevent thread interference.
 * To prevent consistency problem.
 * Types of Synchronization
 * There are two types of synchronization
 *
 * Process Synchronization
 * Thread Synchronization
 * Here, we will discuss only thread synchronization.
 *
 * Thread Synchronization
 * There are two types of thread synchronization mutual exclusive and inter-thread communication.
 *
 * Mutual Exclusive
 * Synchronized method.
 * Synchronized block.
 * static synchronization.
 * Cooperation (Inter-thread communication in java)
 *
 * Mutual Exclusive
 * Mutual Exclusive helps keep threads from interfering with one another while sharing data. This can be done by
 * three ways in java:
 *
 * by synchronized method
 * by synchronized block
 * by static synchronization
 * Concept of Lock in Java
 * Synchronization is built around an internal entity known as the lock or monitor. Every object has an lock
 * associated with it. By convention, a thread that needs consistent access to an object's fields has to acquire the
 * object's lock before accessing them, and then release the lock when it's done with them.
 *
 * From Java 5 the package java.util.concurrent.locks contains several lock implementations.
 *
 *
 *
 * ***************** Below Example is Non Synchronization  so output is inconsistent. ****
 */
public class TestMethod {

    public static void main(String[] args) throws Exception {
/*** Non Sync *****/
/*        Table obj = new Table();
        MyThread t1 = new MyThread(obj);
        MyThread1 t2 = new MyThread1(obj);
        t1.start();
        t2.start();*/

/*** Sync
 * If you declare any method as synchronized, it is known as synchronized method.

 Synchronized method is used to lock an object for any shared resource.

 When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when
 the thread completes its task.****/
        SyncTable obj = new SyncTable();
        MyThreadSync t1 = new MyThreadSync(obj);
        MyThreadSync1 t2 = new MyThreadSync1(obj);
        t1.start();
        t2.start();
    }
}