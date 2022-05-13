package com.sofkau.todo.todoapp.service;

import com.sofkau.todo.todoapp.dto.NoteDto;

public interface NoteService {

    NoteDto createNote(NoteDto noteDto);

    NoteDto updateNote(NoteDto noteDto);

    NoteDto createHashtag(NoteDto noteDto);

    void deleteNote(Long id);
}
