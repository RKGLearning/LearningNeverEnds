package com.copart.oops.Polymorphism.methodOverLoading.example3;

public class Test {
    public static void main(String [] args) {
        OverloadingCalculation overloadingCalculation = new OverloadingCalculation();
        overloadingCalculation.sum(1,6);
        overloadingCalculation.sum(1,3,3);
    }
}
