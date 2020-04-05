package com.kagan.movies.services;

import java.util.List;

import com.kagan.movies.models.Ticket;

/**
 * TicketService
 */
public interface TicketService {

    List<Ticket> listTicket();
    Ticket getTicketById(Long id);
    Ticket add(Ticket ticket);
    void save();
    String delete(int number);
}