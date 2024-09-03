package com.notes.notes2024.example.stickynote.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/**
 * Done By HBM huda bani mustafa
 */
@Entity  // Marks this class as a JPA entity, meaning it will be mapped to a database table.
public class StickyNote {

    @Id  // Specifies the primary key of the entity.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Indicates that the ID should be generated automatically by the database (auto-increment).
    private Long id;

    private String title;  // The title of the sticky note.
    private String content;  // The content or body of the sticky note.
    private String color;  // The color assigned to the sticky note, which can be used for categorization or emphasis.

    // Default constructor
    public StickyNote() {
    }

    // Parameterized constructor
    public StickyNote(String title, String content, String color) {
        this.title = title;
        this.content = content;
        this.color = color;
    }

    // Getters and Setters

    /**
     * Gets the ID of the sticky note.
     *
     * @return the ID of the sticky note.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the sticky note.
     *
     * @param id the ID to set for the sticky note.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the title of the sticky note.
     *
     * @return the title of the sticky note.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the sticky note.
     *
     * @param title the title to set for the sticky note.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the content of the sticky note.
     *
     * @return the content of the sticky note.
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content of the sticky note.
     *
     * @param content the content to set for the sticky note.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the color of the sticky note.
     *
     * @return the color of the sticky note.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the sticky note.
     *
     * @param color the color to set for the sticky note.
     */
    public void setColor(String color) {
        this.color = color;
    }
}
