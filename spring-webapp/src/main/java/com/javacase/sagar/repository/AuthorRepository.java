package com.javacase.sagar.repository;

import org.springframework.data.repository.CrudRepository;

import com.javacase.sagar.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
