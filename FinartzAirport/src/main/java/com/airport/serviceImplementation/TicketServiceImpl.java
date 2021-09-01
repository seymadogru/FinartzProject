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
		String regex = "[^0-9]";
		
		ticket.getCreditCard().setCreditCardNo(ticket.getCreditCard().getCreditCardNo().replaceAll(regex, ""));
		String card = ticket.getCreditCard().getCreditCardNo();
		String cardFirstPart = card.substring(0, 6);
		String cardSecondPart = "******";
		String cardThirdPart = card.substring(12, 16);
		
//		int ticketCount = ticket.getFlight().getTicketList().size();
//		int capacity = ticket.getFlight().getCapacity();
//		double price = ticket.getFlight().getPrice();
//		int temp = (ticketCount/capacity);
//		ticket.setPrice(price*temp+price);
		ticket.getCreditCard().setCreditCardNo(cardFirstPart+cardSecondPart+cardThirdPart);		
		return ticketRepository.save(ticket);
	}



	//ticket id girilerek alınmıs bileti gorme
	@Override
	public List<Ticket> findTicketById(Integer id) {
		
		return ticketRepository.findTicketById(id);
	}



	
	//olusturulmus bileti silme
	@Override
	public void deleteTicket(int id) {
		ticketRepository.deleteById(id);
		
	}



	
	
	
}
