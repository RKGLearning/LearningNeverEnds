package com.copart.oops.abstraction.interfaceEx.defaultMthd;

public interface Drawable {
    void draw();
    default void msg() {
        System.out.println("Drawable Interface");
    }
}
