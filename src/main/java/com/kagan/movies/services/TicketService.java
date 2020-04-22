package com.kagan.movies.services;

import com.kagan.movies.models.Ticket;

import java.util.Collection;
import java.util.List;

/**
 * TicketService
 */
public interface TicketService {

    List<Ticket> listTicket();
    Ticket getTicketById(Long id);
    Ticket save(Ticket ticket);
    String delete(int number);
    List<Ticket> saveAll(List<Ticket> tickets);

    List<Ticket> findAllActiveUser();
}