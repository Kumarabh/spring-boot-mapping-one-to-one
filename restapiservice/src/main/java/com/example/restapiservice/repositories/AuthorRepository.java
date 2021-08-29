package com.example.restapiservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapiservice.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
