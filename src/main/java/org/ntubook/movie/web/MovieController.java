package org.ntubook.movie.web;

import org.assertj.core.util.Lists;
import org.ntubook.movie.dao.MovieDao;
import org.ntubook.movie.entity.Movie;
import org.ntubook.book.entity.Book;
import org.ntubook.common.ajax.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/movies")

public class MovieController {
	
	@Autowired
	private MovieDao movieDao;
	
	
	@RequestMapping("/list")
	public String listPage() {
		return "/movieList";
	}
	
	@RequestMapping("/add")
	public String addPage() {
		return "/movieAdd";
	}
	
	public String edit() {
		return "/movieEdit";
	
	}
	
	@GetMapping
	@ResponseBody
	public AjaxResponse query() {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(Lists.newArrayList(movieDao.findAll()));
		ajaxResponse.setMessages(null);
		
		return ajaxResponse;
	}
	
	@PostMapping
	@ResponseBody
	public AjaxResponse insert(@RequestBody Movie movie) {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		log.debug("{}", movie);
		movieDao.save(movie);
		
		return ajaxResponse;
	}
	
}
