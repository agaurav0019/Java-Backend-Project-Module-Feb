package com.springtut.todolist.models;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Task {
    private String name;
    private LocalDate due;
    private Boolean done;

    /**
    * Create a task object with a given task String,
    * due date 5 days from now, and done is equal to false
    * @Params name
     */
    public Task(String name) {
        this(name, LocalDate.now().plusDays(5), false);
    }
}
