package com.au.aulibrary.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.au.aulibrary.model.Book;
import com.au.aulibrary.model.TestResponse;
//import com.au.aulibrary.repository.TestDAO;
import com.au.aulibrary.repository.BooksDAO;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private BooksDAO booksDao;
//
//	@RequestMapping(value="/test", method = RequestMethod.GET, produces = "application/json")
//	public String getTest() {
//		testDao.testDAO();
//		return "test";
//	}
	
	
	@RequestMapping(value="/test1", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public TestResponse getTestResponse() {
		TestResponse testresponse = new TestResponse();
		testresponse.setId("1");
		testresponse.setName("All is well !");
		return testresponse;
	}
	
	@RequestMapping(value="/books",produces="application/json")
	public List<Book> getBooks() {
//		List<Book> books = new ArrayList<Book>();
//		books.add(new Book(1, "War as i knew it", "General patton", 65));
//		books.add(new Book(2, "one Indian girl", "Chetan bagath", 50));
		return booksDao.all();
	}
	
	@RequestMapping(value="/book/{id}", method = RequestMethod.GET,produces="application/json")
	public Book getBookById(@PathVariable(value="id") int id) {
//		return new Book(1, "War as i knew it", "General patton", 65);
		
		return booksDao.getString(id);
	}

	@RequestMapping(value="/books",method = RequestMethod.POST,consumes="application/json")
	public Book create(@RequestBody Book bookToCreate) {
		return booksDao.create(bookToCreate);
	}
	
	@RequestMapping(value="/checkout",method=RequestMethod.POST,consumes="application/json")
	public Book createBook(@RequestBody Book bookToCheckout) {
		return booksDao.addBookToCheckout(bookToCheckout);
	}
	
	@RequestMapping(value="/checkouts",produces="application/json")
	public List<Book> getBookOfCheckout(){
		return booksDao.getBooksFromCheckout();
	}
	
	@RequestMapping(value="/deleteBook")
	public List<Book> deleteBook() {
		return booksDao.deleteBook();
	}
	
}
