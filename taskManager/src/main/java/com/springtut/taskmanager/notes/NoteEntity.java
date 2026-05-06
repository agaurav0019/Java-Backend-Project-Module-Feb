package com.springtut.taskmanager.notes;

import com.springtut.taskmanager.tasks.TaskEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "notes")
public class NoteEntity {
    @Id
    Integer id;
    String body;

    @ManyToOne
    TaskEntity task;
}
