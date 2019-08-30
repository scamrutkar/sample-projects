package com.javacase.sagar.repository;

import org.springframework.data.repository.CrudRepository;

import com.javacase.sagar.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
