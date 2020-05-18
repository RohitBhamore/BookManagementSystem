package com.example.BookManagementSystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.BookManagementSystem.bean.Book;

@Repository
public interface BookDao {

	public List<Book> getBooks();

	public Book getBook(int bookId);

	public void save(Book theBook); // add book

	public void update(Book theBook);

	public void delete(int bookId);
	
	
}
