package org.ntubook.book.web;

import org.ntubook.book.dao.BookDao;
import org.ntubook.book.entity.Book;
import org.ntubook.common.ajax.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/newbook")
public class SendBookController {
	@Autowired
	private BookDao bookDao;

	
	@PostMapping
	@ResponseBody
	public AjaxResponse insert(@RequestBody Book book) {
		
		
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		log.debug("{}", book);
		bookDao.save(book);
		
		return ajaxResponse;
	}
	
}
