package com.example.helloworld.resources;

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
        return todoSaying.getTodo(id);
    }

    @POST
    public String addTodo() {
        String name="name2";
        return todoSaying.addTodo(name);
    }
}
