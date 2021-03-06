package com.example.restapiservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapiservice.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	public Book findById (long id);
}
