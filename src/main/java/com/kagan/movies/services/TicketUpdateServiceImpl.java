package com.kagan.movies.services;

import java.util.List;

import com.kagan.movies.models.TicketUpdate;
import com.kagan.movies.repositories.TicketUpdateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketUpdateServiceImpl implements TicketUpdateService {

    @Autowired
    private TicketUpdateRepository ticketUpdateRepository;

    public TicketUpdateServiceImpl(TicketUpdateRepository ticketUpdateRepository) {
        this.ticketUpdateRepository = ticketUpdateRepository;
    }

    @Override
    public List<TicketUpdate> listTicket() {
        return ticketUpdateRepository.findAll();
    }

    @Override
    public TicketUpdate getTicketById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TicketUpdate save(TicketUpdate ticketUpdate) {
        return ticketUpdateRepository.save(ticketUpdate);
    }

    @Override
    public String delete(TicketUpdate ticketUpdate) {
        ticketUpdateRepository.delete(ticketUpdate);
        return "Comment deleted!";
    }
}