package com.copart.threads.synchronization;

public class MyThreadSync extends Thread {
    SyncTable table;
    MyThreadSync(SyncTable table) {
        this.table = table;
    }
    public void run() {
        table.printTable(5);
    }
}
