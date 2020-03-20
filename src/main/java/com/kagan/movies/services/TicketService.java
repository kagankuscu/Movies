package com.kagan.movies.services;

import java.util.List;

import com.kagan.movies.models.Ticket;

/**
 * TicketService
 */
public interface TicketService {

    List<Ticket> listTicket();
    List<Ticket> getTicketById(int number);
    String add(Ticket ticket);
    void save();
    String delete(int number);
}