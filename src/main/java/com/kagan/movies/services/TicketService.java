package com.kagan.movies.services;

import java.util.List;

import com.kagan.movies.models.Ticket;

/**
 * TicketService
 */
public interface TicketService {

    List<Ticket> listTicket();
    Ticket getTicketById(Long id);
    Ticket save(Ticket ticket);
    String delete(int number);
}