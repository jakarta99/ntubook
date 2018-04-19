package org.ntubook.movie.dao;

import java.util.List;

import org.ntubook.movie.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<Movie,Long> {
	
	public List<Movie> findByNameLike(String nameLike);
	public List<Movie> findByYearLessThanEqual(Integer yearLessThanEqual);
	public List<Movie> findByTypeLike(String typeLike);
	public List<Movie> findByScoreGreaterThanEqual(Float scoreGreaterThanEqual);
	public List<Movie> findByCountryLike(String countryLike);
	public List<Movie> findByYearAndScoreGreaterThanEqual(Integer year, Float scoreGreaterThanEqual);
}
