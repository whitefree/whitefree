package com.example.helloworld.core;

/**
 * Created by syuan on 4/13/14.
 */
public class TodoModel {
    private int id;
    private String name;

    public TodoModel(){
        super();
    }

    public TodoModel(int id,String name){
        super();
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
