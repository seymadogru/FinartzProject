package com.airport.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.dao.TicketRepository;
import com.airport.model.Ticket;
import com.airport.serviceInterface.TicketInterface;

@Service
public class TicketServiceImpl implements TicketInterface{

	@Autowired
	private TicketRepository ticketRepository;

	

	@Override
	public Ticket saveTicket(Ticket ticket) {
		
		return ticketRepository.save(ticket);
	}



	@Override
	public List<Ticket> findTicketByFlightNo(String flightNo) {
		
		return ticketRepository.findTicketByFlightNo(flightNo);
	}



	@Override
	public List<Ticket> findTicketByTcKimlikNo(String tcKimlikNo) {
		
		return ticketRepository.findTicketByTcKimlikNo(tcKimlikNo);
	}



	@Override
	public void deleteTicket(int id) {
		ticketRepository.deleteById(id);
		
	}



	
	
	
}
