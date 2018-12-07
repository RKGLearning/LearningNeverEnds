package com.copart.oops.Polymorphism.methodOverLoading.example4;
/*Example of Method Overloading with Type Promotion if matching found
*/
public class OverloadingCalculation2 {
    void sum(int a, int b) {
        System.out.println("int args method invoked " + (a + b)) ;
    }
    void sum (long a, long b) {
        System.out.println("long arg method invoked " + (a + b));
    }
}
