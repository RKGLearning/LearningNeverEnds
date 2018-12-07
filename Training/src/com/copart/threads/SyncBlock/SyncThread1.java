package com.copart.threads.SyncBlock;

public class SyncThread1 extends Thread {
    Table table;
    SyncThread1(Table table) {
        this.table=table;
    }
    public void run() {
            table.printTable(5);
    }
}
