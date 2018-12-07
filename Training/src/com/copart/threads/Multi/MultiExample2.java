package com.copart.threads.Multi;

/**
 * multiple tasks by multiple threads
 *
 */
public class MultiExample2 {
    public class process1 extends Thread {
        public void run(){
            System.out.println("Task 1 ");
        }
    }

    public class process2 extends Thread {
        public void run() {
            System.out.println("Task 2");
        }
    }


    public static void main(String[] args) {
        MultiExample2 multiExample2 = new MultiExample2();
        process1 t1 = multiExample2.new process1();
        process2 t2 = multiExample2.new process2();
        process1 t3 = multiExample2.new process1();

        t1.start();
        t2.start();
        t3.start();
    }
}
