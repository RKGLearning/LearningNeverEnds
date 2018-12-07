package com.copart.oops.abstraction.interfaceEx;

/*
An interface in java is a blueprint of a class. it has static constants and abstract methods. The Interface in java
is a mechanism to achieve abstraction. there can be a only abstract methods in the java interface not method body. it
is used to achieve abstraction and multiple inheritance in java.
JAVA Interface also represents IS-A relationship.
It can not instantiate just like Abstract class.

WHY USE JAVA INTERFACE ?
1. It is used to achive abstraction.
2.By interface , we can support the functionality of multiple inheritance.
3. it can be used to achieve loose coupling.
JAVA 8 Interface can have default and static methods.

Internal ADDITION BY COMPILER:

The Java Compiler adds public and abstract keywords before the interface method. More, it adds public, static an
final keywords before data members.

in other words Interface fields are public, static and final by default, and methods are public and abstract.

Example :

interface Printable {
int min = 5;
void print();
}

After Compiler

interface Printable{
public static final int = 5;
public abstract void print()
}

UNDERSTANDING RELATIONSHIP BETWEEN CLASSES AND INTERFACES

As shown below , a class extends another class , an interface extends another interface but a class implements an
interface.
classA<--classB    (classA extends ClassB)
InterfaceA<---InterfaceB (interfaceA extends interfaceB)
classA<---InterfaceA (class A Implements InterfaceA)

Q) What is marker or tagged interface?
An interface that have no member is known as marker or tagged interface. For example: Serializable, Cloneable, Remote
 etc. They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
//How Serializable interface is written?
public interface Serializable{
}


Nested Interface in Java
Note: An interface can have another interface i.e. known as nested interface. We will learn it in detail in the
nested classes chapter. For example:

interface printable{
 void print();
 interface MessagePrintable{
   void msg();
 }
}
 */
public class Interfc {
}
