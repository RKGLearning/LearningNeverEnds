package com.copart.oops.Polymorphism.methodOveriding.example2;

/*
Real example of Java Method Overriding
Consider a scenario, Bank is a class that provides functionality to get rate of interest. But, rate of interest
varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7% and 9% rate of interest.
 */
public class Test {
    public static void main(String [] args) {
        BOA boa = new BOA();
        CITI citi = new CITI();
        CAPITALONE capitalone = new CAPITALONE();
        System.out.println("BOA Interest : " + boa.getRateOfInterest());
        System.out.println("CITI Interest : " + citi.getRateOfInterest());
        System.out.println("Capital one Interest : " + capitalone.getRateOfInterest());
    }
}
