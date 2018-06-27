package org.ntubook.book.web;

import java.util.Arrays;

import org.assertj.core.util.Lists;
import org.ntubook.book.dao.BookDao;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/books")
public class BookController {

	private static final String String = null;
	@Autowired
	private BookDao bookDao;
	
	
	@GetMapping
	@ResponseBody
	public AjaxResponse query() {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(Lists.newArrayList(bookDao.findAll()));
		ajaxResponse.setMessages(null);
		
		return ajaxResponse;
	}
	
	@RequestMapping("/list")
	public String listPage() {
		return "/bookList";
	}
	
	@RequestMapping("/add")
	public String addPage() {
		return "/bookAdd";
	}
	
	@RequestMapping("/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("model", bookDao.findById(id).get());
		
		return "/bookEdit";
	}
	/*
	@RequestMapping("/search")
	@ResponseBody
	public AjaxResponse querySearch(@RequestParam("allsearch") String allsearch) {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(Lists.newArrayList(bookDao.findByNameLike(allsearch)));
		ajaxResponse.setMessages(null);
		
		return ajaxResponse;
		
	}
	*/
	@GetMapping("/hot3")
	@ResponseBody
	public AjaxResponse queryHot3() {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(Lists.newArrayList(bookDao.findTop3ByOrderByViewCountDesc()));
		ajaxResponse.setMessages(null);
		
		return ajaxResponse;
		
	}
	
	
	@GetMapping("/findByCollege")
	@ResponseBody
	public AjaxResponse queryFindByCollege(@RequestParam("college")String college) {
		
		
		log.debug("college:"+college);
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		
		
		switch(college) {
		case "M":
			ajaxResponse.setData(Lists.newArrayList(bookDao.findByCollegeIn(Arrays.asList("管理學院", "社會科學院", "文學院","法學院"))));
			break;
		case "E":
			ajaxResponse.setData(Lists.newArrayList(bookDao.findByCollegeIn(Arrays.asList("理學院", "工學院", "電機資訊學院", "生物資源暨農學院"))));
			break;
		case "H":
			ajaxResponse.setData(Lists.newArrayList(bookDao.findByCollegeIn(Arrays.asList("公共衛生學院", "生命科學院", "醫學院","其他"))));
			break;
		default:
			ajaxResponse.setData(null);
			
		} 
		ajaxResponse.setMessages(null);
		
		
		return ajaxResponse;
		
	}
	
	@DeleteMapping
	@ResponseBody
	public AjaxResponse del(@RequestBody Book book) {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		bookDao.deleteById(book.getId());
		
		return ajaxResponse;
	}
	
	@PostMapping
	@ResponseBody
	public AjaxResponse insert(@RequestBody Book book) {
		
		
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		log.debug("{}", book);
		bookDao.save(book);
		
		return ajaxResponse;
	}
	
	
	@PutMapping
	@ResponseBody
	public AjaxResponse update(@RequestBody Book book) {
		
		log.debug("{}", book);
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		Book dbBook = bookDao.findById(book.getId()).get();
		
		dbBook.setName(book.getName());
		dbBook.setPrice(book.getPrice());
		dbBook.setProfessor(book.getProfessor());
		
		bookDao.save(dbBook);
		
		return ajaxResponse;
	}
	
}
