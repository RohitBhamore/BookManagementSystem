package com.example.BookManagementSystem.bean;

public class Book {

	private int bookId;

	private String BookName;

	private String BookAuthor;

	private String DateOfPublish;

	public Book() {
		super();
	}

	public Book(int bookId, String bookName, String bookAuthor, String dateOfPublish) {
		super();
		this.bookId = bookId;
		BookName = bookName;
		BookAuthor = bookAuthor;
		DateOfPublish = dateOfPublish;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getBookAuthor() {
		return BookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}

	public String getDateOfPublish() {
		return DateOfPublish;
	}

	public void setDateOfPublish(String dateOfPublish) {
		DateOfPublish = dateOfPublish;
	}

}
