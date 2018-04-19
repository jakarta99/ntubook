package org.ntubook.movie.web;

import org.ntubook.movie.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class MovieController {
	
	@Autowired
	private MovieDao movieDao;
}
