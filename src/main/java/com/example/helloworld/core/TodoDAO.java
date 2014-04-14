package com.example.helloworld.core;

/**
 * Created by syuan on 4/13/14.
 */
public interface TodoDAO {

    public TodoModel getTodoModel(int id);


    public boolean addTodoModel(String name);



}
