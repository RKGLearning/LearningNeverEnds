package com.copart.oops.abstraction;

/*
Abstraction : hiding internal details and showing the functionality is known as Abstraction.
example : phone call, we dont know the internal processing.
In java we use abstract class and interface to achieve abstraction.

Abstract Class : A class that is declared with abstract keyword, is known as abstract class in java. it can have
abstract and non-abstract methods (method with body).

Abstraction :

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way , it shows only important  things to the user and hides the internal details. for example sending sms,
you just type the text and send the message. you dont know the internal processing about the message delievery.

Abstraction lets you focus on what the object does instead of how it does it.

WAYS TO ACHIEVE ABSTRACTION:

1. Abstract class (0 to 100%)
2. Interface (100%)

Abstract class in Java : A class that is declared as abstract is known as abstract class. It needs to be extended and
 its method implemented. it cannot be instantiated.

 abstract class A{}

 Abstract Method : a method that is declared as abstract and does not have implementation is know as abstract method.

 abstract void printStatus(); //no body and abstract

 RULES :
 1. If there is any abstract method in a class, that class must be abstract.
 2. If you are extending any abstract class that have abstract method, you must either provide the implementation of
 the method or make this class abstract.


 Difference between abstract class and interface
Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract
 class and interface both can't be instantiated.

But there are many differences between abstract class and interface that are given below.

Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java
8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final
variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract
 class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) Example:
public abstract class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}
 */

public class Abstrction {
}
