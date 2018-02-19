package com.manion.datenight.domain;

import javax.persistence.*;

@Entity public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String note;
    @ManyToOne
    private DateEvent dateEvent;

    public Note(String note, DateEvent dateEvent) {
        this.note = note;
        this.dateEvent = dateEvent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public DateEvent getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(DateEvent dateEvent) {
        this.dateEvent = dateEvent;
    }
}
