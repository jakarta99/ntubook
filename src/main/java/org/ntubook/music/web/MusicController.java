package org.ntubook.music.web;

import org.assertj.core.util.Lists;
import org.ntubook.music.entity.Music;
import org.ntubook.common.ajax.AjaxResponse;
import org.ntubook.music.dao.MusicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/music") 

public class MusicController {

	@Autowired
	private MusicDao musicDao;
	
	@RequestMapping("/list")
	public String listPage() {
		return "/musicList";
	}

	@RequestMapping("/add")
	public String addPage() {
		return "/musicAdd";
	}
	
	@RequestMapping("/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("model", musicDao.findById(id).get());
		
		return "/musicEdit";
	}
	
	@GetMapping
	@ResponseBody
	public AjaxResponse query() {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		ajaxResponse.setData(Lists.newArrayList(musicDao.findAll()));
		ajaxResponse.setMessages(null);
		
		return ajaxResponse;
	}
	
	
	@DeleteMapping
	@ResponseBody
	public AjaxResponse del(@RequestBody Music music) {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		musicDao.deleteById(music.getId());
		
		return ajaxResponse;
	}
	
	//insert
	@PostMapping
	@ResponseBody
	public AjaxResponse insert(@RequestBody Music music) {
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		log.debug("{}", music);
		musicDao.save(music);
		
		return ajaxResponse;
	}
	
	//update
	@PutMapping
	@ResponseBody
	public AjaxResponse update(@RequestBody Music music) {
		
		log.debug("{}", music);
		
		AjaxResponse ajaxResponse = new AjaxResponse();
		
		Music dbMusic = musicDao.findById(music.getId()).get();
		
		dbMusic.setName(music.getName());
		dbMusic.setPrice(music.getPrice());
		dbMusic.setLength(music.getLength());

		
		musicDao.save(dbMusic);
		
		return ajaxResponse;
	}
	
}