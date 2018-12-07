package com.copart.oops.Association.example1;

public class Test {
    public static void main(String [] args) {
        Driver driver = new Driver("Rakesh","BMW",535);
        System.out.println("Driver Details are : ");
        System.out.println("Driver Name : " + driver.driverName);
        System.out.println("Driving the Car : " + driver.carName);
        System.out.println("Car Model is : " + driver.carId + "Xi");
    }
}
