package com.copart.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Connectivity with Access without DSN
 * There are two ways to connect java application with the access database.
 *
 * Without DSN (Data Source Name)
 * With DSN
 * Java is mostly used with Oracle, mysql, or DB2 database. So you can learn this topic only for knowledge.
 *
 * Example to Connect Java Application with access without DSN
 * In this example, we are going to connect the java program with the access database. In such case, we have created
 * the login table in the access database. There is only one column in the table named name. Let's get all the name
 * of the login table.
 */
public class AccessWithoutDSN {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String dataBase = "training.mdb";
        String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};" +
                "DBQ =" +
                " + database + ;" +
                "DriverID = 22;" +
                "READONLY = true ";
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection c = DriverManager.getConnection(url);
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("select * from login");
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
    }
}
