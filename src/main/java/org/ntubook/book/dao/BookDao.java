package org.ntubook.book.dao;

import java.util.List;

//import javax.persistence.Column;

import org.ntubook.book.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book,Long> {

	public List<Book> findByNameLike(String nameLike);
	public List<Book> findByPriceLessThan(Integer priceLessThan);
	public List<Book> findByPriceGreaterThanEqual(Integer priceGreaterThanEqual);
	public List<Book> findByPriceOrderByNameDesc(Integer priceOrderByNameDesc);
	public List<Book> findByNameOrderByPriceDesc(String nameOrderByPriceDesc);
	public List<Book> findByNameAndProfessor(String name, String professor);
} 
