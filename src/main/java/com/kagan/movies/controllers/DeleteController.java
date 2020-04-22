package com.kagan.movies.controllers;

import com.kagan.movies.models.Ticket;
import com.kagan.movies.services.TicketService;
import com.kagan.movies.services.TicketUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

//@Controller
@RestController
@RequestMapping("/management/delete")
public class DeleteController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private TicketUpdateService ticketUpdateService;

    @GetMapping
    public String deletePage(Model model) {
        model.addAttribute("tickets", ticketService.listTicket());
        return "delete";
    }

    @GetMapping(path = "/test")
    public List<Ticket> getAllActiveUser() {
        return ticketService.listTicket();
    }
}