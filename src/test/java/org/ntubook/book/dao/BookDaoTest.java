package org.ntubook.book.dao;

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
	public void testFindAll() {
		Book book1 = new Book();
		book1.setPrice(100);
		book1.setName("Calculate");
		book1.setId(50505050505L);
		
		bookDao.save(book1);
		
		Book book2 = new Book();
		book2.setName("Economics");
		book2.setPrice(500);
		
		bookDao.save(book2);
		

		
		Iterable<Book> books = bookDao.findAll();
		
		for(Book book:books) {
			System.out.println(book);
		}
	}

}
