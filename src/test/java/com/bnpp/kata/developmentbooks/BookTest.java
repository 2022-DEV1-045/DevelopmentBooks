package com.bnpp.kata.developmentbooks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookTest {
	@Test
	public void getPrice() {
		Book book = new Book();

		Double actualPrice = book.getPrice();

		assertEquals(new Double(50.0), actualPrice);
	}
}
