package com.bnpp.kata.developmentbooks;

public class Book {
	private double price;
	private int quantity;

	public Book(double price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}
