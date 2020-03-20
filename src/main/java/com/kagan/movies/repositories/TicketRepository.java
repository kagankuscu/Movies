package com.kagan.movies.repositories;

import com.kagan.movies.models.Ticket;

import org.springframework.data.repository.CrudRepository;

/**
 * TicketRepostory
 */
public interface TicketRepository extends CrudRepository<Ticket, Long> {

}