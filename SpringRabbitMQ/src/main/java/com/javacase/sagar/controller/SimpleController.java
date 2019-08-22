package com.javacase.sagar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.javacase.sagar.rabbitmq.publisher.Publisher;

@Controller
public class SimpleController {
	
	 private final Publisher messageProducer;

	    @Autowired
	    public SimpleController(Publisher messageProducer) {
	        this.messageProducer = messageProducer;
	    }

	    @RequestMapping(value="/messages", method= RequestMethod.POST)
	    @ResponseStatus(value= HttpStatus.CREATED)
	    public void sendMessage(@RequestBody String message) {
	        messageProducer.sendMessage(message);
	    }

}
