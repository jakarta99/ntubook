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
		shelf1.setDesigner("Henrry");
		shelf1.setHeight(100);
		shelf1.setLenth(33);
		shelf1.setWidth(50);
		shelfDao.save(shelf1);
		
		//insert2
		Shelf shelf2 = new Shelf();
		shelf2.setDesigner("Pull");
		shelf2.setName("HOFORS");
		shelf2.setHeight(80);
		shelf2.setLenth(33);
		shelf2.setWidth(88);
		shelfDao.save(shelf2);
		
		//insert3
		Shelf shelf3 = new Shelf();
		shelf3.setName("BILLY");
		shelf3.setDesigner("William");
		shelf3.setHeight(99);
		shelf3.setLenth(33);
		shelf3.setWidth(44);
		shelfDao.save(shelf3);
		
		//insert4
		Shelf shelf4 = new Shelf();
		shelf4.setName("BOMNUM");
		shelf4.setDesigner("Wendy");
		shelf4.setHeight(120);
		shelf4.setLenth(15);
		shelf4.setWidth(44);
		shelfDao.save(shelf4);
		
		System.out.println("-----------***findAll***--------------------------");
		
		//findAll
		shelfs = Lists.newArrayList(shelfDao.findAll());
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		
		System.out.println("-----------***findByNameLike***--------------------------");
		
		//findByNameLike
		shelfs = shelfDao.findByNameLike("B%");
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("-----------***findByHeightLessThanEqual***--------------------------");
		shelfs =shelfDao.findByHeightLessThanEqual(80);
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("-----------***findByWedthGreaterThan***--------------------------");
		shelfs = shelfDao.findByWidthGreaterThan(50);
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("-----------***findByNameOrderByHeightDesc***--------------------------");
		shelfs = shelfDao.findByNameOrderByHeightDesc("B%");
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("-----------***findByLengthOrderByNameDesc***--------------------------");
		shelfs = shelfDao.findByLenthOrderByNameDesc(33);
		for (Shelf shelf:shelfs) {
			System.out.println(shelf);
		}
		
		System.out.println("-----------***findByNameAndDesigner***--------------------------");
		shelfs = shelfDao.findByNameAndDesigner("B%", "W%");
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
