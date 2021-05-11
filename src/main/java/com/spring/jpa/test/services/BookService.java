package com.spring.jpa.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.jpa.test.dao.BookRepository;
import com.spring.jpa.test.entities.Book;

@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
//	private static List<Book> list = new ArrayList<>();
	
//	static {
//		
//		  list.add(new Book(11, "C Program", "Yugal")); 
//		  list.add(new Book(12, "Python","Mayur")); 
//		  list.add(new Book(13, "Coding Game", "Prajakta"));
//	}
	
	public List<Book> getAllBooks(){
		
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}
	
	public Book getBookById(int id) {
		
		Book book = null;
		try {
		//book = list.stream().filter(e->e.getId()==id).findFirst().get();
			
			book =this.bookRepository.findById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return book;
	}
	
	public Book addBook(Book book) {
		//list.add(book); 
		
		Book  result =bookRepository.save(book);
		return result;
	}

	public void deleteBookById(int bookId) {
		
		//list = list.stream().filter(book->book.getId()!=bookId).collect(Collectors.toList());
		
		bookRepository.deleteById(bookId);
		
	}

	public void updateBook(Book book, int bookId) {
		
//		list = list.stream().map(e->{
//			if(e.getId() == bookId) {
//				e.setAuthur(book.getAuthur());
//				e.setTitle(book.getTitle());
//			}
//			return e;
//		}).collect(Collectors.toList());
		book.setId(bookId);
		bookRepository.save(book);
		
	}

}
