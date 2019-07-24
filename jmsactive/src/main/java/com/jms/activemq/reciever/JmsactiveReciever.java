package com.jms.activemq.reciever;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.jms.activemq.dto.MessageBody;

@Service
public class JmsactiveReciever {

	private static final Logger log = LoggerFactory.getLogger(JmsactiveReciever.class);

	@JmsListener(destination = "saadFirstQueue", containerFactory = "myFactory")
	public void recieveMessage(MessageBody mo) {
		System.out.println(mo.toString());
	
	}
}
