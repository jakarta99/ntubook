package org.ntubook.movie.dao;

import java.util.List;

import org.assertj.core.util.Lists;
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
	public void testCrud() {
		//findAll
		List<Movie> movies = Lists.newArrayList(movieDao.findAll());
		for (Movie movie:movies) {           
			System.out.println(movie);
		}
		System.out.println("======================================================");
		
		//insert
		Movie movie1 = new Movie();
		movie1.setType("Comedy");
		movie1.setName("Penny Pincher".toUpperCase());
		movie1.setYear(2016);
		movie1.setScore(7.2f);
		movie1.setCountry("France");
		
		movieDao.save(movie1);
		
		Movie movie4 = new Movie();
		movie4.setType("Comedy");
		movie4.setName("ET");
		movie4.setYear(2016);
		movie4.setScore(7.2f);
		movie4.setCountry("France");
		
		movieDao.save(movie4);
		
		//findAll
		movies = movieDao.findByNameLike("%P%");
		for (Movie movie:movies) {
			System.out.println(movie);
		}
		System.out.println("======================================================");
		
		//update
		Movie movie2 = new Movie();
		movie2.setId(1L);
		movie2.setType("Horror");
		movie2.setName("A Quiet Place");
		movie2.setYear(2018);
		movie2.setScore(6.9f);
		movie2.setCountry("USA");
		
		movieDao.save(movie2);
		
		//findAll
		movies = Lists.newArrayList(movieDao.findAll());
		for (Movie movie:movies) {
			System.out.println(movie);
		}
		System.out.println("======================================================");
		
		//delete
		Movie movie3 = new Movie();
		movie3.setId(1L);
		movieDao.delete(movie3);
		
		//findAll
		movies = Lists.newArrayList(movieDao.findAll());
		for (Movie movie:movies) {
			System.out.println(movie);
		}
		System.out.println("======================================================");
		
		
		
		/*
		Movie movie1 = new Movie();
		movie1.setType("Comedy");
		movie1.setName("Penny Pincher");
		movie1.setYear(2016);
		movie1.setScore(7.2f);
		movie1.setCountry("France");
		movieDao.save(movie1);
		
		Movie movie2 = new Movie();
		movie2.setType("Horror");
		movie2.setName("A Quiet Place");
		movie2.setYear(2018);
		movie2.setScore(6.9f);
		movie2.setCountry("USA");
		movieDao.save(movie2);
		
		Movie movie3 = new Movie();
		movie3.setType("Animated");
		movie3.setName("Zootopia");
		movie3.setYear(2016);
		movie3.setScore(7.9f);
		movie3.setCountry("USA");
		movieDao.save(movie3);
		
		Movie movie4 = new Movie();
		movie4.setType("Adventure");
		movie4.setName("Jumanji");
		movie4.setYear(2017);
		movie4.setScore(6.4f);
		movie4.setCountry("USA");
		movieDao.save(movie4);
		
		Movie movie5 = new Movie();
		movie5.setType("Thriller");
		movie5.setName("Miss Sloane");
		movie5.setYear(2016);
		movie5.setScore(9.1f);
		movie5.setCountry("USA and France");
		movieDao.save(movie5);

		Movie movie6 = new Movie();
		movie6.setType("Drama");
		movie6.setName("Dangal");
		movie6.setYear(2016);
		movie6.setScore(9.2f);
		movie6.setCountry("India");
		movieDao.save(movie6);
		
		Movie movie7 = new Movie();
		movie7.setType("Biography");
		movie7.setName("The King's Speech");
		movie7.setYear(2010);
		movie7.setScore(7.5f);
		movie7.setCountry("UK");
		movieDao.save(movie7);
		
		
		Iterable<Movie> movies = movieDao.findAll();
		
		for(Movie movie:movies) {
			System.out.println(movie);
		}
		*/
	}

}
