package org.ntubook.movie.dao;

import java.util.List;

import org.ntubook.movie.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<Movie,Long> {

	public List<Movie> findByYearLessThanEqual(Integer yearlessthanequal);
}
