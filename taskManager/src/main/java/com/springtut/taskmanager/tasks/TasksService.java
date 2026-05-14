package com.springtut.taskmanager.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksService {
    private TasksRepository tasksRepository;

    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    List<TaskEntity> getAllTasks() {
        return tasksRepository.findAll();
    }

    TaskEntity addNewTask(String taskName) {
        TaskEntity task = new TaskEntity(taskName);
        return tasksRepository.save(task);
    }

    TaskEntity getTaskById(Long id) {
        return tasksRepository.findById(id).orElse(null);
    }

    Boolean deleteTaskById(Long id) {
        if (tasksRepository.existsById(id)) {
            tasksRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
