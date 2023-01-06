package com.example.electronicshop.domain;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class electronic {
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String productname;
    private String quantity;
    private int price;
	public electronic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public electronic(Long id, String productname, String quantity, int price) {
		super();
		this.id = id;
		this.productname = productname;
		this.quantity = quantity;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "electronic [id=" + id + ", productname=" + productname + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
    

}
