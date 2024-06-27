package com.codebyarunyadav.chatbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebyarunyadav.chatbox.entity.Ticket;
import com.codebyarunyadav.chatbox.repository.TicketRepository; 
@Service
public class TicketServiceImp implements TicketService {

	@Autowired
	TicketRepository ticketRepository;

	@Override
	public Ticket saveTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		System.out.print("Ticket data :"+ ticket.getId()+ticket.getName()+ticket.getCategory_id());
		ticketRepository.save(ticket);
		return null;
	}

	@Override
	public List<Ticket> fetchTicketList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket updateTicket(Ticket ticket, Long ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTicketById(Long TicketId) {
		// TODO Auto-generated method stub

	}

}
