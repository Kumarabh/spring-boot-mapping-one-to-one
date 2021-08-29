package com.example.restapiservice.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapiservice.entities.Author;
import com.example.restapiservice.entities.Book;
import com.example.restapiservice.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository repository;
	
	
	@Override
	public Book createBook(Book c) {
		// TODO Auto-generated method stub
		Book b = this.repository.save(c);
		return b;
	}

	@Override
	public Book updateBook(Book c) {
		System.out.println("BOOK ID: " + c);
		Optional<Book> Bookdb = Optional.of(this.repository.findById(c.getBookId()));
		if(Bookdb.isPresent()) {
			Book BookUpdate = Bookdb.get();
			BookUpdate.setTitle(c.getTitle());
			BookUpdate.setAuthor(c.getAuthor());
		    
		    this.repository.save(BookUpdate);
			System.out.println("Book service ==>" + BookUpdate);

		    return BookUpdate;
		}
		return null;
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		List<Book> b = this.repository.findAll();
		return b;
	}

	@Override
	public Book getBookById(long id) {
		// TODO Auto-generated method stub
//		Book b = this.repository.getById(id);
//		System.out.println("Book By Id Service==>"+ b);
		Book b = this.repository.findById(id);
		return b;
	}

	@Override
	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
		
	}

	
	
}
