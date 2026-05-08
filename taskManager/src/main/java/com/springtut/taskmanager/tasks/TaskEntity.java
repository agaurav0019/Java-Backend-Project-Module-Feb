package com.springtut.taskmanager.tasks;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "tasks")
public class TaskEntity {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    public TaskEntity(String name) {
        this.name = name;
        this.dueDate = LocalDate.now().plusDays(7);
        this.status = false;
    }

    @Column(nullable = false)
    String name;
    LocalDate dueDate;

    @Column(columnDefinition = "boolean default false")
    Boolean status;
}
