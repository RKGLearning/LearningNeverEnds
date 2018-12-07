package com.copart.oops.abstraction.example4;

/*
The abstract class can also be used to provide some implementation of the interface. In such case, the end user may
not be forced to override all the methods of the interface.
 */
public class Test {
    public static void main(String [] args) {
        M m = new M();
        m.a();
        m.b();
        m.c();
        m.d();
    }
}
