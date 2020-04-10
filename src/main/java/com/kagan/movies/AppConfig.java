package com.kagan.movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kagan.movies.models.Ticket;
import com.kagan.movies.services.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * AppConfig
 */
@Configuration
public class AppConfig {

    @Autowired
    TicketService service;

    @Bean
    public void setTicketTable() {
        Ticket ticket = new Ticket();
        ticket.setSubject("Viking");

        Ticket ticket1 = new Ticket();
        ticket1.setSubject("IT Crowd");

        Ticket ticket2 = new Ticket();
        ticket2.setSubject("hello");

        Ticket ticket3 = new Ticket();
        ticket3.setSubject("Elitebook");

        Ticket ticket4 = new Ticket();
        ticket4.setSubject("840");

        Ticket ticket5 = new Ticket();
        ticket5.setSubject("Morningstar");

        Ticket ticket6 = new Ticket();
        ticket6.setSubject("Wiz Khalifa");

        Ticket ticket7 = new Ticket();
        ticket7.setSubject("Lil Wayne");

        Ticket ticket8 = new Ticket();
        ticket8.setSubject("Heyo");

        Ticket ticket9 = new Ticket();
        ticket9.setSubject("Kush");

        List<Ticket> tickets = new ArrayList<>(Arrays.asList(ticket, ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9));

        service.saveAll(tickets);
    }
}