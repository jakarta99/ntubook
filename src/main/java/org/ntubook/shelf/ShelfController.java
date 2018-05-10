package org.ntubook.shelf;



import org.assertj.core.util.Lists;
import org.ntubook.common.ajax.AjaxResponse;
import org.ntubook.shelf.dao.ShelfDao;
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
@RequestMapping("/shelfs")
public class ShelfController<Shelf> {
	
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
	@GetMapping
	@ResponseBody
	public AjaxResponse query() {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(Lists.newArrayList(shelfDao.findAll()));
		ajaxResponse.setMessages(null);
		
		return ajaxResponse;
	}
	
	
	@DeleteMapping
	@ResponseBody
	public AjaxResponse del(@RequestBody Shelf shelf) {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ShelfDao.deleteById(shelf.getId());
		
		return ajaxResponse;
	}
	
	@PostMapping
	@ResponseBody
	public AjaxResponse insert(@RequestBody SHELF shelf) {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		log.debug("{}", shelf);
		shelfDao.save(shelf);
		
		return ajaxResponse;
	}
	
	
	@PutMapping
	@ResponseBody
	public AjaxResponse update(@RequestBody Shelf shelf) {
		
		log.debug("{}", shelf);
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		Shelf dbShelf = shelfDao.findById(shelf.getId()).get();
		
		dbShelf.setName(shelf.getName());
		dbShelf.setDesigner(shelf.getDesigner);
		dbShelf.setHeight(shelf.getHeight());
		dbShelf.setWidth(shelf.getWidth());
		dbShelf.setLength(shelf.getLength());
		
		shelfDao.save(dbShelf);
		
		return ajaxResponse;
	}

	
	

}
