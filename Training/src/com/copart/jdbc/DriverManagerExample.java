package com.copart.jdbc;

/***
 * The DriverManager class acts as an interface between user and drivers. It keeps track of the drivers that are
 * available and handles establishing a connection between a database and the appropriate driver. The DriverManager
 * class maintains a list of Driver classes that have registered themselves by calling the method DriverManager
 * .registerDriver().

 Useful methods of DriverManager class
 Method	Description
 1) public static void registerDriver(Driver driver):	is used to register the given driver with DriverManager.
 2) public static void deregisterDriver(Driver driver):	is used to deregister the given driver (drop the driver from
 the list) with DriverManager.
 3) public static Connection getConnection(String url):	is used to establish the connection with the specified url.
 4) public static Connection getConnection(String url,String userName,String password):	is used to establish the
 connection with the specified url, username and password.
 */
public class DriverManagerExample {
}
