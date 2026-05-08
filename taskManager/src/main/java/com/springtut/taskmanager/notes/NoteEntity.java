package com.springtut.taskmanager.notes;

import com.springtut.taskmanager.tasks.TaskEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "notes")
public class NoteEntity {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(nullable = false)
    String body;

    @ManyToOne
    TaskEntity task;
}
