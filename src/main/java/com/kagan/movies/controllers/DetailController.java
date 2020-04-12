package com.kagan.movies.controllers;

import com.kagan.movies.services.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DetailController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/management/edit/{id}")
    public String seeDetail(Model model, @PathVariable("id") long id) {
        model.addAttribute("ticketDetails", ticketService.getTicketById(id));
        return "/edit";
    }
}