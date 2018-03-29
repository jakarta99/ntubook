package org.ntubook.shelf.dao;

import org.ntubook.shelf.entity.Shelf;
import org.springframework.data.repository.CrudRepository;

public interface ShelfDao extends CrudRepository<Shelf,Long>{

}


