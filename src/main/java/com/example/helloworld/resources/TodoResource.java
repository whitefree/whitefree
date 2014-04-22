package com.example.helloworld.resources;

import com.codahale.metrics.annotation.Timed;
import com.example.helloworld.core.TodoSaying;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    private TodoSaying todoSaying;

    public TodoResource(TodoSaying todoSaying)
    {
        this.todoSaying = todoSaying;
    }


    @GET
    @Path("{id}")
    public String getTodo(@PathParam("id") int id) {
        System.out.printf("parameter="+id);
        return todoSaying.getTodo(id);
    }

    @POST
    public String addTodo(@QueryParam("name") String name) {
       return  todoSaying.addTodo(name);
    }



}
