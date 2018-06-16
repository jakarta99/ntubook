package org.ntubook;


import org.ntubook.book.dao.BookDao;
import org.ntubook.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@Autowired
	private BookDao bookDao;

	@RequestMapping("/")
	public String indexPage() {
		return "/index";
	}
	
	
	@RequestMapping("/bookDetail")
	public String bookDetail(@RequestParam("id") Long bookId, Model model) {
		
		Book thisBook = bookDao.findById(bookId).get();
		System.out.println(thisBook);
		
		thisBook.setViewCount(thisBook.getViewCount()+1);
		bookDao.save(thisBook);
		
		model.addAttribute("entity", thisBook);
		
		return "/bookDetail";
	}
	
	@RequestMapping("/bookOrder")
	public String bookOrder(@RequestParam("id") Long bookId, Model model) {
		
		Book thisBook = bookDao.findById(bookId).get();
		System.out.println(thisBook);
		
		thisBook.setSellerId(thisBook.getSellerId());
		bookDao.save(thisBook);
		
		model.addAttribute("entity", thisBook);
		
		return "/bookOrder";
	}
}
