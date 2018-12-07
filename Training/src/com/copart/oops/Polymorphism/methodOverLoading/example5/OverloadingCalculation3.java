package com.copart.oops.Polymorphism.methodOverLoading.example5;

import javax.swing.plaf.synth.SynthTextAreaUI;

/* Example of Method Overloading with Type Promotion in case of ambiguity
 */
public class OverloadingCalculation3 {
    void sum (int a , long b) {
        System.out.println("First method invoked " + (a + b));
    }
    void sum (long a, int b) {
        System.out.println("Second method invoked " + a + b);
    }
}
