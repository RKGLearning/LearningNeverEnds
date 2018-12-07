package com.copart.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/***
 * Statement interface
 The Statement interface provides methods to execute queries with the database. The statement interface is a factory
 of ResultSet i.e. it provides factory method to get the object of ResultSet.

 Commonly used methods of Statement interface:
 The important methods of Statement interface are as follows:

 1) public ResultSet executeQuery(String sql): is used to execute SELECT query. It returns the object of ResultSet.
 2) public int executeUpdate(String sql): is used to execute specified query, it may be create, drop, insert, update,
 delete etc.
 3) public boolean execute(String sql): is used to execute queries that may return multiple results.
 4) public int[] executeBatch(): is used to execute batch of commands.
 */
public class StatementInterface {
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
            Statement stmt = con.createStatement();
            //stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");
            //int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");
            int result = stmt.executeUpdate("delete from emp765 where id=33");
            System.out.println(result + " records affected");
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
