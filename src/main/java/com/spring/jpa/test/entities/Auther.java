package com.spring.jpa.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Auther {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int autherId;
	private String firstName;
	private String lastName;
	private String language;
	
	@OneToOne(mappedBy = "auther")
	@JsonBackReference
	private Book book;
	
	
	public Auther() {
		super();
	}
	
	public Auther(int autherId, String firstName, String lastName, String language, Book book) {
		super();
		this.autherId = autherId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.language = language;
		this.book = book;
	}

	public int getAutherId() {
		return autherId;
	}
	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Auther [autherId=" + autherId + ", firstName=" + firstName + ", lastName=" + lastName + ", language="
				+ language + ", book=" + book + "]";
	}
	
}
