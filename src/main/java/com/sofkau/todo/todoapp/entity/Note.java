package com.sofkau.todo.todoapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Note")
@Table(name= "note")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String message;

    private boolean done;

    private String hashtag;

    private Long categoryId;

}
