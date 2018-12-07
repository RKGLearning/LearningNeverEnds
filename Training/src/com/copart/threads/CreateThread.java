package com.copart.threads;

public class CreateThread extends Thread{

    public void run() {
        System.out.println("Thread is Running ....");
    }

    public static void main(String args[]) {

        CreateThread createThread = new CreateThread();
        createThread.start();
    }
}
