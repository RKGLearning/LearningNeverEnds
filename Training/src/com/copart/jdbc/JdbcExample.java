package com.copart.jdbc;

/**
 * Java JDBC is a java API to connect and execute query with the database. JDBC API uses jdbc drivers to connect with
 * the database.
 *
 *
 * ---------
 * ----------          --------------          ---------------      |---------|
 * |        |          |            |          |             |      |         |
 * |JDBC API|<---------| Java App   |--------->|JDBC Driver  |----->| DB      |
 * |        |          |            |          |             |      |         |
 * ----------          --------------          ---------------      |----------
 * Before JDBC, ODBC API was the database API to connect and execute query with the database. But, ODBC API uses ODBC
 * driver which is written in C language (i.e. platform dependent and unsecured). That is why Java has defined its
 * own API (JDBC API) that uses JDBC drivers (written in Java language).
 *
 *
 * How to connect Java application with Oracle and Mysql database using JDBC?
 * What is the difference between Statement and PreparedStatement interface?
 * How to print total numbers of tables and views of a database using JDBC ?
 * How to store and retrieve images from Oracle database using JDBC?
 * How to store and retrieve files from Oracle database using JDBC?
 *
 * What is API
 * API (Application programming interface) is a document that contains description of all the features of a product
 * or software. It represents classes and interfaces that software programs can follow to communicate with each other
 * . An API can be created for applications, libraries, operating systems, etc
 *
 * *************** JDBC Driver *******************************
 * JDBC Driver is a software component that enables java application to interact with the database.There are 4 types
 * of JDBC drivers:
 * JDBC-ODBC bridge driver
 * Native-API driver (partially java driver)
 * Network Protocol driver (fully java driver)
 * Thin driver (fully java driver)
 *
 * 1) JDBC-ODBC bridge driver
 * The JDBC-ODBC bridge driver uses ODBC driver to connect to the database. The JDBC-ODBC bridge driver converts JDBC
 * method calls into the ODBC function calls. This is now discouraged because of thin driver.
 *
 * JDBC API <--- Java App ---->JDBC-ODBC bridge driver--->ODBC Driver---->Vendor DataBase Library---->DataBase
 *
 * Advantages:
 * easy to use.
 * can be easily connected to any database.
 * Disadvantages:
 * Performance degraded because JDBC method call is converted into the ODBC function calls.
 * The ODBC driver needs to be installed on the client machine.
 *
 * 2) Native-API driver
 * The Native API driver uses the client-side libraries of the database. The driver converts JDBC method calls into
 * native calls of the database API. It is not written entirely in java.
 *
 * JDBC API <---- Java App ---->Native API Driver---->Vendor Database Library-----> Database
 * Advantage:
 * performance upgraded than JDBC-ODBC bridge driver.
 * Disadvantage:
 * The Native driver needs to be installed on the each client machine.
 * The Vendor client library needs to be installed on client machine.
 *
 * 3) Network Protocol driver
 * The Network Protocol driver uses middleware (application server) that converts JDBC calls directly or indirectly
 * into the vendor-specific database protocol. It is fully written in java.
 *
 * JDBC API <---- java app ---->Network Protocol Driver --->Middleware ---> DataBase
 *
 * Advantage:
 * No client side library is required because of application server that can perform many tasks like auditing, load
 * balancing, logging etc.
 * Disadvantages:
 * Network support is required on client machine.
 * Requires database-specific coding to be done in the middle tier.
 * Maintenance of Network Protocol driver becomes costly because it requires database-specific coding to be done in
 * the middle tier.
 *
 * 4) Thin driver
 * The thin driver converts JDBC calls directly into the vendor-specific database protocol. That is why it is known
 * as thin driver. It is fully written in Java language.
 *
 * JDBC API <---- java app ---->Thin Driver ---> DataBase
 * Advantage:
 * Better performance than all other drivers.
 * No software is required at client side or server side.
 * Disadvantage:
 * Drivers depends on the Database.
 *
 * 5 Steps to connect to the database in java
 *
 * There are 5 steps to connect any java application with the database in java using JDBC. They are as follows:
 * Register the driver class
 * Creating connection
 * Creating statement
 * Executing queries
 * Closing connection
 *
 * 1) Register the driver class
 * The forName() method of Class class is used to register the driver class. This method is used to dynamically load
 * the driver class.
 * Syntax of forName() method
 * public static void forName(String className)throws ClassNotFoundException
 * Example to register the OracleDriver class
 * Class.forName("oracle.jdbc.driver.OracleDriver");
 *
 * 2) Create the connection object
 * The getConnection() method of DriverManager class is used to establish connection with the database.
 * Syntax of getConnection() method
 * 1) public static Connection getConnection(String url)throws SQLException
 * 2) public static Connection getConnection(String url,String name,String password)
 * throws SQLException
 * Example to establish connection with the Oracle database
 * Connection con=DriverManager.getConnection(
 * "jdbc:oracle:thin:@localhost:1521:xe","system","password");
 *
 * 3) Create the Statement object
 * The createStatement() method of Connection interface is used to create statement. The object of statement is
 * responsible to execute queries with the database.
 * Syntax of createStatement() method
 * public Statement createStatement()throws SQLException
 * Example to create the statement object
 * Statement stmt=con.createStatement();
 *
 * 4) Execute the query
 * The executeQuery() method of Statement interface is used to execute queries to the database. This method returns
 * the object of ResultSet that can be used to get all the records of a table.
 * Syntax of executeQuery() method
 * public ResultSet executeQuery(String sql)throws SQLException
 * Example to execute query
 * ResultSet rs=stmt.executeQuery("select * from emp");
 *
 * while(rs.next()){
 * System.out.println(rs.getInt(1)+" "+rs.getString(2));
 * }
 *
 * 5) Close the connection object
 * By closing connection object statement and ResultSet will be closed automatically. The close() method of
 * Connection interface is used to close the connection.
 * Syntax of close() method
 * public void close()throws SQLException
 * Example to close connection
 * con.close();
 *
 * Example to connect to the Oracle database in java
 * For connecting java application with the oracle database, you need to follow 5 steps to perform database
 * connectivity. In this example we are using Oracle10g as the database. So we need to know following information for
 * the oracle database:
 * Driver class: The driver class for the oracle database is oracle.jdbc.driver.OracleDriver.
 * Connection URL: The connection URL for the oracle10G database is jdbc:oracle:thin:@localhost:1521:xe where jdbc is
 * the API, oracle is the database, thin is the driver, localhost is the server name on which oracle is running, we
 * may also use IP address, 1521 is the port number and XE is the Oracle service name. You may get all these
 * information from the tnsnames.ora file.
 * Username: The default username for the oracle database is system.
 * Password: Password is given by the user at the time of installing the oracle database.
 *
 * Let's first create a table in oracle database.
 create table emp(id number(10),name varchar2(40),age number(3));


 */
public class JdbcExample {
}
