package org.ntubook.movie.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ntubook.movie.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieDaoTest {
	
	@Autowired
	private MovieDao movieDao;

	@Test
	public void testFindAll() {
		Movie movie1 = new Movie();
		movie1.setType("Comedy");
		movie1.setName("Penny Pincher");
		movie1.setId(0101010101L);
		movie1.setYear(2016);
		
		movieDao.save(movie1);
		
		Movie movie2 = new Movie();
		movie2.setType("Horror");
		movie2.setName("A Quiet Place");
		movie2.setId(0101010102L);
		movie2.setYear(2018);
				
		movieDao.save(movie2);
		
		Movie movie3 = new Movie();
		movie3.setType("Animated");
		movie3.setName("Zootopia");
		movie3.setId(0101010103L);
		movie3.setYear(2016);
				
		movieDao.save(movie3);

		
		Iterable<Movie> movies = movieDao.findAll();
		
		for(Movie movie:movies) {
			System.out.println(movie);
		}
	}

}
