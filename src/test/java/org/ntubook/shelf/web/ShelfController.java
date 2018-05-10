package org.ntubook.shelf.web;

import org.ntubook.shelf.dao.ShelfDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/shelfs")
public class ShelfController {
	
	@Autowired
	private ShelfDao shelfDao;
	
	@RequestMapping("/list")
	public String listPage() {
		return "/shelfList";
	}
	
	@RequestMapping("/add")
	public String addPage() {
		return "/shelfAdd";
		
	}
	
	@RequestMapping("/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("model", shelfDao.findById(id).get());
		
		return "/shelfEdit";
		
	}
	
	

}
