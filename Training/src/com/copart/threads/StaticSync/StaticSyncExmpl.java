package com.copart.threads.StaticSync;

/**
 * If you make any static method as synchronized, the lock will be on the class not on object.
 * Problem without static synchronization
 * Suppose there are two objects of a shared class(e.g. Table) named object1 and object2.In case of synchronized
 * method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both
 * refers to a common object that have a single lock.But there can be interference between t1 and t3 or t2 and t4
 * because t1 acquires another lock and t3 acquires another lock.I want no interference between t1 and t3 or t2 and
 * t4.Static synchronization solves this problem.
 *
 * Synchronized block on a class lock:
 * The block synchronizes on the lock of the object denoted by the reference .class name .class. A static
 * synchronized method printTable(int n) in class Table is equivalent to the following declaration:
 *
 * static void printTable(int n) {
 * synchronized (StaticSyncTable.class) {       // Synchronized block on class A
 * // ...
 * }
 * }
 */
public class StaticSyncExmpl {
    public static void main(String[] args) {
        StaticSyncThread1 t1 = new StaticSyncThread1();
        StaticSyncThread2 t2 = new StaticSyncThread2();
        StaticSyncThread3 t3 = new StaticSyncThread3();
        StaticSyncThread4 t4 = new StaticSyncThread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
