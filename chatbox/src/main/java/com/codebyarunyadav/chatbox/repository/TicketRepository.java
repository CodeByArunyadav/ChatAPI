package com.codebyarunyadav.chatbox.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.codebyarunyadav.chatbox.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
