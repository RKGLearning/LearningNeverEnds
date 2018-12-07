package com.copart.oops.abstraction.interfaceEx.IntefcInhrtnce;

public class TestInterface implements Showable {
    @Override
    public void show() {
        System.out.println("Child Interface");
    }
    @Override
    public void print() {
        System.out.println("Parent Interface");
    }
}
