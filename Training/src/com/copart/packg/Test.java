package com.copart.packg;
/*
A java package is a group of similar types of classes , interfaces and sub packages.
package in java can be categorized in two form, buil-in package and user defined package.
there are many built-in packages such as java, lang, awt, javax, swing, net , io , util, sql etc.

ADVANTAGE OF JAVA PACKAGE:

1. java package is used to categorize the classes and interfaces so that they can be easily maintained.
2. java package provide access protection.
2. java package removes naming collision.
rakesh.practice.programs.master.training.Main  Sub
java.lang.System.class
Java.lang.String.class
java.util.ArraList.class
java.util.Map.class
java.awt.Button.class

How to access package from another package?
There are three ways to access the package from outside the package.

import package.*;
import package.classname;
fully qualified name.
1) Using packagename.*
If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.

The import keyword is used to make the classes and interface of another package accessible to the current package.

2) Using packagename.classname
If you import package.classname then only declared class of this package will be accessible.

3) Using fully qualified name
If you use fully qualified name then only declared class of this package will be accessible. Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface.

It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class
Note: If you import a package, subpackages will not be imported.

Subpackage in java
Package inside the package is called the subpackage. It should be created to categorize the package further.

Let's take an example, Sun Microsystem has definded a package named java that contains many classes like System, String, Reader, Writer, Socket etc. These classes represent a particular group e.g. Reader and Writer classes are for Input/Output operation, Socket and ServerSocket classes are for networking etc and so on. So, Sun has subcategorized the java package into subpackages such as lang, net, io etc. and put the Input/Output related classes in io package, Server and ServerSocket classes in net packages and so on.


 */
public class Test {
}
