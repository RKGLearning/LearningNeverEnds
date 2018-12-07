package com.copart.threads.ThreadGroup;

/**
 * Java provides a convenient way to group multiple threads in a single object. In such way, we can suspend, resume
 * or interrupt group of threads by a single method call.
 * Note: Now suspend(), resume() and stop() methods are deprecated.
 *
 * Java thread group is implemented by java.lang.ThreadGroup class.
 *
 * Constructors of ThreadGroup class
 * There are only two constructors of ThreadGroup class.
 *
 * No.	Constructor	Description
 * 1)	ThreadGroup(String name)	creates a thread group with given name.
 * 2)	ThreadGroup(ThreadGroup parent, String name)	creates a thread group with given parent group and name.
 *
 *
 * Important methods of ThreadGroup class
 * There are many methods in ThreadGroup class. A list of important methods are given below.
 *
 *
 * No.	Method	Description
 * 1)	int activeCount()	returns no. of threads running in current group.
 * 2)	int activeGroupCount()	returns a no. of active group in this thread group.
 * 3)	void destroy()	destroys this thread group and all its sub groups.
 * 4)	String getName()	returns the name of this group.
 * 5)	ThreadGroup getParent()	returns the parent of this group.
 * 6)	void interrupt()	interrupts all threads of this group.
 * 7)	void list()	prints information of this group to standard console.
 *
 *
 * Let's see a code to group multiple threads.
 *
 * ThreadGroup tg1 = new ThreadGroup("Group A");
 * Thread t1 = new Thread(tg1,new MyRunnable(),"one");
 * Thread t2 = new Thread(tg1,new MyRunnable(),"two");
 * Thread t3 = new Thread(tg1,new MyRunnable(),"three");
 *
 * Now all 3 threads belong to one group. Here, tg1 is the thread group name, MyRunnable is the class that implements
 * Runnable interface and "one", "two" and "three" are the thread names.
 *
 * Now we can interrupt all threads by a single line of code only.
 *
 * Thread.currentThread().getThreadGroup().interrupt();
 */
public class ThreadGroupDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, runnable, "one");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "two");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "three");
        t3.start();

        System.out.println("Thread Group Name: " + tg1.getName());

        tg1.list();

    }
}
