package com.library.service;

import java.util.List;

import com.library.Entity.Book;

public interface BookService {

	public Book addBook(Book book);
	public List<Book> getBookdetails();
}
