package com.copart.threads.StaticSync;

public class StaticSyncThread3 extends Thread {
    public void run() {
        StaticSyncTable.printTable(100);
    }
}
