package org.ntubook.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ORDER")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	
	@Column(name = "BOOK_ID")
	private Long bookId;
	
	@Column(name = "BUYER_ID")
	private Long buyerId;
	
	// order.id = 1; bookId : 1 , buyerId : 1 (-100)
	// order.id = 2; bookId : 1 , buyerId : 2 (-50)
	// order.id = 3; bookId : 1 , buyerId : 3 (-200)
	// order.id = 4; bookId : 2 , buyerId : 1
	// order.id = 5; bookId : 2 , buyerId : 3
	
}
