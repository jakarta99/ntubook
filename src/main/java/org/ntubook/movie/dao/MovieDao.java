package org.ntubook.movie.dao;

import org.ntubook.movie.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieDao extends CrudRepository<Movie,Long> {

}