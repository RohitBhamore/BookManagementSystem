package com.example.BookManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.BookManagementSystem.bean.Book;
import com.example.BookManagementSystem.service.BookService;

@Controller
@RequestMapping("/bookstore")
public class MyAppsController {

	@Autowired
	BookService service;

	@RequestMapping("/list")
	public String getBooks(Model theModel) {

		List<Book> booklist = service.getBooks();

		theModel.addAttribute("books", booklist);

		return "/books/list-book";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		Book theBook = new Book();

		theModel.addAttribute("book", theBook);
		return "books/book-form";
	}

	@RequestMapping("/save")
	public String save(@ModelAttribute("book") Book theBook) {

		int BookId = theBook.getBookId();

		if (BookId <= 0) {
			service.save(theBook);
		} else  {
			service.update(theBook);
		}

		return "redirect:/bookstore/list";
	}

	@RequestMapping("/getbook")
	public Book getBook(@RequestParam("bookId") int bookId) {
		return service.getBook(bookId);
	}

	@RequestMapping("/showFormForUpdate")
	public String update(@RequestParam("bookId") int bookId, Model theModel) {

		Book book = service.getBook(bookId);

		theModel.addAttribute("book", book);

		return "books/book-form";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("bookId") int bookId) {

		service.delete(bookId);

		return "redirect:/bookstore/list";
	}

}
