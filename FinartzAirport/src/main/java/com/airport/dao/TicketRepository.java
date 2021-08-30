package com.airport.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer>{

	List<Ticket> findTicketByFlightNo(String flightNo);
	List<Ticket> findTicketByTcKimlikNo(String tcKimlikNo);
}
