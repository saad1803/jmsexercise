package com.jms.activemq.config;

import javax.jms.ConnectionFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import com.tibco.tibjms.TibjmsConnectionFactory;

@Configuration
public class JmsTibcoConfig {
	
	@Value("${spring.tibco.broker.url}")
	private String brokerURL;
	
	@Value("${spring.tibco.username}")
	private String username;
	
	@Value("${spring.tibco.password}")
	private String password;
	
	@Bean
	public ConnectionFactory connectionFactory() {
		TibjmsConnectionFactory connectionFactory = new TibjmsConnectionFactory(brokerURL);
		connectionFactory.setUserName(username);
		connectionFactory.setUserPassword(password);
		
		return connectionFactory;
	}
	
	@Bean
	public JmsListenerContainerFactory<?> myFactory(DefaultJmsListenerContainerFactoryConfigurer configurer){
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		
		
		factory.setErrorHandler(t-> t.getLocalizedMessage());
		
		configurer.configure(factory, connectionFactory());
		
		return factory;
	}
}
