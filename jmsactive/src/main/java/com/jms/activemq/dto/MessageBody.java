package com.jms.activemq.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MessageBody implements Serializable {
 
	private String name;
	private String address;
	private String organization;
	
}
