package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.Ticket;

public interface TicketInterface {

	public List<Ticket> findTicketById(Integer id);
	public Ticket saveTicket(Ticket ticket);
	public void deleteTicket(int id);
}
