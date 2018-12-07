package com.copart.jdbc;

/***
 * PreparedStatement interface
 The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.

 Let's see the example of parameterized query:

 String sql="insert into emp values(?,?,?)";
 As you can see, we are passing parameter (?) for the values. Its value will be set by calling the setter methods of
 PreparedStatement.

 Why use PreparedStatement?
 Improves performance: The performance of the application will be faster if you use PreparedStatement interface
 because query is compiled only once.

 How to get the instance of PreparedStatement?
 The prepareStatement() method of Connection interface is used to return the object of PreparedStatement. Syntax:

 public PreparedStatement prepareStatement(String query)throws SQLException{}
 Methods of PreparedStatement interface
 The important methods of PreparedStatement interface are given below:

 Method	Description
 public void setInt(int paramIndex, int value)	sets the integer value to the given parameter index.
 public void setString(int paramIndex, String value)	sets the String value to the given parameter index.
 public void setFloat(int paramIndex, float value)	sets the float value to the given parameter index.
 public void setDouble(int paramIndex, double value)	sets the double value to the given parameter index.
 public int executeUpdate()	executes the query. It is used for create, drop, insert, update, delete etc.
 public ResultSet executeQuery()	executes the select query. It returns an instance of ResultSet.
 Example of PreparedStatement interface that inserts the record
 First of all create table as given below:

 create table emp(id number(10),name varchar2(50));
 Now insert records in this table by the code given below:



 */
public class PreparedStatement {
}


