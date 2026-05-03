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

}
