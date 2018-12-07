package com.copart.oops.abstraction.interfaceEx.statiMthdIn;

public interface Drawable {
    void draw();
    static int cube(int x) {
        return x*x*x;
    }
}
