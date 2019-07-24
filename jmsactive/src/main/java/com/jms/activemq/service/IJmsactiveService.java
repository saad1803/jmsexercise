package com.jms.activemq.service;

import org.springframework.stereotype.Service;

import com.jms.activemq.dto.MessageBody;

public interface IJmsactiveService {

	public void sendMessage(MessageBody inDTO);
}
