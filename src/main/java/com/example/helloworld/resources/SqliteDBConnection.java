package com.example.helloworld.resources;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by syuan on 4/13/14.
 */

public class SqliteDBConnection
{
    public  static Connection getConnection(){

        Connection connection = null;

        try
        {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:test.sqlite");
            if(connection!=null){
                System.out.println("DB connect sucessfully");
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return connection;
    }

}