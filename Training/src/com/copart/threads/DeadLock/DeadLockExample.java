package com.copart.threads.DeadLock;

/**
 * Deadlock in java is a part of multithreading. Deadlock can occur in a situation when a thread is waiting for an
 * object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired
 * by first thread. Since, both threads are waiting for each other to release the lock, the condition is called
 * deadlock.
 */
public class DeadLockExample {
    public static void main(String[] args) {
        final String resource1 = "Andy's Thread";
        final String resource2 = "Sameera's Thread";
        Thread t1 = new Thread() {
            public void run(){
                synchronized (resource1) {
                    System.out.println("Thread 1 : resource1 locked");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {}
                    synchronized (resource2) {
                        System.out.println("Thread 1: resource2 locked");
                    }
                }
            }
        };

        /** Thread T2 is trying to lock the resource2 then resource1 **/
        Thread t2 = new Thread() {
          public void run() {
              synchronized (resource2) {
                  System.out.println("Thread2: Locked resource2");
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException ex) {}
                  synchronized (resource1) {
                      System.out.println("Thread2: locked resource1");
                  }
              }
          }
        };
        t1.start();
        t2.start();
    }
}
