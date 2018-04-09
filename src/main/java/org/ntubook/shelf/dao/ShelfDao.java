package org.ntubook.shelf.dao;

import java.util.List;


import org.ntubook.shelf.entity.Shelf;
import org.springframework.data.repository.CrudRepository;

public interface ShelfDao extends CrudRepository<Shelf,Long>{
	
	public List<Shelf> findByNameLike(String nameLike);
}


