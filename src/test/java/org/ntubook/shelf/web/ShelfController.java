package org.ntubook.shelf.web;

import org.ntubook.shelf.dao.ShelfDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShelfController {
	
	@Autowired
	private ShelfDao shelfDao;
	
	public String list() {
		return "/shelf/list";
		
	}
	public String add() {
		return "/shelf/add";
		
	}
	public String edit() {
		return "/shelf/edit";
		
	}
	
	

}
