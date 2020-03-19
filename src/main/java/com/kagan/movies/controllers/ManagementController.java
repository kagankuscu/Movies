package com.kagan.movies.controllers;

import com.kagan.movies.services.TicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * ManagementController
 */
@Controller
@RequestMapping("management")
public class ManagementController {
    
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public String getMethodName(Model model) {
        model.addAttribute("tickets", ticketService.listTicket());
        return "management";
    }
    
    @GetMapping("get")
    public String getTicketById(Model model) {
        return "404";
        // return "edit";
    }

    @GetMapping("add")
    public String add(Model model) {
        return "redirect:edit";
    }

    @GetMapping("save")
    public String save(Model model) {
        return "redirect:management";
    }

    @GetMapping("delete")
    public String delete(Model model) {
        return "redirect:management";
    }
    
}