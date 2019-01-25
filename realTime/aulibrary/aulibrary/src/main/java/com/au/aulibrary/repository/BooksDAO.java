package com.au.aulibrary.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.aulibrary.model.Book;

@Repository
public class BooksDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> all(){
		return jdbcTemplate.query("select * from book", (rs, i) -> {
			return new Book(rs.getInt("id"), 
					rs.getString("name"), 
					rs.getString("authorName"), 
					rs.getInt("price"));
		});
	}
	
	public List<Book> getBooksFromCheckout(){
		return jdbcTemplate.query("select * from checkout", (rs, i) -> {
			return new Book(rs.getInt("id"), 
					rs.getString("name"), 
					rs.getString("authorName"), 
					rs.getInt("price"));
		});
	}
	
	public Book getString(int id){
		//return jdbcTemplate.queryForObject("select * from book where id="+id, Book.class);
		List<Book> books= jdbcTemplate.query("select * from book where id="+id, (rs, i) -> {
			return new Book(rs.getInt("id"), 
					rs.getString("name"), 
					rs.getString("authorName"), 
					rs.getInt("price"));
		});
		
		return books.get(0);
		
	}
	
	public Book create(Book book) {
		jdbcTemplate.update("insert into book(id,name,authorName,price) values(?,?,?,?)",
				book.getId(),
				book.getBookName(),
				book.getAuthorName(),
				book.getPrice());
		return book;
	}

	public Book addBookToCheckout(Book book) {
		jdbcTemplate.update("insert into checkout(id,name,authorName,price) values(?,?,?,?)",
				book.getId(),
				book.getBookName(),
				book.getAuthorName(),
				book.getPrice());
		return book;
	}

	public List<Book> deleteBook() {
		jdbcTemplate.update("delete from checkout");
		return jdbcTemplate.query("select * from checkout", (rs, i) -> {
			return new Book(rs.getInt("id"), 
					rs.getString("name"), 
					rs.getString("authorName"), 
					rs.getInt("price"));
		});
	}

}
