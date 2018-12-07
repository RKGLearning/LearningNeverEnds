package com.copart.jdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import java.sql.*;
/***
 * For connecting java application with the mysql database, you need to follow 5 steps to perform database connectivity.

 In this example we are using MySql as the database. So we need to know following informations for the mysql database:

 Driver class: The driver class for the mysql database is com.mysql.jdbc.Driver.
 Connection URL: The connection URL for the mysql database is jdbc:mysql://localhost:3306/sonoo where jdbc is the
 API, mysql is the database, localhost is the server name on which mysql is running, we may also use IP address, 3306
 is the port number and sonoo is the database name. We may use any database, in such case, you need to replace the
 sonoo with your database name.
 Username: The default username for the mysql database is root.
 Password: Password is given by the user at the time of installing the mysql database. In this example, we are going
 to use root as the password.
 Let's first create a table in the mysql database, but before creating table, we need to create database first.

 create database sonoo;
 use sonoo;
 create table emp(id int(10),name varchar(40),age int(3));
 */
public class MySqlDB {
    public static void main(String [] args) throws SQLException {
        try {
            /** Load The driver class***/
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            /*** Create the connection ****/
/*            java.sql.Connection
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root"
            );*/
            java.sql.Connection
                    connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test"
            );
            /*** Create Statement ****/
            Statement statement = connection.createStatement();

            /*** Execute the Query ****/
            ResultSet resultSet = statement.executeQuery("select * from Account_Config");
            System.out.println("UNIQUE_ID||ACCOUNT_NUMBER||ROUTING_NUMBER||LATEST_CHEQUE_NUMBER||ACCOUNT_DESC" +
                    "||ACCOUNT_STATUS" );
//            System.out.println();
            while (resultSet.next()) {
                String id = resultSet.getString("UNIQUE_ID");
                int accountNumber = resultSet.getInt("ACCOUNT_NUMBER");
                int routingNumber= resultSet.getInt("ROUTING_NUMBER");
                int lastChequeNumber = resultSet.getInt("LATEST_CHEQUE_NUMBER");
                String accountDesc = resultSet.getString("ACCOUNT_DESC");
                String accountStatus = resultSet.getString("ACCOUNT_STATUS");


                System.out.println(id +"||"+accountNumber + "||" + routingNumber + "||" + lastChequeNumber + "||" +
                        accountDesc + "||" + accountStatus
                );
            }
            /*** Close the connection ****/
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
