package com.bnpp.kata.developmentbooks;

public class ShoppingBasketItem {
	private Book book;
	private int bookQty;

	public ShoppingBasketItem(Book book, int bookQty) {
		this.book = book;
		this.bookQty = bookQty;
	}

	public Book getBook() {
		return book;
	}

	public int getQuantity() {
		return bookQty;
	}

	public void changeQuantity(int bookQty) {
		this.bookQty = bookQty;

	}

}
