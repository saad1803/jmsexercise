package com.jms.activemq.reciever;

import org.springframework.stereotype.Service;

import com.jms.activemq.dto.MessageBody;

@Service
public interface IJmsactiveReciever {

	public void recieveMessage(MessageBody mo);
}
