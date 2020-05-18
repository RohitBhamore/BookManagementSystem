package com.example.BookManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BookManagementSystem.bean.Book;

@Service
public interface BookService {

	public List<Book> getBooks();

	public Book getBook(int bookId);

	public void save(Book theBook); // add book

	public void update(Book theBook);

	public void delete(int bookId);

}
