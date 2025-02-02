package com.rest.webservices.restfulwebservices.todo;

import com.rest.webservices.restfulwebservices.todo.repository.TodoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoJapResource {

    private TodoService todoService;

    private TodoRepository todoRepository;

    public TodoJapResource(TodoService todoService, TodoRepository todoRepository){
        this.todoService = todoService;
        this.todoRepository = todoRepository;
    }

    @GetMapping("/users/{username}/todos")
    public List<Todo> retriveTodos(@PathVariable String username){

        return todoRepository.findByUsername(username);
    }

    @GetMapping("/users/{username}/todos/{id}")
    public Todo retriveTodo(@PathVariable String username, @PathVariable int id){

        return todoRepository.findById(id).get();
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodos(@PathVariable String username, @PathVariable int id){

        todoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/users/{username}/todos/{id}")
    public Todo updateTodo(@PathVariable String username, @PathVariable int id, @RequestBody Todo todo){

        todoRepository.save(todo);
        return todo;

    }

    @PostMapping("/users/{username}/todos")
    public Todo createNewTodo(@PathVariable String username, @RequestBody Todo todo){

        todo.setUsername(username);
        todo.setId(null);
        return todoRepository.save(todo);
    }
}
