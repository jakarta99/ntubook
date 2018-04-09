package org.ntubook.shelf.dao;

import java.util.List;

import org.assertj.core.util.Lists;
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
	public void testCrud() {
		//findAll
		List<Shelf> shelfs = Lists.newArrayList(shelfDao.findAll());
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("------------------------------------------");

		//insert
		Shelf shelf1 = new Shelf();
		shelf1.setName("BRIMNES");
		shelf1.setHeight(100);
		shelf1.setLenth(20);
		shelf1.setWidth(50);
		shelfDao.save(shelf1);
		
		//findAll
		shelfs = Lists.newArrayList(shelfDao.findAll());
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("------------------------------------------");
		
		//update
		Shelf shelf2 = new Shelf();
		shelf2.setId(1L);
		shelf2.setName("HOFORS");
		shelf2.setHeight(80);
		shelf2.setLenth(44);
		shelf2.setWidth(88);
		shelfDao.save(shelf2);
		
		//findAll
		shelfs = Lists.newArrayList(shelfDao.findAll());
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("------------------------------------------");
		
		//delete
		Shelf shelf3 = new Shelf();
		shelf3.setId(1L);
		shelfDao.delete(shelf3);
		
		//findAll
		shelfs = Lists.newArrayList(shelfDao.findAll());
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		System.out.println("------------------------------------------");
		
		
		/*Iterable<Shelf> shelfs = shelfDao.findAll();
		
		for(Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		*/


	
	
	}
}
