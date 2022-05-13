package com.sofkau.todo.todoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
public class NoteDto{
    private Long id;
    private String message;
    private boolean done;
    private String hashtag;
    private Long categoryId;
}
