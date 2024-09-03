package com.notes.notes2024.example.stickynote.model.repository;

import com.notes.notes2024.example.stickynote.model.StickyNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StickyNoteRepository extends JpaRepository<StickyNote, Long> {
}
