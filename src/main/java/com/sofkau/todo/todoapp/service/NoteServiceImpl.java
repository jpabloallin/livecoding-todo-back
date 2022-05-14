package com.sofkau.todo.todoapp.service;

import com.sofkau.todo.todoapp.dto.Mapper;
import com.sofkau.todo.todoapp.dto.NoteDto;
import com.sofkau.todo.todoapp.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private Mapper mapper;

    @Override
    public NoteDto createNote(NoteDto noteDto) {
        return mapper.fromEntityToNoteDto(noteRepository.save(mapper.fromNoteDtoToEntity(noteDto)));
    }

    @Override
    public NoteDto updateNote(NoteDto noteDto) {
        return mapper.fromEntityToNoteDto(noteRepository.save(mapper.fromNoteDtoToEntity(noteDto)));
    }

    @Override
    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
