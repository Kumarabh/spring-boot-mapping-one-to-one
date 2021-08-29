package com.example.restapiservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapiservice.entities.Author;
import com.example.restapiservice.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	AuthorRepository repository;
	@Override
	public Author createAuthor(Author c) {
		// TODO Auto-generated method stub
		Author b = this.repository.save(c);
		return b;
	}

	@Override
	public Author updateAuthor(Author c) {
		// TODO Auto-generated method stub
		Optional<Author> Authordb = this.repository.findById(c.getAuthorId());
		if(Authordb.isPresent()) {
			Author AuthorUpdate = Authordb.get();
			AuthorUpdate.setFirstName(c.getFirstName());
			AuthorUpdate.setLastName(c.getLastName());
			AuthorUpdate.setLanguage(c.getLanguage());
		    
		    this.repository.save(AuthorUpdate);
		    
		    return AuthorUpdate;
		}
		return null;
	}

	@Override
	public List<Author> getAllAuthor() {
		// TODO Auto-generated method stub
		List<Author> b = this.repository.findAll();
		return b;
	}

	@Override
	public Author getAuthorById(long id) {
		// TODO Auto-generated method stub
		Author b = this.repository.getById(id);
		return b;
	}

	@Override
	public void deleteAuthor(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
		
	}

	
}
