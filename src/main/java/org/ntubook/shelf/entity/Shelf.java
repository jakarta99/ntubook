package org.ntubook.shelf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "SHELF")
@Data //lombok.jar APT技術
public class Shelf {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESIGNER")
	private String designer;
	@Column(name = "HEIGHT")
	private Integer height;
	@Column(name = "WIDTH")
	private Integer width;
	@Column(name = "LENGTH")
	private Integer length;
	
	/*@Override
	public String toString() {
		return "Shelf [id= " + id + ", name= " + name + ", designer= "+ designer + ", height= " + height +", width= "+ width + ",lenth= "+ lenth + "]";
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
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
	*/
	
	
	
	
	

}
