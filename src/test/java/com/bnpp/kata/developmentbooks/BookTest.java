package com.bnpp.kata.developmentbooks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {
	@Test
	public void getPrice() {
		Book book = new Book(50.0, 1);

		Double actualPrice = book.getPrice();

		assertEquals(new Double(50.0), actualPrice);
	}

	@Test
	public void getQuantity() {
		Book book = new Book(50.0, 1);

		int totalQunatity = book.getQuantity();

		assertEquals(1, totalQunatity);
	}
}
