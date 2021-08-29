package com.example.restapiservice.services;

import com.example.restapiservice.entities.Book;
import java.util.List;
public interface BookService {

	public Book createBook(Book c);
	public Book updateBook(Book c);
	public List<Book> getAllBook();
	public Book getBookById(long id);
	public void deleteBook(long id);
}
