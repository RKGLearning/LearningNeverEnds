package com.copart.oops.Association.Aggregation.Example1;

public class Circle {
    Operation operation; //Aggregation
    double pi = 3.14;

    double area(int radius) {
        operation = new Operation();
        int rsquare = operation.square(radius);//Code reusability (i.e. delegates the method call).
        return pi*rsquare;
    }
}
