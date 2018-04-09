package org.ntubook.book.dao;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ntubook.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookDaoTest {
	
	@Autowired
	private BookDao bookDao;

	@Test
	public void testCrud() {
		//findAll
		List<Book> books = Lists.newArrayList(bookDao.findAll()); 
		for (Book book:books) {
			System.out.println(book);
		}
		System.out.println("===================================================");
		//insert
		Book book1 = new Book();
		book1.setPrice(100);
		book1.setName("Calculate");
		
		bookDao.save(book1);
		//findAll
		books = Lists.newArrayList(bookDao.findAll()); 
		for (Book book:books) {
			System.out.println(book);
		}
		System.out.println("===================================================");
		//update
		Book book2 = new Book();
		book2.setId(1L);
		book2.setName("Economics");
		book2.setPrice(500);
		
		bookDao.save(book2);
		//findAll
		books = Lists.newArrayList(bookDao.findAll()); 
		for (Book book:books) {
			System.out.println(book);
		}
		System.out.println("===================================================");
		//delete
		Book book3 = new Book();
		book3.setId(1L);
		bookDao.delete(book3);
		
		//findAll
		books = Lists.newArrayList(bookDao.findAll()); 
		for (Book book:books) {
			System.out.println(book);
		}
		System.out.println("===================================================");
		
		
		/*
		Book book1 = new Book();
		book1.setPrice(100);
		book1.setName("Calculate");
		
		bookDao.save(book1);
		
		Book book2 = new Book();
		book2.setName("Economics");
		book2.setPrice(500);
		
		bookDao.save(book2);
		

		
		Iterable<Book> books = bookDao.findAll();
		
		for(Book book:books) {
			System.out.println(book);
		}
		*/
	}

}
