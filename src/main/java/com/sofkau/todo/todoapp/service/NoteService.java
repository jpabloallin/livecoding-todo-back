package com.sofkau.todo.todoapp.service;

import com.sofkau.todo.todoapp.dto.NoteDto;

public interface NoteService {

    NoteDto createNote(NoteDto noteDto);

    NoteDto updateNote(NoteDto noteDto);

    void deleteNote(Long id);
}
