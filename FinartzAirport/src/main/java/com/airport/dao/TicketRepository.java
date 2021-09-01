package com.airport.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.airport.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer>{

	List<Ticket> findTicketById(Integer id);   //Uçuş no'suna göre o uçuştaki yolcular listelenecek
	List<Ticket> findTicketByTcKimlikNo(String tcKimlikNo);  //tc kimlik no'suna göre bilet görüntüleme
}
