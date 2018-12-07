package com.copart.threads.InterThreadCommunication;

public class Customer {
    private int amount = 1000;
    synchronized void withDraw(int amount1) {
        System.out.println("Going to Withdraw...");
        if (amount<amount1) {
            System.out.println("Less Balance; Waiting for Deposit...");
            try{
                wait(10000);
            } catch (Exception ex) {}
        }
        this.amount = amount;
        System.out.println("Withdraw Completed !!");
    }
    synchronized void deposit(int amount1) {
        System.out.println("Going to Deposit...");
        this.amount+=amount1;
        System.out.println("Deposit completed!!");
        notify();
    }
}
