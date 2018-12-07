package com.copart.threads.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Java Thread pool represents a group of worker threads that are waiting for the job and reuse many times.
 *
 * In case of thread pool, a group of fixed size threads are created. A thread from the thread pool is pulled out and
 * assigned a job by the service provider. After completion of the job, thread is contained in the thread pool again.
 *
 * Advantage of Java Thread Pool
 * Better performance It saves time because there is no need to create new thread.
 *
 * Real time usage
 * It is used in Servlet and JSP where container creates a thread pool to process the request.
 */
public class TpExample1 implements Runnable {

    private String message;
    public TpExample1(String message) {
        this.message = message;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage();// Call the process message that sleeps for 2 seconds

        System.out.println(Thread.currentThread().getName() + "(End)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {

        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i =0; i < 10; i++) {

            Runnable worker = new TpExample1(""+ i);

            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }
        System.out.println("Finished All Threads");
    }

}
