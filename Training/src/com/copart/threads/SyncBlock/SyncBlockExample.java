package com.copart.threads.SyncBlock;

/**
 * Synchronized block can be used to perform synchronization on any specific resource of the method.
 *
 * Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use
 * synchronized block.
 *
 * If you put all the codes of the method in the synchronized block, it will work same as the synchronized method.
 *
 * Points to remember for Synchronized block
 * Synchronized block is used to lock an object for any shared resource.
 * Scope of synchronized block is smaller than the method.
 * Syntax to use synchronized block
 * synchronized (object reference expression) {
 * //code block
 * }
 */
public class SyncBlockExample {
    public static void main(String [] args) throws Exception {
        Table obj = new Table();
        SyncThread1 t1 = new SyncThread1(obj);
        SyncThread2 t2 = new SyncThread2(obj);
        t1.start();
        t2.start();
    }
 }
