package com.example.restapiservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.restapiservice.entities.Book;
import com.example.restapiservice.services.BookService;


@RestController
public class BookController {

	@Autowired
	BookService service;
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		List<Book> c = this.service.getAllBook();
		return c;
	}
	
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable long id) {
		Book book =  this.service.getBookById(id);
		System.out.println("Book By Id CONTROLLER==>"+ book);
		return book;
	}
	@PostMapping("/books")
	public Book createBook(@RequestBody Book c) {
		System.out.println("Controller => create Book"+ c);
		Book book =  this.service.createBook(c);
		return book;
	}
	@PutMapping("/books")
	public Book updateBook(  @RequestBody Book c) {
		Book b =  this.service.updateBook(c);
		System.out.println("Book controller ==>" + b);
		return b;
	}
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable long id) {
		this.service.deleteBook(id);
	}
}
