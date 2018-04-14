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

		//insert1
		Shelf shelf1 = new Shelf();
		shelf1.setName("BRIMNES");
		shelf1.setHeight(100);
		shelf1.setLenth(20);
		shelf1.setWidth(50);
		shelfDao.save(shelf1);
		
		//insert2
		Shelf shelf2 = new Shelf();
		shelf2.setName("HOFORS");
		shelf2.setHeight(80);
		shelf2.setLenth(44);
		shelf2.setWidth(88);
		shelfDao.save(shelf2);
		
		//insert3
		Shelf shelf3 = new Shelf();
		shelf3.setName("BILLY");
		shelf3.setHeight(99);
		shelf3.setLenth(33);
		shelf3.setWidth(44);
		shelfDao.save(shelf3);
		
		
		
		System.out.println("-----------***findByNameLike***--------------------------");
		
		//findByNameLike
		shelfs = shelfDao.findByNameLike("B%");
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
			
		
		System.out.println("------------***END***------------------------------");
		
		
		/*Iterable<Shelf> shelfs = shelfDao.findAll();
		
		for(Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		*/


	
	
	}
}
