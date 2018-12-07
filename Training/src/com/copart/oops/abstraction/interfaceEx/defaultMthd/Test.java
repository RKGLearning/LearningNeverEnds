package com.copart.oops.abstraction.interfaceEx.defaultMthd;
/*
Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:
 */
public class Test {
    public static void main(String [] args) {
        Drawable drawable = new Circle();
        drawable.draw();
        drawable.msg();
/*        Circle circle = new Circle();
        circle.draw();
        circle.msg();*/
    }
}
