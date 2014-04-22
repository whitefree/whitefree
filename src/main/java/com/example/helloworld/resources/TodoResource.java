package com.example.helloworld.resources;

import com.example.helloworld.core.TodoSaying;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

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
    public void addTodo(Request request) {
        System.out.println(request.getMethod());
        System.out.println("I got an post message!!!");
    }
}
