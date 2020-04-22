package com.kagan.movies;

import com.kagan.movies.models.Ticket;
import com.kagan.movies.models.TicketUpdate;
import com.kagan.movies.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


/**
 * AppConfig
 */
@Configuration
public class AppConfig {

    @Autowired
    TicketService service;

    @Bean
    public void setTicketTable() {
        TicketUpdate ticketUpdate = new TicketUpdate("Amazing");
        TicketUpdate ticketUpdate1 = new TicketUpdate("Nice");
        TicketUpdate ticketUpdate2 = new TicketUpdate("I Love it.");
        TicketUpdate ticketUpdate3 = new TicketUpdate("Amazing Movie");
        TicketUpdate ticketUpdate4 = new TicketUpdate("Nice I like it.");
        TicketUpdate ticketUpdate5 = new TicketUpdate("Unbelievable");
        TicketUpdate ticketUpdate6 = new TicketUpdate("wow");
        TicketUpdate ticketUpdate7 = new TicketUpdate("I recommend it.");
        TicketUpdate ticketUpdate8 = new TicketUpdate("Everyone should watch it.");
        TicketUpdate ticketUpdate9 = new TicketUpdate("Fantastic");
        TicketUpdate ticketUpdate10 = new TicketUpdate("On my word");

        List<TicketUpdate> listTicketUpdate = asList(ticketUpdate, ticketUpdate1, ticketUpdate5);
        List<TicketUpdate> listTicketUpdate1 = asList(ticketUpdate4, ticketUpdate3, ticketUpdate2, ticketUpdate6);
        List<TicketUpdate> listTicketUpdate2 = asList(ticketUpdate7, ticketUpdate8, ticketUpdate9, ticketUpdate1);
        List<TicketUpdate> listTicketUpdate3 = asList(ticketUpdate10, ticketUpdate1);
        List<TicketUpdate> listTicketUpdate4 = asList(ticketUpdate2, ticketUpdate3);
        List<TicketUpdate> listTicketUpdate5 = asList(ticketUpdate1, ticketUpdate, ticketUpdate5);
        List<TicketUpdate> listTicketUpdate6 = asList(ticketUpdate10, ticketUpdate9, ticketUpdate8, ticketUpdate7, ticketUpdate3);
        List<TicketUpdate> listTicketUpdate7 = asList(ticketUpdate2, ticketUpdate4, ticketUpdate6, ticketUpdate7);
        List<TicketUpdate> listTicketUpdate8 = asList(ticketUpdate2, ticketUpdate1);
        List<TicketUpdate> listTicketUpdate9 = asList(ticketUpdate1, ticketUpdate, ticketUpdate10, ticketUpdate1, ticketUpdate4);

        Ticket ticket = new Ticket(listTicketUpdate, "Viking");
        Ticket ticket1 = new Ticket(listTicketUpdate1, "IT Crowd");
        Ticket ticket2 = new Ticket(listTicketUpdate2, "hello");
        Ticket ticket3 = new Ticket(listTicketUpdate3, "Elitebook");
        Ticket ticket4 = new Ticket(listTicketUpdate4, "840");
        Ticket ticket5 = new Ticket(listTicketUpdate5, "Morningstar");
        Ticket ticket6 = new Ticket(listTicketUpdate6, "Wiz Khalifa");
        Ticket ticket7 = new Ticket(listTicketUpdate7, "Lil Wayne");
        Ticket ticket8 = new Ticket(listTicketUpdate8, "Saniser");
        Ticket ticket9 = new Ticket(listTicketUpdate9, "Kush");

        List<Ticket> tickets = new ArrayList<>(asList(ticket, ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9));

        service.saveAll(tickets);
    }
}