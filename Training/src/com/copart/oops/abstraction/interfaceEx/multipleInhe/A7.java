package com.copart.oops.abstraction.interfaceEx.multipleInhe;

public class A7 implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Hello");
    }
    @Override
    public void show() {
        System.out.println("welcome...");
    }
}
