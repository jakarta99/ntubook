package org.ntubook.book.web;

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
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/books") 
public class BookController {

	@Autowired
	private BookDao bookDao;
	
	
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
	
	@GetMapping
	@ResponseBody
	public AjaxResponse query() {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(Lists.newArrayList(bookDao.findAll()));
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
