package org.ntubook.music.dao;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ntubook.music.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MusicDaoTest {
	
	@Autowired 
	private MusicDao musicDao;

	@Test
	public void testCrud() {
		//findAll
		List<Music> musics = Lists.newArrayList(musicDao.findAll()); 
		for (Music music:musics) {  
			System.out.println(music);  
		}
		System.out.println("------------------------------------------------------");
		
		//insert
		Music music1 = new Music(); 
		music1.setName("Aaa");
		
		musicDao.save(music1);
		
		Music music4 = new Music();
		music4.setName("Bbb");
	
		musicDao.save(music4);
		
		
		//findAll
		musics = Lists.newArrayList(musicDao.findAll()); 
		for (Music music:musics) {
			System.out.println(music);
		}		
		
		//findOne
		System.out.println("------------------**findByNameLike**------------------");
		musics = musicDao.findByNameLike("a%");
		for (Music music:musics) {
			System.out.println(music);
		}
		
		
		
		//update
		Music music2 = new Music();
		music2.setId(1L);
		music2.setName("Ccc");
		
		musicDao.save(music2);
		
		//findAll
		musics = Lists.newArrayList(musicDao.findAll()); 
		for (Music music:musics) {
			System.out.println(music);
		}
		System.out.println("----------------------------------------------------");
		
		//delete
		Music music3 = new Music();
		music3.setId(1L);
		musicDao.delete(music3);
		
		//findAll
		musics = Lists.newArrayList(musicDao.findAll()); 
		for (Music music:musics) {
			System.out.println(music);
		}
		System.out.println("----------------------------------------------------");
		
		
	}

}
