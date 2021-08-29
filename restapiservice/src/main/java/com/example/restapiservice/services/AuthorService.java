package com.example.restapiservice.services;

import java.util.List;

import com.example.restapiservice.entities.Author;

public interface AuthorService {

	public Author createAuthor(Author c);
	public Author updateAuthor(Author c);
	public List<Author> getAllAuthor();
	public Author getAuthorById(long id);
	public void deleteAuthor(long id);
	
}
