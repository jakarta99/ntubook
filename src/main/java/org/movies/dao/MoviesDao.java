package org.movies.dao;

import org.movies.entity.Movies;

import org.springframework.data.repository.CrudRepository;

public interface MoviesDao extends CrudRepository<Movies,Long> {

}

