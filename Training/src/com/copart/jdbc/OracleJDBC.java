package com.copart.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleJDBC {

    public static void main(String[] args) {
        try {
            /*** Load The Driver Class ***/
            Class.forName("oracle.jdbc.driver.OracleDriver");

            /*** Create the connection object ***/
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "system", "oracle");
            /*** Create a statement object ****/
            Statement statement = conn.createStatement();

            /**** Execute the query ****/
            ResultSet resultSet = statement.executeQuery("select * from emp");
            /**** close the connection ****/
            conn.close();
        } catch (Exception ex) {
                System.out.println(ex.getMessage());
        }
    }
}
