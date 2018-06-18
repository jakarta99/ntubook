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
		List<Book> books = Lists.newArrayList(bookDao.findAll()); //<class> variable
		for (Book book:books) {  //class variable:list
			System.out.println(book);  //variable
		}
		System.out.println("------------------------------------------------------");
		
		//insert
		Book book1 = new Book(); //class variable = new object
		book1.setPrice(100);
		book1.setName("Calculate".toUpperCase()); 
		book1.setProfessor("Allen");
		
		bookDao.save(book1);
		
		Book book4 = new Book();
		book4.setPrice(300);
		book4.setName("Java".toLowerCase());
		book4.setProfessor("Bob");
		
		bookDao.save(book4);
		
		Book book5 = new Book();
		book5.setPrice(500);
		book5.setName("Java");
		book5.setProfessor("Cindy");
		
		bookDao.save(book5);
		
		//findAll
		books = Lists.newArrayList(bookDao.findAll()); 
		for (Book book:books) {
			System.out.println(book);
		}		
		
		//findOne
		System.out.println("------------------**findByNameLike**------------------");
		books = bookDao.findByNameLike("a%");
		for (Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("---------------**findByPriceLessThan**----------------");
		books = bookDao.findByPriceLessThan(100);
		for (Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("------------**findByPriceGreaterThanEqual**-----------");
		books = bookDao.findByPriceGreaterThanEqual(100);
		for (Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("-----------**findByPriceOrderByNameDesc**-----------");
		books = bookDao.findByPriceOrderByNameDesc(100);
		for (Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("-----------**findByNameOrderByPriceDesc**-----------");
		books = bookDao.findByNameOrderByPriceDesc("Java");
		for (Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("------------**findByNameAndProfessor**--------------");
		books = bookDao.findByNameAndProfessor("Java", "Bob");
		for (Book book:books) {
			System.out.println(book);
		}
		System.out.println("----------------------------------------------------");
		
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
		System.out.println("----------------------------------------------------");
		
		//delete
		Book book3 = new Book();
		book3.setId(1L);
		bookDao.delete(book3);
		
		//findAll
		books = Lists.newArrayList(bookDao.findAll()); 
		for (Book book:books) {
			System.out.println(book);
		}
		System.out.println("----------------------------------------------------");
		
		
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

	@Test
	public void testFindTop3OrderByViewCount() {
		
		List<Book> results = bookDao.findTop3ByOrderByViewCountDesc();
		
		for(Book book:results) {
			System.out.println(book);
		}
		
		
	}
}
