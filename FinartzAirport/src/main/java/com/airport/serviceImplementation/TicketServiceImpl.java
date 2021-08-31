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

	

	//bilet kaydetme
	@Override
	public Ticket saveTicket(Ticket ticket) {
		
		return ticketRepository.save(ticket);
	}



	//uçuş no'su girilerek alınmış biletleri gösterme
	@Override
	public List<Ticket> findTicketByFlightNo(String flightNo) {
		
		return ticketRepository.findTicketByFlightNo(flightNo);
	}



	//tc kimlik no ile alınan bileti görüntüleme
	@Override
	public List<Ticket> findTicketByTcKimlikNo(String tcKimlikNo) {
		
		return ticketRepository.findTicketByTcKimlikNo(tcKimlikNo);
	}


	
	//oluşturulmuş bileti silme
	@Override
	public void deleteTicket(int id) {
		ticketRepository.deleteById(id);
		
	}



	
	
	
}
