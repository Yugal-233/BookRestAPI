package com.spring.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.test.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	
	public Book findById(int id) ;
		
	

}
