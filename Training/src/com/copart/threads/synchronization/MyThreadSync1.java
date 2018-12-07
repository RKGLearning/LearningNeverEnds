package com.copart.threads.synchronization;

public class MyThreadSync1 extends Thread {
    SyncTable table;
    MyThreadSync1(SyncTable table) {
        this.table = table;
    }
    public void run() {
        table.printTable(100);
    }
}
