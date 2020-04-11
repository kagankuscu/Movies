package com.kagan.movies.controllers;

import com.kagan.movies.models.Ticket;
import com.kagan.movies.services.TicketService;
import com.kagan.movies.services.TicketUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

    @GetMapping("/{id}")
    public String  deleteById(@PathVariable("id") long id, Model model) {
        Ticket ticket = ticketService.getTicketById(id);
        model.addAttribute("comments", ticketUpdateService.listTicket());

        return "deleteComment";
    }
}