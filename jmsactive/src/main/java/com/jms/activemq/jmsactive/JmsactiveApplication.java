package com.jms.activemq.jmsactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@ComponentScan(basePackages = "com.jms.activemq")
@EnableJms
public class JmsactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsactiveApplication.class, args);
	}

}
