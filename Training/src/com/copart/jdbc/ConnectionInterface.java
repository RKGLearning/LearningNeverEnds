package com.copart.jdbc;

/***
 * Connection interface
 A Connection is the session between java application and database. The Connection interface is a factory of
 Statement, PreparedStatement, and DatabaseMetaData i.e. object of Connection can be used to get the object of
 Statement and DatabaseMetaData. The Connection interface provide many methods for transaction management like commit
 (), rollback() etc.

 By default, connection commits the changes after executing queries.
 Commonly used methods of Connection interface:
 1) public Statement createStatement(): creates a statement object that can be used to execute SQL queries.
 2) public Statement createStatement(int resultSetType,int resultSetConcurrency): Creates a Statement object that
 will generate ResultSet objects with the given type and concurrency.
 3) public void setAutoCommit(boolean status): is used to set the commit status.By default it is true.
 4) public void commit(): saves the changes made since the previous commit/rollback permanent.
 5) public void rollback(): Drops all changes made since the previous commit/rollback.
 6) public void close(): closes the connection and Releases a JDBC resources immediately.
 */
public class ConnectionInterface {
}
