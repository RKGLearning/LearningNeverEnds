package com.copart.oops.Association.diffAggreVSCompo;

/*
In case of aggregation, the Car also performs its functions through an Engine. but the Engine is not always an
internal part of the Car. An engine can be swapped out or even can be removed from the car. That’ why we make The
Engine type field non-final.
 */
public class Test {
    public static void main(String [] args) {
        // making an engine by creating
        // an instance of Engine class.
        Engine engine = new Engine();
        // Making a car with engine.
        // so we are passing a engine
        // instance as an argument while
        // creating instace of Car.
        Car car = new Car(engine);
        car.move();
    }
}
