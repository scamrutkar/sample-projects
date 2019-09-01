package com.javacase.sagar.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javacase.sagar.repository.BookRepository;

@Controller
public class BooksController {
	
	private BookRepository bookRepo;
	
	public BooksController(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}

}
