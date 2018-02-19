package com.manion.datenight.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity public class DateEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    @OneToMany(
        cascade = CascadeType.ALL,
        mappedBy = "dateEvent"
    )
    private Set<Note> notes = new HashSet<>();
    @OneToOne
    private Location location;

    public DateEvent(String title, String description, Set<Note> notes, Location location) {
        this.title = title;
        this.description = description;
        this.notes = notes;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }
}
