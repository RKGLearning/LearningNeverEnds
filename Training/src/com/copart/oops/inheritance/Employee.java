package com.copart.oops.inheritance;

import java.util.ArrayList;
import java.util.List;

/* Inheritance : When one object acquires all the properties and behaviours of parent object known
as inheritance.
The Idea behind inheriatnce in java is that you can create new classes that are built upon existing classes.
When you inherit from an existing class, you can reuse methods and field of parent class, and you can add
new methods and field also.
Inheritance represents the IS-A relationship, also known as parent-child relationship.

Why use Inheritance in Java :
1. For method overriding (So runtime polymorphism can be achieved).
2. For Code Reusability.

Types of Inheritance is :

1. Single    ClassA<---ClassB
2. Multilevel   ClassA<---ClassB<---ClassC
3.Hierarchical   ClassA<---ClassB      ClassA<--- ClassC

Note: Multiple inheritance is not supported in java through class.

ClassA<--- ClassC
ClassA<--- ClassB
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B and C are three classes. The C class inherits A and B classes. If A and B classes have
 same method and you call it from child class object, there will be ambiguity to call method of A or B class.

Since compile time errors are better than runtime errors, java renders compile time error if you inherit 2 classes.
So whether you have same method or different, there will be compile time error now.
 */
public class Employee {
    float salary = 40000;

    public static void main(String [] args) {
         List<String> testList = new ArrayList<String>();
         testList = null;
         System.out.println(testList.isEmpty());
        testList.isEmpty();
    }

}
