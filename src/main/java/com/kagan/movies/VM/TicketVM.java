package com.kagan.movies.VM;

public class TicketVM {
    private final Long id;
    private final String subject;

    public TicketVM(Long id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }
}