package com.airport.serviceInterface;

import java.util.List;

import com.airport.model.Ticket;

public interface TicketInterface {

	public List<Ticket> findTicketByFlightNo(String flightNo);
	public Ticket saveTicket(Ticket ticket);
	public List<Ticket> findTicketByTcKimlikNo(String tcKimlikNo);
	public void deleteTicket(int id);
}
