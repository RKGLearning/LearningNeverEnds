package com.copart.oops.Polymorphism.methodOverLoading.example4;

public class Test {
    public static void main(String [] args) {
        OverloadingCalculation2 overloadingCalculation2 = new OverloadingCalculation2();
        overloadingCalculation2.sum(10,20);//now int arg sum() methods get invoked
    }
}
