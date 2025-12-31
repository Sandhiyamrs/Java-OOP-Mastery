package com.example.oop.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionDemo {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "password"
            );
            System.out.println("Database Connected!");
            conn.close();
        } catch (Exception e) {
            System.out.println("Connection failed (expected if DB not set)");
        }
    }
}
