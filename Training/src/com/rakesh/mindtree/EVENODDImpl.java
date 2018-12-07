package com.rakesh.mindtree;

class EVENODDImpl implements Runnable {
    int num;
    int temp = 0;
    Object lock = new Object();

    public EVENODDImpl( int num) {
        this.num = num;
    }

    public void run() {
        try {
            synchronized (lock) {
                while(temp<num) {
                    temp++;
                    System.out.println(Thread.currentThread().getName()+"   "+temp);
                    lock.notify();
                    lock.wait();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
