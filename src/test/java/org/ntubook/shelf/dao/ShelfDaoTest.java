package org.ntubook.shelf.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ntubook.shelf.entity.Shelf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest



public class ShelfDaoTest {
	
	

	@Autowired
	private ShelfDao shelfDao;
	
	@Test
	public void testFindAll() {
		
		Shelf shelf1 = new Shelf();
		shelf1.setHeight(100);
		shelf1.setName("no.1");
		
		shelfDao.save(shelf1);
		
		Shelf shelf2 = new Shelf();
		shelf2.setHeight(80);
		shelf2.setName("no.2");
		
		shelfDao.save(shelf2);
		
		Iterable<Shelf> shelfs = shelfDao.findAll();
		
		for(Shelf shelf:shelfs) {
			System.out.println(shelf);
		}


	
	
	}
}
