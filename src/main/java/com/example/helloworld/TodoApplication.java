package com.example.helloworld;

import com.example.helloworld.resources.TodoResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;



/**
 * Created by syuan on 4/13/14.
 */
public class TodoApplication extends Application<TodoConfiguration> {

    public static void main(String[] args) throws Exception {

        new TodoApplication().run(args);
    }

    @Override
    public String getName() {
        return "todo";
    }    //应用的名称，地址栏就是输这个名称确定应用



    @Override
    public void initialize(Bootstrap<TodoConfiguration> bootstrap) {  //引导协议

    }


    @Override
    public void run(TodoConfiguration configuration, Environment environment) {
        final TodoResource resource = new TodoResource();


    }
}
