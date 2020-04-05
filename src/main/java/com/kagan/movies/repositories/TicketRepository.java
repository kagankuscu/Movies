package com.kagan.movies.repositories;

import com.kagan.movies.models.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TicketRepostory
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}