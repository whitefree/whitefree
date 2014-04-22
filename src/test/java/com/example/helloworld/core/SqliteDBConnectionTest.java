package com.example.helloworld.core;

/**
 * Created by syuan on 4/13/14.
 */
public class SqliteDBConnectionTest {

    public static void main(String[] args){
        TodoDAOImpl todoDAOImpl=new TodoDAOImpl();
        String name=todoDAOImpl.getTodoModel(0);
        System.out.println(name);

    }
}
