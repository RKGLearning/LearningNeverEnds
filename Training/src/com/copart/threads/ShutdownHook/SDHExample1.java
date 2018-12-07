package com.copart.threads.ShutdownHook;

/**
 * Note: The shutdown sequence can be stopped by invoking the halt(int) method of Runtime class.
 *
 */
public class SDHExample1 extends Thread{
/*    public void run() {
        System.out.println("Shutdown hook is completed");
    }*/
    public static void main(String [] args) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new Thread(){
            public void run() {
                System.out.println("Shutdown hook is completed");
            }
        });

        System.out.println("Now rakesh.practice.programs.master.training.Main Sleeping please press ctrl+c to exit...");
        try {
            Thread.sleep(3000);
        } catch(InterruptedException ex) {

        }
    }
}
