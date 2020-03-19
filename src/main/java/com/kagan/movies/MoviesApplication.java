package com.kagan.movies;

import com.kagan.movies.services.TicketService;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		TicketService ticketService = ctx.getBean("ticketService", TicketService.class);


		SpringApplication.run(MoviesApplication.class, args);
	}

}
