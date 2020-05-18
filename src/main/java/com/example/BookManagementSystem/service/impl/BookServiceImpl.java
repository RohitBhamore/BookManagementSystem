package com.example.BookManagementSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.BookManagementSystem.bean.Book;
import com.example.BookManagementSystem.dao.BookDao;
import com.example.BookManagementSystem.service.BookService;

@Service
@Qualifier(value = "BookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;

	@Override
	public List<Book> getBooks() {
		return bookDao.getBooks();
	}

	@Override
	public Book getBook(int bookId) {
		return bookDao.getBook(bookId);
	}

	@Override
	public void save(Book theBook) {
		bookDao.save(theBook);
	}

	@Override
	public void update(Book theBook) {
		bookDao.update(theBook);
	}

	@Override
	public void delete(int bookId) {
		bookDao.delete(bookId);
	}

}
