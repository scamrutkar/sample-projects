package com.javacase.sagar.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String isbn;
	@OneToOne
	private Publisher publisher;

	@ManyToMany
	@JoinTable(name = "author_book",joinColumns = @JoinColumn(name="book_id"),
			inverseJoinColumns = @JoinColumn(name="author_id"))
	Set<Author> authors = new HashSet<>();

	public Book() {
	}

	public Book(String title, String isbn, Publisher publisher) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void addAuthors(Author author) {
		this.authors.add(author);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", publisher=" + publisher + ", authors="
				+ authors + "]";
	}

}
