package com.javacase.sagar.rabbitmq.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javacase.sagar.rabbitmq.config.RabbitConfig;

@Component
public class Publisher {

	private final RabbitTemplate rabbitTemplate;

	@Autowired
	public Publisher(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendMessage(String message) {
		rabbitTemplate.convertAndSend(RabbitConfig.queueName, message);
	}

}
