package com.springtut.todolist.controllers;

import com.springtut.todolist.models.Task;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/tasks")
@RestController
public class TaskController {
    private ArrayList<Task> taskList = new ArrayList<>();

    @GetMapping("/")
    ResponseEntity<List<Task>> getAllTask() {
        return ResponseEntity.ok(taskList);
    }

    @PostMapping("/")
    ResponseEntity<Task> addTask(@RequestBody Task task) {
        Task taskToAdd = new Task(task.getName());
        taskList.add(taskToAdd);
        return ResponseEntity.status(201).body(taskToAdd);
    }
    /**
     * ASSIGNEMENT
     * 1. GET -> /tasks/3
     *              get task no 3
     *              Send 404 error to client if task no, 3 doesn't exist
     * 2. PATCH -> /tasks/3
     *              Update due date, or task staus for task no. 3
     *              Send 404 error to client if task 3 doesn't exist
     * 3. DELETE -> /tasks/3
     *              Delete task no. 3 (Response with correct http code)
     *              if task no. 5 doesn't exist send 404 error
     */
}
