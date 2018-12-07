package com.copart.oops.abstraction.interfaceEx.statiMthdIn;
/*
With Java 8 we can have static method in interface
 */
public class Test {
    public static void main(String [] args) {
        Drawable drawable = new Rectangle();
        drawable.draw();
        System.out.println("Cube is : " + Drawable.cube(3));
    }
}
