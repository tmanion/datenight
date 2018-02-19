package com.manion.datenight.domain;

import javax.persistence.*;

@Entity public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    @ManyToOne
    private DateEvent dateEvent;

    public Location(String address, DateEvent dateEvent) {
        this.address = address;
        this.dateEvent = dateEvent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DateEvent getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(DateEvent dateEvent) {
        this.dateEvent = dateEvent;
    }
}
