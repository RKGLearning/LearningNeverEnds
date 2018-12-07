package com.copart.threads.synchronization;

public class MyThread extends Thread {
    Table table;
    MyThread(Table table) {
        this.table = table;
    }
    public void run() {
        table.printTable(5);
    }
}
