package com.notes.notes2024.example.stickynote.model.service;

import com.notes.notes2024.example.stickynote.model.StickyNote;
import com.notes.notes2024.example.stickynote.model.repository.StickyNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service  // This annotation marks the class as a Spring service component, which contains the business logic.
public class StickyNoteService {

    @Autowired  // This annotation automatically injects an instance of StickyNoteRepository into this service.
    private StickyNoteRepository repository;

    /**
     * Retrieves all sticky notes from the database.
     *
     * @return a list of all StickyNote objects from the database.
     */
    public List<StickyNote> getAllNotes() {
        return repository.findAll();  // Calls the repository method to fetch all sticky notes.
    }

    /**
     * Saves a sticky note to the database. If the sticky note has an ID, it will update the existing entry;
     * otherwise, it will create a new entry in the database.
     *
     * @param note the StickyNote object to be saved.
     * @return the saved StickyNote object, now with an ID if it was newly created.
     */
    public StickyNote saveNote(StickyNote note) {
        return repository.save(note);  // Saves or updates the sticky note in the database using the repository.
    }

    /**
     * Deletes a sticky note from the database based on its ID.
     *
     * @param id the ID of the StickyNote to be deleted.
     */
    public void deleteNoteById(Long id) {
        repository.deleteById(id);  // Deletes the sticky note with the specified ID using the repository.
    }

    /**
     * Retrieves a sticky note from the database by its ID.
     *
     * @param id the ID of the StickyNote to be retrieved.
     * @return the StickyNote object with the specified ID, or null if no such note exists.
     */
    public StickyNote getNoteById(Long id) {
        return repository.findById(id).orElse(null);  // Attempts to find the sticky note by ID, returning null if not found.
    }
}

