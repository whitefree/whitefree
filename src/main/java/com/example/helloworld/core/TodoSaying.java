package com.example.helloworld.core;

/**
 * Created by syuan on 4/13/14.
 */
public class TodoSaying {

    private TodoDAOImpl todoDAOImpl;

    public String getTodo(int id) {
        String message=null;
        TodoModel todoModel=todoDAOImpl.getTodoModel(id);
        message=todoModel.getName();
        return message;
    }


    public String addTodo(String name) {
        String message="insert failure";
        boolean flag=todoDAOImpl.addTodoModel(name);
        if (flag){
            message="insert success";
        }
        return message;
    }
}
