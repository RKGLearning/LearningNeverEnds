package com.copart.threads.ShutdownHook;

/**
 * The shutdown hook can be used to perform cleanup resource or save the state when JVM shuts down normally or
 * abruptly. Performing clean resource means closing log file, sending some alerts or something else. So if you want
 * to execute some code before JVM shuts down, use shutdown hook.
 *
 * When does the JVM shut down?
 * The JVM shuts down when:
 * user presses ctrl+c on the command prompt
 * System.exit(int) method is invoked
 * user logoff
 * user shutdown etc
 * The addShutdownHook(Thread hook) method
 * The addShutdownHook() method of Runtime class is used to register the thread with the Virtual Machine. Syntax:
 *
 * public void addShutdownHook(Thread hook){}
 *
 * The object of Runtime class can be obtained by calling the static factory method getRuntime(). For example:
 *
 * Runtime r = Runtime.getRuntime();
 *
 * Factory method
 * The method that returns the instance of a class is known as factory method.
 */

public class SDHexample extends Thread {
    public void run() {
        System.out.println("Shut down hook task completed");
    }
    public static void main(String [] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new SDHexample());

        System.out.println("Now rakesh.practice.programs.master.training.Main is Sleeping , press ctrl+c to exit...");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
