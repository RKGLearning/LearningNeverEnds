package com.copart.threads.SyncBlock;

public class SyncThread2 extends Thread{
    Table table;
    SyncThread2(Table table) {
        this.table=table;
    }
    public void run() {
            table.printTable(100);
    }
}
