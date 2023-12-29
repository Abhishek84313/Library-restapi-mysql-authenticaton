package com.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Entity.Book;
import com.library.repository.BookRepo;
import com.library.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bookrepo;
	@Override
	public Book addBook(Book book) {
		return bookrepo.save(book);
	}

	@Override
	public List<Book> getBookdetails() {
		// TODO Auto-generated method stub
		return bookrepo.findAll();
	}

}
