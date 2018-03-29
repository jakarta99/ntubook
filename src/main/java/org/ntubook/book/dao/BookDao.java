package org.ntubook.book.dao;

import org.ntubook.book.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book,Long> {

}
