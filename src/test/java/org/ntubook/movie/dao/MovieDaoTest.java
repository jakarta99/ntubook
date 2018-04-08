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
		movie1.setScore(7);
		movie1.setCountry("France");
		movieDao.save(movie1);
		
		Movie movie2 = new Movie();
		movie2.setType("Horror");
		movie2.setName("A Quiet Place");
		movie2.setId(0101010102L);
		movie2.setYear(2018);
		movie2.setScore(7);
		movie2.setCountry("USA");
		movieDao.save(movie2);
		
		Movie movie3 = new Movie();
		movie3.setType("Animated");
		movie3.setName("Zootopia");
		movie3.setId(0101010103L);
		movie3.setYear(2016);
		movie3.setScore(8);
		movie3.setCountry("USA");
		movieDao.save(movie3);
		
		Movie movie4 = new Movie();
		movie4.setType("Adventure");
		movie4.setName("Jumanji");
		movie4.setId(0101010104L);
		movie4.setYear(2017);
		movie4.setScore(6);
		movie4.setCountry("USA");
		movieDao.save(movie4);
		
		Movie movie5 = new Movie();
		movie5.setType("Thriller");
		movie5.setName("Miss Sloane");
		movie5.setId(0101010105L);
		movie5.setYear(2016);
		movie5.setScore(9);
		movie5.setCountry("USA and France");
		movieDao.save(movie5);

		Movie movie6 = new Movie();
		movie6.setType("Drama");
		movie6.setName("Dangal");
		movie6.setId(0101010106L);
		movie6.setYear(2016);
		movie6.setScore(9);
		movie6.setCountry("India");
		movieDao.save(movie6);
		
		Movie movie7 = new Movie();
		movie7.setType("Biography");
		movie7.setName("The King's Speech");
		movie7.setId(0101010107L);
		movie7.setYear(2010);
		movie7.setScore(7);
		movie7.setCountry("UK");
		movieDao.save(movie7);
		
		
		Iterable<Movie> movies = movieDao.findAll();
		
		for(Movie movie:movies) {
			System.out.println(movie);
		}
	}

}
