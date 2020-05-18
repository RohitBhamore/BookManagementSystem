package com.example.BookManagementSystem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.BookManagementSystem.bean.Book;
import com.example.BookManagementSystem.dao.BookDao;
import com.example.BookManagementSystem.util.Config;

@Service
@Qualifier(value = "BookDao")
public class BookDaoImpl implements BookDao {

	Config config = Config.getInstance();
	List<Book> theBookList = config.getBookList();

	@Override
	public List<Book> getBooks() {
		return theBookList;
	}

	@Override
	public Book getBook(int bookId) {
		return theBookList.get(bookId);
	}

	@Override
	public void save(Book theBook) {
		theBookList.add(theBook);
	}

	@Override
	public void update(Book theBook) {
		theBookList.set(theBook.getBookId(), theBook);
	}

	@Override
	public void delete(int bookId) {
		theBookList.remove(bookId);
	}

}
