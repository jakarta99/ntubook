package org.ntubook.music.dao;

import org.ntubook.music.entity.Music;
import org.springframework.data.repository.CrudRepository;

public interface MusicDao extends CrudRepository<Music,Long>{

}
