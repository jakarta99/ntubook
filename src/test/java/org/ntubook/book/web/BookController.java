package org.ntubook.book.web;

import org.ntubook.book.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller 

public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	public String list() {
		return "/book/list";
		
	}
	public String add() {
		return "/book/add";
		
	}
	public String edit() {
		return "/book/edit";
		
	}
}
