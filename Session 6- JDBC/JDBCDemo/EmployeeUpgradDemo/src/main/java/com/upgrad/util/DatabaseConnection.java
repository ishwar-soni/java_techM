package com.upgrad.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    // This class can be used to initialize the database connection
    public class DatabaseConnection {
        public static Connection initializeDatabase()
                throws SQLException, ClassNotFoundException
        {
            // Initialize all the information regarding
            // Database Connection
            String dbDriver = "oracle.jdbc.driver.OracleDriver";
            String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
            // Database name to access
            String dbName = "Demo_DB";
            String dbUsername = "SYSTEM";
            String dbPassword = "wanted007";

            Class.forName(dbDriver);
            Connection con = DriverManager.getConnection(dbURL + dbName,
                    dbUsername,
                    dbPassword);
            return con;
        }
    }

