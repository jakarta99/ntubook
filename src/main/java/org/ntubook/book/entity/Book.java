package org.ntubook.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "BOOK")
@Data //lombok
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PRICE")
	private Integer price;
	@Column(name = "PROFESSOR")
	private String professor;
	
	
	@Column(name = "VIEW_COUNT")
	private Integer viewCount;
	@Column(name = "COURSE_NAME")
	private String courseName;
	@Column(name = "COLLEGE")
	private String college;
	@Column(name = "DISCOUNT")
	private Integer discount;
	@Column(name = "NOTES_ON")
	private String notesOn;
	@Column(name = "HOW_NEW")
	private String howNew;
	@Column(name = "MESSAGES")
	private String messages;
	
	
	@Column(name = "SELLER_ID")
	private Long sellerId;
	@Column(name = "BUYER_ID")
	private Long buyerId;
	@Column(name = "CURRENT_STATUS")
	private String currentStatus;
	
	
	@Column(name = "ACCOUNT")
	private String account;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "SCHOOL_NUMBER")
	private String schoolNumber;
	@Column(name = "NICK_NAME")
	private String nickName;
	
	
	/*
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", professor=" + professor + "]";
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	*/
}
