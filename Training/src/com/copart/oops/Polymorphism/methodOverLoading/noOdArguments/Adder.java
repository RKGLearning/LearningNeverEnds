package com.copart.oops.Polymorphism.methodOverLoading.noOdArguments;

/** we are creating static methods so that we don't need to create instance for calling methods **/
public class Adder {
    static int add (int a,int b) {
        return a +b;
    }
     static int add (int a, int b, int c) {
        return  a + b + c;
    }
}
