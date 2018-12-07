package com.copart.oops.Polymorphism.methodOveriding;

/*
As you can see in the above example, the return type of the get() method of A class is A but the return type of the
get() method of B class is B. Both methods have different return type but it is method overriding. This is known as
covariant return type
 */
public class covariantReturnType {
    static class A{
        A get() {
            return this;
        }
    }
    static class B extends A {
        B get() {
            return this;
        }
        void message() {
            System.out.println("welcome to covriant return type");
        }
    }
    public static void main(String [] args) {
        new B().get().message();
    }
}
