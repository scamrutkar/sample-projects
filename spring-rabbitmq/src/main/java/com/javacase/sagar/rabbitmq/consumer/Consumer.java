package com.javacase.sagar.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.javacase.sagar.rabbitmq.config.RabbitConfig;

@Component
public class Consumer {
	
	 private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	    @RabbitListener(queues = {RabbitConfig.queueName})
	    public void receiveMessage(String message) throws InterruptedException {
	    	Thread.sleep(10000);
	        logger.info("Received Message: " + message);
	    }

}
