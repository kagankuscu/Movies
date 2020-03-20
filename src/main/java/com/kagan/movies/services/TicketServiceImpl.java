package com.kagan.movies.services;

import java.util.List;

import com.kagan.movies.models.Ticket;
import com.kagan.movies.repositories.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TicketServiceImpl
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepostory;

    public TicketServiceImpl(TicketRepository ticketRepostory) {
        this.ticketRepostory = ticketRepostory;
    }

    @Override
    public List<Ticket> listTicket() {
        return (List<Ticket>) ticketRepostory.findAll();
    }

    @Override
    public List<Ticket> getTicketById(int number) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String add(Ticket ticket) {
        // TODO Auto-generated method stub
        return "ok";
    }

    @Override
    public void save() {
        // TODO Auto-generated method stub

    }

    @Override
    public String delete(int number) {
        // TODO Auto-generated method stub
        return null;
    }

}