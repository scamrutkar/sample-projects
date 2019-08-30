package com.javacase.sagar.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.javacase.sagar.repository.AuthorRepository;
import com.javacase.sagar.repository.BookRepository;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	
	public DevBootstrap(AuthorRepository authorRepo, BookRepository bookRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
	}

}
