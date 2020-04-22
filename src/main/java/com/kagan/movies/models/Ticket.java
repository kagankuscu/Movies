package com.kagan.movies.models;

import java.util.List;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;

/**
 * Ticket
 */
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToMany(cascade = ALL)
    @JoinColumn
    private List<TicketUpdate> commentNumber;

    @Column(length = 2000)
    private String subject;

    public Ticket() {
    }

    public Ticket(List<TicketUpdate> commentNumber, String subject) {
        this.commentNumber = commentNumber;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<TicketUpdate> getNumber() {
        return commentNumber;
    }

    public void setNumber(List<TicketUpdate> number) {
        this.commentNumber = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}