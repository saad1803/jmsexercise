package com.jms.activemq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jms.activemq.dto.MessageBody;
import com.jms.activemq.service.IJmsactiveService;

@RestController
public class ActiveMqController {

	private static final Logger log = LoggerFactory.getLogger(ActiveMqController.class);
	
	@Autowired
	IJmsactiveService jmsActiveService;
	
	@PostMapping(path = "/sendMessage", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String sendMessage(@RequestBody MessageBody mo) {
		log.info(mo.toString());
		try {
			jmsActiveService.sendMessage(mo);
		}catch(Exception e) {
			return e.getMessage();
		}
		return "Success";
	}
}
