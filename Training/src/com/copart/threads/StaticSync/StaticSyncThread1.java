package com.copart.threads.StaticSync;

public class StaticSyncThread1 extends Thread {
    public void run() {
        StaticSyncTable.printTable(1);
    }
}
