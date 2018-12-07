package com.copart.oops.Association.example1;

public class Driver extends Car {

    public String driverName;
    Driver(String name, String carName, int carId) {
        super(carName,carId);
        this.driverName = name;
    }

}
