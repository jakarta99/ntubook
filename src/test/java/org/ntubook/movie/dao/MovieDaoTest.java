package org.ntubook.movie.dao;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ntubook.book.entity.Book;
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
		System.out.println("===========================================================");
		
		//findOne
		System.out.println("------------------**findByNameLike**------------------");
		movies = movieDao.findByNameLike("C%");
		for (Movie movie:movies) {
			System.out.println(movie);
		}
				
		System.out.println("---------------**findByYearLessThanEqual**----------------");
		movies = movieDao.findByYearLessThanEqual(2017);
		for (Movie movie:movies) {
			System.out.println(movie);
		}
				
		System.out.println("---------------**findByTypeLike**----------------");
		movies = movieDao.findByTypeLike("A%");
		for (Movie movie:movies) {
			System.out.println(movie);
		}
				
		System.out.println("---------------**findByScoreMoreThanEqual**----------------");
		movies = movieDao.findByScoreMoreThanEqual(6f);
		for (Movie movie:movies) {
			System.out.println(movie);
		}
				
		System.out.println("---------------**findByCountryLike**----------------");
		movies = movieDao.findByCountryLike("A%");
		for (Movie movie:movies) {
			System.out.println(movie);
		}
				
		System.out.println("---------------**findByYearAndScoreMoreThanEqual**----------------");
		movies = movieDao.findByYearAndScoreMoreThanEqual(2017, 6f);
		for (Movie movie:movies) {
			System.out.println(movie);
		}
		
		//insert
		Movie movie1 = new Movie();
		movie1.setType("Action".toUpperCase());
		movie1.setName("Doctor Strange".toUpperCase());
		movie1.setYear(2016);
		movie1.setScore(7.2f);
		movie1.setCountry("France".toUpperCase());
		
		movieDao.save(movie1);
		
		Movie movie4 = new Movie();
		movie4.setType("Adventure".toUpperCase());
		movie4.setName("Jumanji".toUpperCase());
		movie4.setYear(2017);
		movie4.setScore(6.4f);
		movie4.setCountry("USA".toUpperCase());
				
		movieDao.save(movie4);
		
		//findAll
		movies = movieDao.findByYearLessThanEqual(2018);
		for (Movie movie:movies) {
			System.out.println(movie);
		}
		System.out.println("===========================================================");
		
		//update
		Movie movie2 = new Movie();
		movie2.setId(1L);
		movie2.setType("Horror".toUpperCase());
		movie2.setName("A Quiet Place".toUpperCase());
		movie2.setYear(2018);
		movie2.setScore(6.9f);
		movie2.setCountry("USA".toUpperCase());
		
		movieDao.save(movie2);
		
		Movie movie5 = new Movie();
		movie5.setId(2L);
		movie5.setType("Adventure".toUpperCase());
		movie5.setName("Foresee".toUpperCase());
		movie5.setYear(2017);
		movie5.setScore(6.4f);
		movie5.setCountry("USA".toUpperCase());
		
		movieDao.save(movie5);
		
		//findAll
		movies = Lists.newArrayList(movieDao.findAll());
		for (Movie movie:movies) {
			System.out.println(movie);
		}
		System.out.println("===========================================================");
		
		//delete
		Movie movie3 = new Movie();
		movie3.setId(1L);
		movieDao.delete(movie3);
		
		Movie movie6 = new Movie();
		movie6.setId(2L);
		movieDao.delete(movie6);
		
		//findAll
		movies = Lists.newArrayList(movieDao.findAll());
		for (Movie movie:movies) {
			System.out.println(movie);
		}
		System.out.println("===========================================================");
		
		
		
		/*
		Movie movie1 = new Movie();
		movie1.setType("Comedy".toUpperCase());
		movie1.setName("Penny Pincher".toUpperCase());
		movie1.setYear(2016);
		movie1.setScore(7.2f);
		movie1.setCountry("France".toUpperCase());
		
		movieDao.save(movie1);
		
		Movie movie2 = new Movie();
		movie2.setType("Horror".toUpperCase());
		movie2.setName("A Quiet Place".toUpperCase());
		movie2.setYear(2018);
		movie2.setScore(6.9f);
		movie2.setCountry("USA".toUpperCase());
		
		movieDao.save(movie2);
		
		Movie movie3 = new Movie();
		movie3.setType("Animated".toUpperCase());
		movie3.setName("Zootopia".toUpperCase());
		movie3.setYear(2016);
		movie3.setScore(7.9f);
		movie3.setCountry("USA".toUpperCase());
		
		movieDao.save(movie3);
		
		Movie movie4 = new Movie();
		movie4.setType("Adventure".toUpperCase());
		movie4.setName("Jumanji".toUpperCase());
		movie4.setYear(2017);
		movie4.setScore(6.4f);
		movie4.setCountry("USA".toUpperCase());
		
		movieDao.save(movie4);
		
		Movie movie5 = new Movie();
		movie5.setType("Thriller".toUpperCase());
		movie5.setName("Miss Sloane".toUpperCase());
		movie5.setYear(2016);
		movie5.setScore(9.1f);
		movie5.setCountry("USA and France".toUpperCase());
		
		movieDao.save(movie5);

		Movie movie6 = new Movie();
		movie6.setType("Drama".toUpperCase());
		movie6.setName("Dangal".toUpperCase());
		movie6.setYear(2016);
		movie6.setScore(9.2f);
		movie6.setCountry("India".toUpperCase());
		
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
