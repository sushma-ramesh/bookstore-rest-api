package com.example.bookstore.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Book book;

    private Date orderDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Order(Long id, Customer customer, Book book, Date orderDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.book = book;
		this.orderDate = orderDate;
	}

	public Order() {
		super();
		
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", book=" + book + ", orderDate=" + orderDate + "]";
	}

    
    
}
