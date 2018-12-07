package com.copart.threads.StaticSync;

public class StaticSyncThread2 extends Thread {
    public void run() {
        StaticSyncTable.printTable(10);
    }
}
