package com.copart.oops.Polymorphism.methodOveriding;

/*
if subclass (child class) has the same method as declared in the parent class, it is known as method overriding in
java. in other word, if subclass provides the specific implementation of the method that has been provided by one of
its parent class , it is known as method overriding.

USAGE OF JAVA METHOD OVERRIDING :

1. Method overiding is used to provide specific implementation of a method that is already provided by its super class.
2. method overriding is used for runtime polymorphism.

RULES FOR METHOD OVERRIDING:
1. method must have same name as the super class.
2. method must have same parameter as in the parent class.
3. must be IS-A relationship.


Can we override static method?
No, static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

Why we cannot override static method?
because static method is bound with class whereas instance method is bound with object. Static belongs to class area
and instance belongs to heap area.


Difference between method overloading and method overriding in java
There are many differences between method overloading and method overriding in java. A list of differences between
method overloading and method overriding are given below:

No.	Method Overloading	Method Overriding
1)	Method overloading is used to increase the readability of the program.
Method overriding is used to provide the
specific implementation of the method that is already provided by its super class.
2)	Method overloading is performed within class.
Method overriding occurs in two classes that have IS-A
(inheritance) relationship.
3)	In case of method overloading, parameter must be different.
In case of method overriding, parameter must be same.
4)	Method overloading is the example of compile time polymorphism.
Method overriding is the example of run time
polymorphism.
5)	In java, method overloading can't be performed by changing return type of the method only. Return type can be same
 or different in method overloading. But you must have to change the parameter.
 Return type must be same or covariant
 in method overriding.

 */
public class methodOverRiding {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}

