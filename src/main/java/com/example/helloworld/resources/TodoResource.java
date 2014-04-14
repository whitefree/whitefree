package com.example.helloworld.resources;

import com.codahale.metrics.annotation.Timed;
import com.example.helloworld.core.TodoSaying;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * Created by syuan on 4/13/14.
 */

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    private TodoSaying todoSaying;


    @GET
    @Timed
    public String getTodo(@QueryParam("id") int id) {

        return todoSaying.getTodo(id);
    }

    @POST
    @Timed
    public String addTodo(@QueryParam("name") String name) {
       return  todoSaying.addTodo(name);
    }



}
