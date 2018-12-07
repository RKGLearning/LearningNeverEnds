package com.copart.oops.abstraction.example3;

public abstract class Bike {
    Bike() {
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear() {
        System.out.println("gear changed");
    }
}
