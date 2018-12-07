package com.copart.oops.Polymorphism.methodOverLoading.example3;
/* Example of Method Overloading with TypePromotion
*/
public class OverloadingCalculation {
    void sum(int a, long b) {
        System.out.println(a+b);
    }
    void sum(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}
