package com.upgrad.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    private static String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String jdbcUsername = "SYSTEM";
    private static String jdbcPassword = "wanted007";

    public static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void printSQLException(SQLException e){

    }
}
