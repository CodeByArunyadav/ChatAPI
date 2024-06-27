package com.codebyarunyadav.chatbox.service;

import java.util.List;

import com.codebyarunyadav.chatbox.entity.Ticket;


public interface TicketService {
	
	  // Save operation
    Ticket saveTicket(Ticket ticket);
 
    // Read operation
    List<Ticket> fetchTicketList();
 
    // Update operation
    Ticket updateTicket(Ticket ticket,
                                Long ticketId);
 
    // Delete operation
    void deleteTicketById(Long TicketId);

}
