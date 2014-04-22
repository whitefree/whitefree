package com.example.helloworld.resources;

import com.example.helloworld.core.TodoSaying;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by syuan on 4/22/14.
 */
public class TodoResourceTest {
    @Test
    public void testGetTodo() throws Exception {
        TodoSaying todoSaying = new TodoSaying();
        TodoResource todoResource = new TodoResource(todoSaying);
        assertThat(todoResource.getTodo(4), is("wangwu"));
    }

    @Test
    public void testAddTodo() throws Exception {
       TodoSaying todoSaying=new TodoSaying();
        TodoResource todoResource=new TodoResource(todoSaying);
    }
}
