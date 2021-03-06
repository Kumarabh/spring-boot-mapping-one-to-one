package com.example.restapiservice.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.restapiservice.entities.Author;
import com.example.restapiservice.entities.Book;
import com.example.restapiservice.services.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class AuthorController {


	@Autowired
	AuthorService service;
	
	@GetMapping("/authors")
	public List<Author> getAllAuthor() {
		List<Author> c = this.service.getAllAuthor();
		return c;
	}
	
	
	@GetMapping("/authors/{id}")
	public Author getAuthor(@PathVariable long id) {
		Author b =  this.service.getAuthorById(id);
		return b;
	}
	@PostMapping("/authors")
	public Author createAuthor(@RequestBody Author c) {
		System.out.println("Controller => create Book"+ c);
		Author b =  this.service.createAuthor(c);
		return b;
	}
	@PutMapping("/authors")
	public Author updateAuthor( @RequestBody Author c) {
		Author b =  this.service.updateAuthor(c);
		return b;
	}
	@DeleteMapping("/authors/{id}")
	public void deleteAuthor(@PathVariable long id) {
		this.service.deleteAuthor(id);
	}
	
}
