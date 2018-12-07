package com.copart.threads.StaticSync;

public class StaticSyncTable {
    public static void printTable(int n) {
        synchronized (StaticSyncTable.class) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
