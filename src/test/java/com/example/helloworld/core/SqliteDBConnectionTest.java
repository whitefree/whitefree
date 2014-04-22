package com.example.helloworld.core;

/**
 * Created by syuan on 4/13/14.
 */
public class SqliteDBConnectionTest {

    public static void main(String[] args){
        TodoDAOImpl todoDAOImpl=new TodoDAOImpl();
        boolean flag=todoDAOImpl.addTodoModel("name");
        int id=todoDAOImpl.getMaxId();
        System.out.print(flag);


    }
}
