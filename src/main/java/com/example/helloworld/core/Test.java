package com.example.helloworld.core;

/**
 * Created by syuan on 4/13/14.
 */
public class Test {

    public static void main(String[] args){
        TodoDAOImpl todoDAOImpl=new TodoDAOImpl();
        TodoModel todo=todoDAOImpl.getTodoModel(2);
        System.out.println(todo.getName());

    }
}
