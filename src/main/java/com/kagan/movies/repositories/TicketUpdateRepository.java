package com.kagan.movies.repositories;

import com.kagan.movies.models.TicketUpdate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketUpdateRepository extends JpaRepository<TicketUpdate, Long>{

}