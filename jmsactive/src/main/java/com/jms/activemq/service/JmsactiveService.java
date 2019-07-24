package com.jms.activemq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.jms.activemq.dto.MessageBody;

@Service
public class JmsactiveService implements IJmsactiveService{

	private static final Logger log = LoggerFactory.getLogger(JmsactiveService.class);
	
	@Autowired
	private JmsTemplate jmsTemplate;
	@Override
	public void sendMessage(MessageBody inDTO) {
		log.info("In send Message method");
		jmsTemplate.convertAndSend("saadFirstQueue", inDTO);
		
	}

}
