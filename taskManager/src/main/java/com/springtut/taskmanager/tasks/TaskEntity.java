package com.springtut.taskmanager.tasks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "tasks")
public class TaskEntity {
    @Id
    Integer id;
    String name;
    LocalDate dueDate;
    Boolean status;
}
