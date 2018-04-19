package org.ntubook.shelf.dao;

import java.util.List;


import org.ntubook.shelf.entity.Shelf;
import org.springframework.data.repository.CrudRepository;

public interface ShelfDao extends CrudRepository<Shelf,Long>{
	
	public List<Shelf> findByNameLike(String nameLike);
	public List<Shelf> findByHeightLessThanEqual(Integer heightLessThanEqual);
	public List<Shelf> findByWidthGreaterThan(Integer widthGreaterThan);
	public List<Shelf> findByNameOrderByHeightDesc(String nameOrderByHeight);
	public List<Shelf> findByLenthOrderByNameDesc(Integer lenthOrderByName);
	public List<Shelf> findByNameAndDesigner(String name, String designer);
}


