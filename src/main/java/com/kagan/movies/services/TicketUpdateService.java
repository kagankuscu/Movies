package com.kagan.movies.services;

import java.util.List;

import com.kagan.movies.models.TicketUpdate;

public interface TicketUpdateService {
    
    List<TicketUpdate> listTicket();
    TicketUpdate getTicketById(Long id);
    TicketUpdate save(TicketUpdate ticketUpdate);
    String delete(TicketUpdate ticketUpdate);
}