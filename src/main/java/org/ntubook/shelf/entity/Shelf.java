package org.ntubook.shelf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHELF")
public class Shelf {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "HEIGHT")
	private Integer height;
	@Column(name = "WIDTH")
	private Integer width;
	@Column(name = "LENTH")
	private Integer lenth;
	
	@Override
	public String toString() {
		return "Shelf [id=" + id + ", name=" + name + ", height=" + height +", width="+ width + ",lenth"+ lenth + "]";
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

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getLenth() {
		return lenth;
	}

	public void setLenth(Integer lenth) {
		this.lenth = lenth;
	}
	
	
	
	
	
	

}
