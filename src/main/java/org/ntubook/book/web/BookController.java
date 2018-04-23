package org.ntubook.book.web;

import java.util.List;

import org.assertj.core.util.Lists;
import org.ntubook.book.dao.BookDao;
import org.ntubook.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/edit")
	public String editPage() {
		return "/bookEdit";
	}
	
	@GetMapping
	@ResponseBody
	public List<Book> query() {
		return Lists.newArrayList(bookDao.findAll());
	}
	
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public String del(@PathVariable("id") Long id) {
		bookDao.deleteById(id);
		
		return "OK";
	}
	
}
