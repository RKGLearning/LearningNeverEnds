package com.copart.oops.abstraction.interfaceEx.example2;

/*
In this example, Drawable interface has only one method. Its implementation is provided by Rectangle and Circle
classes. In real scenario, interface is defined by someone but implementation is provided by different implementation
 providers. And, it is used by someone else. The implementation part is hidden by the user which uses the interface.
 */
public class Test {
    public static void main(String [] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        Drawable c = new Circle();
        Drawable r = new Rectangle();
        c.draw();
        r.draw();
    }
}
