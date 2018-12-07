package com.copart.threads.StaticSync;

public class StaticSyncThread4 extends Thread {
    public void run() {
        StaticSyncTable.printTable(1000);
    }
}
