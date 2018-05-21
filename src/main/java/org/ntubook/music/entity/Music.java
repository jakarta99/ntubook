package org.ntubook.music.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.ntubook.book.entity.Book;

import lombok.Data;

@Entity
@Table(name = "Music")
@Data //lombok
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private String price;
	@Column(name = "LENGTH")
	private Integer length;
	
	
	/*
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getMusician() {
		return musician;
	}
	public void setMusician(String musician) {
		this.musician = musician;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}*/
}	