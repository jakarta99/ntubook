package org.ntubook.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "MOVIE")
@Data
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "TYPE" )
	private String type;
	@Column(name = "YEAR" )
	private Integer year;
	@Column(name = "SCORE" )
	private Float score;
	@Column(name = "COUNTRY" )
	private String country;
	
	
	
	
	/*
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", type=" + type + ", year=" + year + ", score=" + score
				+ ", country=" + country + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	*/

}