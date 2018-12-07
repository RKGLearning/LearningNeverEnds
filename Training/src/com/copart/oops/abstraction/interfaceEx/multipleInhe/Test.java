package com.copart.oops.abstraction.interfaceEx.multipleInhe;

/*
If a class implements multiple interfaces or an interfaces extends multiple interfaces knows as multiple inheritance.

ClassA implemnts <---Interface A,B
Interface Extends <-- InterfaceA,B

Q) Multiple inheritance is not supported through class in java but it is possible by interface, why?
As we have explained in the inheritance chapter, multiple inheritance is not supported in case of class because of
ambiguity. But it is supported in case of interface because there is no ambiguity as implementation is provided by
the implementation class. For example:
 */
public class Test {
    public static void main(String[] args) {
        A7 a7 = new A7();
        a7.print();
        a7.show();
    }
}
