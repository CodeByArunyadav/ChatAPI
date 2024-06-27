package com.codebyarunyadav.chatbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController; 
import com.codebyarunyadav.chatbox.entity.Ticket; 
import com.codebyarunyadav.chatbox.service.TicketServiceImp;

@RestController
//@Api(value = "CategoryAPI", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping("/pp")
public class TicketController {
	@Autowired
	TicketServiceImp TicketerviceImp;
	@RequestMapping(method = RequestMethod.POST, value = "/ticket/add")
	public ResponseEntity<Boolean> addProduct(@RequestBody Ticket ticket) {
		TicketerviceImp.saveTicket(ticket);
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/ticket/get/by/id/{ticketId}")
	public void getProductById(@PathVariable Long productId) {
		TicketerviceImp.deleteTicketById(productId);

}
}
