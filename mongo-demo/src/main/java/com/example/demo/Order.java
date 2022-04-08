package com.example.demo;
import java.math.BigInteger;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("orders")
public class Order {
	@MongoId
	private String id;
	private String item;
	private float price;
	private BigInteger contact;
	

	public BigInteger getContact() {
		return contact;
	}

	public void setContact(BigInteger contact) {
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return item;

	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {

		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}