package com.example.helloworld.resources;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqliteDBConnection
{
    public  static Connection getConnection(){

        Connection connection = null;

        try
        {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.sqlite");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return connection;
    }

}