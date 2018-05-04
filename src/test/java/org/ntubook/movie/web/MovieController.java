package org.ntubook.movie.web;

import org.ntubook.book.dao.BookDao;
import org.ntubook.movie.dao.MovieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller

public class MovieController {
	
	@Autowired
	private MovieDao movieDao;

	public String list() {
		return "/movie/list";
		
	}
	public String add() {
		return "/movie/add";
		
	}
	public String edit() {
		return "/movie/edit";
	
	}
}
