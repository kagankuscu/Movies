package com.kagan.movies.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * TicketUpdate
 */
@Entity
public class TicketUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "number")
    private Ticket number;

    @Column(length = 2000)
    private String Comment;

    public Ticket getNumber() {
        return number;
    }

    public void setNumber(Ticket number) {
        this.number = number;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }    
}