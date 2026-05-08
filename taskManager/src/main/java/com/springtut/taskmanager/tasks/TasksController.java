package com.springtut.taskmanager.tasks;

import com.springtut.taskmanager.Constants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping("/tasks")
@RestController
public class TasksController {
    private TasksService taskService;

    public TasksController(TasksService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("")
    ResponseEntity<List<TaskEntity>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping("")
    ResponseEntity<TaskEntity> createTask(@RequestBody CreateTaskRequestBody body) {
        TaskEntity savedTask = taskService.addNewTask(body.name);
        return ResponseEntity.created(URI.create(Constants.BASE_URL + "/tasks/" + savedTask.getId())).body(savedTask);
    }
}
