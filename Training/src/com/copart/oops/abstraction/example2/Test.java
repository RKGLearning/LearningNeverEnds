package com.copart.oops.abstraction.example2;

/*
In this example, Shape is the abstract class, its implementation is provided by the Rectangle and Circle classes.
Mostly, we don't know about the implementation class (i.e. hidden to the end user) and object of the implementation
class is provided by the factory method.

A factory method is the method that returns the instance of the class. We will learn about the factory method later.

In this example, if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.
 */
public class Test {
    public static void main(String [] args) {
        Shape shape1 = new Circle();
        shape1.draw();
        Shape shape2 = new Rectangle();
        shape2.draw();
    }
}
