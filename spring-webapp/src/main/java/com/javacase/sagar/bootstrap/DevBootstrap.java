package com.javacase.sagar.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.javacase.sagar.model.Author;
import com.javacase.sagar.model.Book;
import com.javacase.sagar.model.Publisher;
import com.javacase.sagar.repository.AuthorRepository;
import com.javacase.sagar.repository.BookRepository;
import com.javacase.sagar.repository.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	private PublisherRepository publisherRepo;
	
	public DevBootstrap(AuthorRepository authorRepo, BookRepository bookRepo,
			PublisherRepository publisherRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}

	private void initData() {
		
		Author author1 = new Author("Sagar", "Amrutkar");
		Publisher publisher1 = new Publisher("McGrow Publication", "London");
		Book book1 = new Book("Few things left unsaid", "123", publisher1);
		author1.addBook(book1);
		book1.addAuthors(author1);
		
		authorRepo.save(author1);
		publisherRepo.save(publisher1);
		bookRepo.save(book1);
		
		
		Author author2 = new Author("Rohit", "Pandit");
		Publisher publisher2 = new Publisher("McGrow Publication", "Bangalore");
		Book book2 = new Book("Unsolved mystry of life", "456", publisher2);
		author2.addBook(book2);
		book2.addAuthors(author2);
		
		authorRepo.save(author2);
		publisherRepo.save(publisher2);
		bookRepo.save(book2);
		
		
		
	}

}
