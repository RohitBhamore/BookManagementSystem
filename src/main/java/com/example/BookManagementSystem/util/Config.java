package com.example.BookManagementSystem.util;

import java.util.ArrayList;
import java.util.List;
import com.example.BookManagementSystem.bean.Book;

public class Config {

	private static Config config;
	private List<Book> bookList;

	Config() {
		bookList = new ArrayList<Book>();
		bookList.add(new Book(0, "ABC", "ABCD", "10MAY"));
		bookList.add(new Book(1, "BCD", "ABCD", "10MAY"));
		bookList.add(new Book(2, "EFG", "ABCD", "10MAY"));
		bookList.add(new Book(3, "HIJ", "ABCD", "10MAY"));
		bookList.add(new Book(4, "LMN", "ABCD", "10MAY"));
		bookList.add(new Book(5, "PQR", "ABCD", "10MAY"));
		bookList.add(new Book(6, "XMY", "ABCD", "10MAY"));
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public static Config getInstance() {
		if (config == null) {
			System.out.println("Create Configure Object");
			return config = new Config();
		} else {
			System.out.println("Given Existing object");
			return config;
		}
	}
}
